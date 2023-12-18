
import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long s = System.currentTimeMillis();
        int n = Integer.valueOf(in.readLine());
        String[] astr = in.readLine().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < astr.length; i++){
            a[i] = Integer.parseInt(astr[i]);
        }

        long[][][] dp = new long[n][n][2]; // dp[i][j] -> x - y value in i to j

        for(int i = 0; i < n; i++){
            dp[i][i][0] = a[i];
            dp[i][i][1] = -a[i];
        }

        for(int i = n-1; i >= 0; i--){
            for(int j = i+1; j < n; j++){
                if(i < n-1 && j >= 1){
                    dp[i][j][0] = Math.max(a[i]+ dp[i+1][j][1],a[j] + dp[i][j-1][1]);
                    dp[i][j][1] = Math.min(- a[i]+ dp[i+1][j][0],- a[j] + dp[i][j-1][0]);
                }
                else if(i < n-1){
                    dp[i][j][0] = a[i]+ dp[i+1][j][1];
                    dp[i][j][1] = a[i]+ dp[i+1][j][0];
                }
                else if(j > 1){
                    dp[i][j][0] = a[j] + dp[i][j-1][1];
                    dp[i][j][1] = a[j] + dp[i][j-1][0];
                }
            }
        }
 long e = System.currentTimeMillis();
//        System.out.println((e-s));
        System.out.println(dp[0][n-1][0]);
    }
}