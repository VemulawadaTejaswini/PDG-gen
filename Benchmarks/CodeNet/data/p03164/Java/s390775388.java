import java.util.*;
import java.io.*;
class Main {
    public static long solve(int[] weight, int[] value, int w, int i, long[][] dp){
        if(i >= weight.length || w <= 0){
            return 0;
        }
        if(dp[i%2][w] != -1){
            return dp[i][w];
        }
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, solve(weight, value, w, i+1, dp));
        if(w-weight[i] >= 0){
            ans = Math.max(ans, value[i] + solve(weight, value, w-weight[i], i+1, dp));
        }
        dp[i%2][w] = ans;
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String[] s = br.readLine().trim().split(" ");
  		int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
      	int[] weight = new int[n];
        int[] value = new int[n];
        for(int i = 0; i < n; i++){
        	String[] str = br.readLine().trim().split(" ");
          	weight[i] = Integer.parseInt(str[0]);
          	value[i] = Integer.parseInt(str[1]);
        }
        
        long[][] dp = new long[2][w+1];
        for(int j = 0; j < dp.length; j++){
          for(int k = 0; k < dp[0].length; k++){
            dp[j][k] = -1;
          }
        }
        System.out.println(solve(weight, value, w, 0, dp));
    }
}
