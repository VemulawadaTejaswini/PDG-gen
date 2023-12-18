/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author yoovraj.shinde
 */
public class Main {
    public static void main(String[] args) {
    //        if (true) return;
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n  = in.nextInt();
        int[] num = new int[n];
        for (int i = 0 ; i < n; i++) {
            num[i] = in.nextInt();
        }
        Integer[] idx = new Integer[n];
        int max_idx = 0;
        int start_idx = 0;
        int end_idx = n-1;
        boolean[] checked = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (num[o2] == num[o1]) {
                    return o2 - o1;
                } else {
                    return num[o2] - num[o1];
                }
            }
        });
//        System.out.println("---");
        int totalHappiness = 0;
        for (int i = 0; i < n; i++) {
//            System.out.println("checked = " + Arrays.toString(checked));
//            System.out.println("idx[ " + i + " ] = " + idx[i]);
            // index of max number = idx[i]
            if (!checked[idx[i]]) {
                // check which is farther, start /end
                if (Math.abs(idx[i] - start_idx) > Math.abs(idx[i] - end_idx)) {
                    // start is farther,
                    checked[idx[i]] = true;
                    checked[start_idx] = true;
                    totalHappiness += Math.abs(idx[i] - start_idx) * (num[idx[i]] + num[start_idx]);
//                    System.out.println("inx   pair = " + idx[i] + " , " + start_idx );
//                    System.out.println("start pair = " + num[idx[i]] + " , " + num[start_idx] );
                    start_idx ++;
                } else {
                    // end is farther
                    checked[idx[i]] = true;
                    checked[end_idx] = true;
                    totalHappiness += Math.abs(idx[i] - end_idx) * (num[idx[i]] + num[end_idx]);
//                    System.out.println("inx pair = " + idx[i] + " , " + end_idx );
//                    System.out.println("end pair = " + num[idx[i]] + " , " + num[end_idx] );
                    end_idx --;
                }
            }
//            System.out.println("happiness = " + totalHappiness);
        }
//        System.out.println("totalHappiness = " + totalHappiness);
        System.out.println(totalHappiness);
    }

}
