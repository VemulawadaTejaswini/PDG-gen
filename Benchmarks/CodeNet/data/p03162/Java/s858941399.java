/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package here;

/**
 *
 * @author sokumar
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = sc.nextInt();
        int [][]dp = new int[n+1][3];
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<3;j++)
            {
                dp[i][j] = sc.nextInt();
            }
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=0;j<3;j++)
            {
                int max = Math.max(dp[i-1][(j+1)%3],dp[i-1][(j-1+3)%3]);
                dp[i][j]+=max;
            }
        }
        int res = Math.max(dp[n][0],dp[n][1]);
        res = Math.max(res, dp[n][2]);
        w.println(res);
        
        
        
        w.close();
    }
    
}
