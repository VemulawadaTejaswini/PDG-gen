import java.util.*;
import java.io.*;
public class Main {
    public static long dp[][];
    public static int mod = 1000000007;
    public static long solve(long arr[][] , int i , int womenSubset , int n){
        if(i == n+1){
             if(womenSubset == 0) return 1;
             else return 0;
        }

        if(dp[i][womenSubset] != -1) return dp[i][womenSubset];

        long ans = 0;
        for(int women = 0 ; women < n ; women++){
            boolean avail = (((1<<women)&womenSubset) == 0) ? false : true;
            if(avail && (arr[i][women + 1] == 1)){
                ans = (ans + solve(arr , i + 1 , (womenSubset^(1<<women)) , n)%mod)%mod;
            }
        }
        return dp[i][womenSubset] = ans%mod;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[][] = new long[n+1][n+1];

        dp = new long[22][1<<22];

        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0 ; i < 22 ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(arr , 1 , (1<<n)-1 , n));
    }
}