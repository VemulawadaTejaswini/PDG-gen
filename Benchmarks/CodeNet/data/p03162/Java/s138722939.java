import java.util.*;
import java.io.*;
class Main {
    
    public static long memo(int[][] arr, int n, int prev, long[][] memo){
        if(n < 0)
            return 0;
        if(memo[n][prev+1] > 0)
            return memo[n][prev+1];
        long ans = Long.MIN_VALUE;
       if(prev != 0)
        ans = Math.max(ans,arr[n][0] + memo(arr,n-1,0,memo));
    if(prev != 1)
    ans = Math.max(ans,arr[n][1] + memo(arr,n-1,1,memo));
    if(prev != 2)
       
    ans = Math.max(ans,arr[n][2] + memo(arr,n-1,2,memo));
       
        return memo[n][prev+1] = ans;
    }



    public static void solve(int[][] arr, int N){
        long ans = Long.MIN_VALUE;
        long[][] dp = new long[N][3];
        for(int i = 0; i < 3; i++){
            dp[0][i] = arr[0][i]; 
            ans = Math.max(ans,dp[0][i]);
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                long max = Long.MIN_VALUE;
                int picked = arr[i][j]; 
               for(int k = 0; k < dp[0].length; k++ ){
                    if(j != k){
                        max = Math.max(max, picked + dp[i-1][k]);
                    }
               } 
               dp[i][j] = max;
               ans = Math.max(ans,dp[i][j]);
            }
            
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        StringTokenizer str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[n][3];
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            str = new StringTokenizer(br.readLine().trim()," ");
            while(str.hasMoreTokens()){
                arr[i][j] = Integer.parseInt(str.nextToken());
                j++;
            }
        }
       //solve(arr,n);      
       long[][] memo = new long[arr.length][4];      
        System.out.println(memo(arr, arr.length-1, -1,memo));
    }
}