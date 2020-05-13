package com.match10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class LoginController {

//    @RequestMapping(value="/user/login",method="RequestMethod.POST")
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map){
        if(StringUtils.isEmpty(username) && "123456".equals(password)){
            return "login_index";
        }else{
            map.put("msg","用户名或密码错误!");
            return "index";
        }
    }
}
