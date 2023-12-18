import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            dp[i] = 2 * n;
        }

        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            dp[i + 1] = Math.min(dp[i+1],dp[i] + 1);
            for(int j = 1; j < n; j++) {
                int tmp = i + (int)Math.pow(6,j);
                if(tmp > n) break;
                dp[tmp] = Math.min(dp[tmp],dp[i]+1);
            }
            for(int j = 1; j < n; j++) {
                int tmp = i + (int)Math.pow(9,j);
                if(tmp > n) break;
                dp[tmp] = Math.min(dp[tmp],dp[i]+1);
            }            
        }

        System.out.println(dp[n]);
        





    }
}