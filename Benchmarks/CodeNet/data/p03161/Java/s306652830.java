import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextLong();
        long[] dp = new long[n];
        Arrays.fill(dp, 1000000000);
        if (k >= n) {
            System.out.println(Math.abs(arr[n-1]-arr[0]));
        } else {
            for (int i=0; i<=k; i++) {
                dp[i] = Math.abs(arr[i] - arr[0]);
            }
            for (int i=k+1; i<n; i++) {
                for (int j=i-1; j>=(i-k); j--) {
                    dp[i] = Math.min(dp[i], dp[j]+Math.abs(arr[i]-arr[j]));
                }
            }
            System.out.println(dp[n-1]);
        }
    }
}