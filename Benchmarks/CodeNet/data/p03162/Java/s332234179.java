import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");

    public static void main(String args[]){
        try{
            int N = Integer.parseInt(bf.readLine());
            int arr[][] = new int[N][3];

            for(int i=0;i<N;i++){
                stk = new StringTokenizer(bf.readLine());
                for(int j=0;j<3;j++){
                    arr[i][j] = Integer.parseInt(stk.nextToken());
                }
            }
            System.out.println(solver(N,arr));
          	bf.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static int solver(int N,int[][] arr){
        int dp[][]  = new int[N][3];
        int max = 0;
        for(int i=0;i<3;i++){
            dp[0][i] = arr[0][i];
            max = Math.max(max,dp[0][i]); 
        }
        if(N==1)
            return max;
        
        for(int i=1;i<N;i++){
            // System.out.println()
            for(int j=0;j<3;j++){
                if(j==0){
                    dp[i][j] = Math.max(dp[i-1][1] , dp[i-1][2]) + arr[i][j];
                }else if(j==1){
                    dp[i][j] = Math.max(dp[i-1][0] , dp[i-1][2]) + arr[i][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][0] , dp[i-1][1]) + arr[i][j];
                }
            }
        }
        
        for(int i=0;i<3;i++){
            max = Math.max(max , dp[N-1][i]);
        }
        return max;
    }
}