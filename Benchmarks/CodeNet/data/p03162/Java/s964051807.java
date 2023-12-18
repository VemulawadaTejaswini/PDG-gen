import java.util.*;
import java.io.*;
class Main {
    
    public static void solve2(int[][] arr, int N){
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
       
        solve2(arr,n);            
    }
}