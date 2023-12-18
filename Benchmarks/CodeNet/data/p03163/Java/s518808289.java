import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for(int i=0;i<n;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long[][] dp = new long[n+1][W+1];
        for(int i=1;i<=W;i++){
            for(int j=1;j<=n;j++){
                if(w[j-1]<=i){
                    dp[j][i] = Math.max(dp[j][i], Math.max(dp[j-1][i], v[j-1]+dp[j-1][i-w[j-1]]));
                }
                else{
                    dp[j][i] = dp[j-1][i];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}