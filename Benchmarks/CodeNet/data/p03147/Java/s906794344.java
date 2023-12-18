//package atcoder;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int start = 0;
        int ans = 0;
        while(true) {
            start = 0;
            int count = 0;
            while(count < n && arr[start] == 0) {
                start++;
                count++;
            }

            if(count == n) {
                break;
            }

            int i = start;
            int min = Integer.MAX_VALUE;
            while(i < n && arr[i] != 0) {

                min = Math.min(arr[i], min);
                i++;
            }

            int j = start;
            while(j < i) {
                arr[j] -= min;
                j++;
            }
            ans += min;
        }
        System.out.println(ans);
    }
}
