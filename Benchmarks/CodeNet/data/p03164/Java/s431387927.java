import java.math.*;
import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] l1 = br.readLine().split(" ");
        int N = Integer.parseInt(l1[0]);
        int W = Integer.parseInt(l1[1]);
 
        long[] wt = new long[N];
        long[] val = new long[N];
 
        for(int i = 0; i < N; i++){
            String[] l2 = br.readLine().split(" ");
            wt[i] = Long.parseLong(l2[0]);
            val[i] = Long.parseLong(l2[1]);
        }
 
        long[][] dp = new long[wt.length][W + 1];
 
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <dp[i].length; j++){
                if(i == 0){
                    if(j == 0){
                        dp[i][j] = 0;
                        continue;
                    }
                    if(wt[i] <= j){
                        dp[i][j] = val[i];
                    }
                }else{
                    if(j == 0){
                        dp[i][j] = 0;
                        continue;
                    }
                    if(j < wt[i]){
                        dp[i][j] = dp[i - 1][j];
                        continue;
                    }
                    if(wt[i] < j){
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - (int)wt[i]] + val[i]);
                    }
                }
            }
        }
        System.out.println(dp[wt.length - 1][W]);
    }
}