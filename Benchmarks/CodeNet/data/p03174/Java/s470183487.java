import java.util.*;
import java.io.*;
public class Main {
    public static long dp[][];
    public static long solve(long arr[][] , int i , int womenSubset){
        if(i == arr.length && womenSubset == 0) return 1;
        if(i == arr.length && womenSubset > 0) return 0;

        if(dp[i][womenSubset] != 0) return dp[i][womenSubset];

        long ans = 0;
        for(int j = 0 ; j < arr.length ; j++){
            int bit = 1<<j;
            // System.out.println("womenSubset = " + womenSubset + " bit = " + bit + " j&bit = " + (womenSubset&bit));
            if((womenSubset&bit) >= 1 && arr[i][j] == 1){
                ans += solve(arr , i + 1 , womenSubset^bit);
            }
        }
        return dp[i][womenSubset] = ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[][] = new long[n][n];
        dp = new long[n+1][1<<n];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(solve(arr , 0 , (1<<n)-1));
    }
}