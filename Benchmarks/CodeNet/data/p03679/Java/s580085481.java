package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

        if(x < a){
            System.out.println("delicious");
        } else if(x < b){
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
