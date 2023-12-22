package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int a[];
    static int answer = 1;

    public static void main(String[] args) {
	// write your code here
        read();
        solve();
        System.out.println(answer);
    }

    public static void read(){
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }
    public static void solve(){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i>=j){
                    continue;
                }
                if(a[j]-a[i]>answer) {
                    answer =a[j]-a[i];
                }
            }
        }
        answer=answer==1?-1:answer;
    }


}