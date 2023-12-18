import java.io.*;
import java.util.*;

class Main {

    public static long solve(int[] weights, int[] val, int W, int n, long[][] memo){
        if(n <= 0 || W <= 0)
            return 0;
        if(memo[n][W] > -1){
            return memo[n][W];
        }
        long ans = Long.MIN_VALUE;
        if(W - weights[n-1] >= 0)
            ans = Math.max(ans,val[n-1] + solve( weights,val,W-weights[n-1],n-1,memo));
        
        ans = Math.max(ans, solve( weights,val,W,n-1,memo));
        
        return memo[n][W] = ans;


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        String[] nw = br.readLine().trim().split(" ");
        int n = Integer.parseInt(nw[0]);
        int W = Integer.parseInt(nw[1]);
        int weights[] = new int[n];
        int val[] = new int[n];

        for(int i  = 0; i < n; i++){
            String[] input = br.readLine().trim().split(" ");

            weights[i] = Integer.parseInt(input[0]);
            val[i] = Integer.parseInt(input[1]);
        }

        long[][] memo = new long[n+1][W+1];
        for(int i = 0; i < memo.length; i++)
            Arrays.fill(memo[i],-1);
        System.out.println(solve(weights,val,W,n,memo));

    }
}