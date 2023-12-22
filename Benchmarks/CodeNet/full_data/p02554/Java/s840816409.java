//package com.company;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

      //  System.out.println("Hello World");
        // System.out.println("This is my first package ");
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long m=1000000007;
        long res;

        long a=((n*(n-1))%m);
        long b=((long)(Math.pow(10,(n-2)))%m);
        res=((a*b)%m);

       if(n==1)
             {
               res=0;
             }
             if(n==2)
             {
               res=2;
             }
             System.out.println(res);

    }
}
