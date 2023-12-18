import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] graph;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        long[][] dp = new long[n][n];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],Long.MAX_VALUE/10);
        for(int i=0;i<n;i++) dp[i][i]=a[i];
        for(int pass=0;pass<2;pass++){
            for(int i=0;i<n;i++) dp[i][i] = Math.min(dp[i][i],x+dp[(i-1+n)%n][(i-1+n)%n]);
        }
        for(int d=1;d<n;d++){
            for(int pass=0;pass<2;pass++){
                for(int start=0;start<n;start++){
                    long left = a[start]+dp[(start+1)%n][(start+d)%n];
                    long right = a[(start+d)%n]+dp[start][(start+d-1)%n];
                    long shift = x + dp[(start-1+n)%n][(start+d-1)%n];
                    long cur = Math.min(left,Math.min(right,shift));
                    dp[start][(start+d)%n]=Math.min(dp[start][(start+d)%n],cur);
                }
            }
        }
        long ans = Long.MAX_VALUE/10;
        for(int start=0;start<n;start++){
            ans = Math.min(ans,dp[start][(start+n-1)%n]);
        }
        System.out.println(ans);
    }
}
