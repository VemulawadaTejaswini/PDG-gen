import java.util.*;
import java.io.*;
public class Main {
    public static long dp[][][];
    public static long solve(long arr[] , int i , int j , int turn){
        if(i > j){
            return 0;
        }
        if(dp[i][j][turn] != -1){
            return dp[i][j][turn];
        }

        if(turn == 1){
            long ans = arr[i] + solve(arr , i+1 , j , 2);
            ans = Math.max(ans , arr[j] + solve(arr , i , j-1 , 2));
            return dp[i][j][turn] = ans;
        }else {
            long ans = solve(arr , i+1 , j , 1);
            ans = Math.min(ans , solve(arr , i , j-1 , 1));
            return dp[i][j][turn] = ans;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[] = new long[n+1];
        dp = new long[n+1][n+1][3];
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= n ; j++){
                for(int k = 0 ; k <= 2 ; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        long sum = 0;
        for(int i = 1 ; i <= n ; i++){
            arr[i] = s.nextLong();
            sum += arr[i];
        }
        long first = solve(arr , 1 , n , 1);
        long second = sum - first;
        System.out.println(first - second);
    }
}