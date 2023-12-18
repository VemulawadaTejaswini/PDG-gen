import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static long capacity;
    static long wei[];
    static long val[];
    static long dp[][];
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        capacity=input.nextLong();
        wei=new long[n];
        val=new long[n];
        dp=new long[n][(int)capacity+1];
        for(int i=0;i<n;i++) {
            wei[i]=input.nextLong();
            val[i]=input.nextLong();
        }
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j]=-1L;
            }
        }
        System.out.println(solve(n,capacity));
    }
    public static long solve(int n,long cap) {
        if(n==0 || cap==0) {
            return 0;
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(dp[i][(int)cap]==-1L) {
                long tmp=Integer.MIN_VALUE;
                if(cap>=wei[i]) {
                tmp=Math.max(tmp, solve(i,cap-wei[i])+val[i]);
                }
                tmp=Math.max(tmp, solve(i,cap));
                dp[i][(int)cap]=tmp;
            }
            max=Math.max(max,dp[i][(int)cap]);
        }
        return max;
    }
}
