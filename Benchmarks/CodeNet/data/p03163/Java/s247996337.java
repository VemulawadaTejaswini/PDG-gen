import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static long knapsack(int N, int W, int[] w, int[] v) {
        long[][] dp = new long[N + 1][W + 1];

        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= W; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if(w[i - 1] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        
        int[] w = new int[N];
        int[] v = new int[N]; 

        for(int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        System.out.println(knapsack(N, W, w, v));
  }
}
