import java.util.*;
    import java.io.*;
    public class Main
    {
        public static int solve(int[][] arr, int n, int prev, int[][] dp){
            if(n < 0){
                return 0;
            }
            if(dp[n][prev+1] > 0){
                return dp[n][prev+1];
            }
            int ans = Integer.MIN_VALUE;
            if(prev != 0){
                ans = Math.max(ans, arr[n][0] + solve(arr, n-1, 0, dp));
            }
            if(prev != 1){
                ans = Math.max(ans, arr[n][1] + solve(arr, n-1, 1, dp));
            }
            if(prev != 2){
                ans = Math.max(ans, arr[n][2] + solve(arr, n-1, 2, dp));
            }
            return dp[n][prev+1] = ans;
        }
    	public static void main(String[] args) throws Exception{
            StringTokenizer str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][3];
            for(int i = 0; i < arr.length; i++){
                int j = 0;
                str = new StringTokenizer(br.readLine()," ");
                while(str.hasMoreTokens()){
                    arr[i][j] = Integer.parseInt(str.nextToken());
                    j++;
                }
            }
            int[][] dp = new int[n+1][4];
           System.out.println(solve(arr, n-1, -1, dp));            
        }
    }