import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Solution {

    public static int frog1(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int[] dp = new int[arr.length];

        for(int i = 1; i < arr.length; i++) {
            if(i == 1) {
                dp[i] = dp[i - 1] + Math.abs(arr[i] - arr[i-1]);
            } else {
                dp[i] = Math.min(dp[i - 1] + Math.abs(arr[i] - arr[i-1]), 
                                dp[i-2] + Math.abs(arr[i] - arr[i-2]));   
            }
        }
        return dp[arr.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(frog1(arr));
  }
}
