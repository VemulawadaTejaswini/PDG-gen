/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; ++i) {
            p[i] = sc.nextInt();
        }
       int count = 0;

        for (int i = 0; i < N; i++) {
            if (p[i] == i + 1 ||
                    ( i < N - 1 && p[i + 1] == i + 2)) {
                if (i < N - 1){
                    count++;
                    i++;
                }
                else{
                    count++;
                    i++;
                }
            }

        }
        System.out.println(count);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
         
    }

}
