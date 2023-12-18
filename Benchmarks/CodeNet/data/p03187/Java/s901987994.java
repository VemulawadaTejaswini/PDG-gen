import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        int n = sc.nextInt();
        long[] x = new long[n];
        for(int i=0;i<n;i++) x[i]=sc.nextLong();
        if(n>2000){
            System.out.println("give up");
            return;
        }
        long[][][] dp = new long[n][n][2];
        for(int dif=1;dif<n;dif++){
            for(int i=0;i+dif<n;i++){
                int j = i+dif;
                dp[i][j][0] = Math.max(dp[i+1][j][0]+x[i+1]-x[i],dp[i+1][j][1]+x[i]+L-x[j]);
                dp[i][j][1] = Math.max(dp[i][j-1][1]+x[j]-x[j-1],dp[i][j-1][0]+x[i]+L-x[j]);
            }
        }
        long ans = Math.max(dp[0][n-1][0]+x[0],dp[0][n-1][1]+L-x[n-1]);
        System.out.println(ans);
    }
}
