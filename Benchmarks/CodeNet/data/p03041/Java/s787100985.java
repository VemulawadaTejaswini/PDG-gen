package com.example.demo.service;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        c[k - 1] = Character.toLowerCase(c[k - 1]);
        System.out.println(String.valueOf(c));
    }
}
