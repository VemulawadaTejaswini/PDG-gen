package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[2*n];
        for(int a_i=0; a_i < 2*n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int max = 0;
        for (int i = 0; i < 2*n; i += 2) {
            max += a[i];
        }
        System.out.println(max);
    }
}
