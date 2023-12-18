import java.util.*;

class Main{
// https://atcoder.jp/contests/dp/tasks/dp_a
// problem B

    public static int frog1(int[] costs){
        int n = costs.length;
        int[] dp = new int[n];

        dp[1] = Math.abs(costs[1]-costs[0]);
        for(int i=2;i<n;i++){
            dp[i] = Math.min( Math.abs(costs[i]-costs[i-2] )+ dp[i-2], Math.abs(costs[i]-costs[i-1])+dp[i-1] );
        }
        // for(int i:dp) System.out.print(i+" ");
        return dp[n-1];

    }
    // static int res

    public static int frog2(int[] arr, int[] dp ,int k, int j){
        if(j==0) return dp[0]=0;
        int res = Integer.MAX_VALUE;
        
        if(dp[j]!=-1) return dp[j];
        for(int i=1;i<=k;i++){
              
            if( j-i>=0 ){
           
              
                res = Math.min(res, frog2(arr,dp ,k,j-i) ) + Math.abs( arr[j]-arr[j-i]);
                }
        }
        return dp[j] = res;
    }
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] costs = new int[n];
    for(int i=0;i<n;i++){
            costs[i] = sc.nextInt();
        }

     int[] dp = new int[n];
     for(int i=0;i<n;i++) dp[i]=-1;

    System.out.println(frog2(costs,dp, k, n-1));
    }

}