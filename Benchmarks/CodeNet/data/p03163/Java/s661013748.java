import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        
        int[] w = new int[N+1]; 
        long[] v = new long[N+1]; 
         //i番目の品物を、重さがj-w[i]以下になるように選んだ時の価値の最大値
        long[][] dp = new long[N+1][W+1];
        
        //A:0 B:1 C:2
        for(int i = 0; i < N; i++) {
            w[i+1] = Integer.parseInt(sc.next());
            v[i+1] = Integer.parseInt(sc.next());
        }
        
        long ans = 0;
        

        for(int i = 1; i <= N; i++) {
            for(int j = 0; j <= W; j++) {
                if(j-w[i] >= 0) {
                    dp[i][j] = max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
                }else  {
                    dp[i][j] = dp[i-1][j];//j-w[i]のときはi番目の品物は使えない
                }
            }
            
        }
        
        ans = dp[N][W];
        
        System.out.println(ans);
    }
    
    public static long max(long a, long b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static int min(int a, int b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
}