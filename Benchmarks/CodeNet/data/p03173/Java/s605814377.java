import java.util.*;
import java.io.*;
public class Main
{
    public static long query(long[] arr, int i, int j){
        if(i == 0){
            return arr[j];
        }
        return arr[j] - arr[i-1];
    }
    public static long solve(long[] prefix, int i, int j, long[][] dp){
        if(i >= j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = Long.MAX_VALUE;
        for(int k = i; k <= j; k++){
            dp[i][j] = Math.min(dp[i][j], solve(prefix, i, k, dp) + solve(prefix, k+1, j, dp) + query(prefix, i, k) + query(prefix, k+1, j));
        }
        return dp[i][j];
    }
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] s = br.readLine().trim().split(" ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = Integer.parseInt(s[i]);
		}
		long[] prefix = new long[n];
		prefix[0] = arr[0];
		for(int i = 1; i < n; i++){
		    prefix[i] = prefix[i-1] + arr[i];
		}
		long[][] dp = new long[n+1][n+1];
		for(int i = 0; i < dp.length; i++){
		    for(int j = 0; j < dp.length; j++){
		        dp[i][j] = -1;
		    }
		}
		System.out.println(solve(prefix, 0, n-1, dp));
	}
}
