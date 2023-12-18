/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class Main {
    static int n,W;
    static int[] w,v;
    static int[] dp;
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        W=sc.nextInt();
        dp=new int[W+1];
        w=new int[n];
        v=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }
        solve(W,0);
        System.out.println(dp[W]);
    }
    static int solve(int weight,int i){
        if(i>=n)return 0;
        if(dp[weight]!=-1)return dp[weight];
        int ans=0;
        if(weight-w[i]>=0)ans=v[i]+solve(weight-w[i],i+1);
        ans=Math.max(ans,solve(weight,i+1));
        dp[weight]=ans;
        return ans;
    }
}
