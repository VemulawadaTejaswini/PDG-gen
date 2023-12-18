import java.util.*;
import java.io.*;
public class Main {
    public static int solve(int n , int k , int arr[]){

        int dp[] = new int[n];

        for(int i = 1 ; i < n ; i++){
            int ans = Integer.MAX_VALUE;
            for(int j = i-1 ; j >= 0 && (i-j) <= k ; j--){
                int diff = Math.abs(arr[i] - arr[j]);
                ans = Math.min(ans , diff + dp[j]);
            }
            dp[i] = ans;
        }

        return dp[n-1];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(solve(n , k , arr));
    }
}