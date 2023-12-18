//package com.beginner.b047;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int [] prices = new int [N];


        prices[0] = sc.nextInt();
        int max_num = prices[0] ;
        int max_num_pos = 0;
        int min_num = prices[0] ;
        int min_num_pos =0;
        for(int i=1;i<N;i++){
            prices[i]=sc.nextInt();
            if(prices[i]<min_num){
                min_num = prices[i];
                min_num_pos = i;
            }
            if(prices[i]>max_num){
                max_num = prices[i];
                max_num_pos = i;
            }
        }

        if(min_num_pos<max_num_pos){
            System.out.println(1);
        }
        else {

            int max = 0;
            int max_cnt = 0;
            int max_pos = max_num_pos;

            for (int i = 0; i < N; i++) {
                if (i < max_pos) {
                    if (prices[max_pos] - prices[i] > max) {
                        max = prices[max_pos] - prices[i];
                        max_cnt = 1;
                    }
                } else {
                    for (int j = i + 1; j < N; j++) {
                        if (prices[j] - prices[i] == max) {
                            max_cnt++;
                            max_pos = j;
                        } else if (prices[j] - prices[i] > max) {
                            max = prices[j] - prices[i];
                            max_cnt = 1;
                            max_pos = j;
                        }
                        
                        if(prices[max_pos]<max){
                            j=N;
                        }
                    }
                }
            }

            System.out.println(max_cnt);
        }
        sc.close();

    }

}
