//package com.company.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;

import static java.lang.Character.isUpperCase;

public class Main {
    public static Scanner key = new Scanner(System.in);
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void solveC()
    {
        int N = key.nextInt();
        String ans = "";
        while(N > 0)
        {
            if(N%26 == 0)
                ans += 'z';
            else
            {
                char c = (char)(96 + N%26);
                ans += c;
            }
            N /= 26;
        }
        ans = reverseString(ans);
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
       /* solveJuice();*/
        //replacing();
        solveC();
    }
}
