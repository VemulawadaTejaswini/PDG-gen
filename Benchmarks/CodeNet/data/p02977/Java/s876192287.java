package com.company;

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;
        if (Algorithm.isNibeki((n))){
            Algorithm.prYesNo(0);
        }else {
            Algorithm.prYesNo(1);
            System.out.println(1 +" " + 2);
            System.out.println(1 +" " + 3);
            System.out.println(3 +" " + (n+2));
            System.out.println((n+1) +" " + (n+2));
            System.out.println(2 +" " + (n+3));
            for (int i = 4; i <= n; i++) {
                if(i == n && i % 2 == 0){
                    b = true;
                }
                    System.out.println(1 + " " + i);
            }
            for (int i = n+4; i <=2*n; i++) {
                if(n%2 == 0 && i == 2*n){
                    break;
                }
                if (Algorithm.isOdd(i-n)){
                    System.out.println(i + " " + (i-n-1));
                }else{
                    System.out.println(i + " " + (i-n+1));
                }
            }

            if(b){
                int nn = n;
                int k = 1;
                while(nn != 1){
                    nn = nn>>1;
                    k = k<<1;
                }
                System.out.println(n + " " + k);
                System.out.println(2*n + " " + (n^1^k) );
            }
        }


        sc.close();
    }
}

class Algorithm{
    public static void prYesNo(int y){
        System.out.println(y == 1 ? "Yes" : "No");
    }
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }

    public static boolean isNibeki(int n){
        if (n==1){
            return true;
        }
        if(n%2==0){
            return isNibeki(n/2);
        }else {
            return false;
        }
    }
}

