import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] hl = new long[n];
        for(int i = 0; i < n; i++){
            hl[i] = sc.nextLong();
        }
        long[] dp = new long[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < n; i++){
            int min = Math.min(k,n-i-1);
            for(int j = i+1; j <= i+min; j++){
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(hl[j] - hl[i]));
            }
        }
        System.out.println(dp[n-1]);
    }
}