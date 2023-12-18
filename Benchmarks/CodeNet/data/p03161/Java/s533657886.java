import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int cost[]=new int[n];
        for(int i=0;i<n;i++) {
            cost[i]=input.nextInt();
        }
        System.out.println(solve(n,k,cost));
    }
    public static int solve(int n,int k,int[] cost) {
        int dp[]=new int[n];
        dp[1]=Math.abs(cost[0]-cost[1]);
        for(int i=2;i<n;i++) {
            dp[i]=Integer.MAX_VALUE;
            for(int j=1;j<=Math.min(i,k);j++) {
                dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(cost[i]-cost[i-j]));
            }
        }
        return dp[n-1];
    }
}
