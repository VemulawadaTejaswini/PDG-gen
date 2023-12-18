//package com.beginner.b051;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int S = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=K;i++){
            if(K-i>=0&&i+K+K>=S){
                sum += K-i+1;
            }
        }
       System.out.println( sum);
        sc.close();
    }

}
