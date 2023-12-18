import java.util.*;
import java.io.*;
import java.lang.*;

class Main{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder("");
    static StringTokenizer stk = new StringTokenizer("");

    public static void main(String arg[]){
        try{
            stk = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(stk.nextToken());
            int K = Integer.parseInt(stk.nextToken());
            stk = new StringTokenizer(bf.readLine());
            int arr[] =  new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(stk.nextToken());
            }
            System.out.println(solver(N,K,arr));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int solver(int N,int K,int[] arr){
        int[] dp  = new int[N];
        dp[0] = 0;
        for(int i=1;i<N;i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i=1;i<N;i++){
            for(int j=1;j<=K;j++){
                dp[i] = Math.min(dp[i],(i-j >= 0) ? dp[i-j] + Math.abs(arr[i-j] - arr[i]) : Integer.MAX_VALUE);
            }
        }
        return dp[N-1];
    }
}