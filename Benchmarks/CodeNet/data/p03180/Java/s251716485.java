import java.util.*;
import java.io.*;
class Main {
    static long[] maskCount;
    static long[] dp;
    static long recurse(long[][] a, int mask) {
        if(Integer.bitCount(mask)==a.length)
            return 0;
        int n = a.length;
        if(dp[mask]!=-1)
            return dp[mask];
        long res = Long.MIN_VALUE;
        int remMask = (1<<n)-1-mask;
        for(int i = remMask; i>0; i=(i-1)&remMask) {
            long x = recurse(a, mask|i);
            if(x==Long.MIN_VALUE) continue;
            res = Math.max(res, x+maskCount[i]);
        }
        return dp[mask] = res;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        dp = new long[1<<n];
        Arrays.fill(dp, -1);
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++)
                a[i][j] = sc.nextInt();
        }
        maskCount = new long[1<<n];
        for(int i = 0; i<(1<<n); i++) {
            int mask = i;
            long ans = 0;
            for(int j = 0; j<n; j++) {
                for(int k = j+1; k<n; k++) {
                    int bit1 = (mask>>k)&1;
                    int bit2 = (mask>>j)&1;
                    if(bit1==1 && bit2==1)
                        ans+=a[j][k];
                }
            }
            maskCount[mask] = ans;
        }
        System.out.println(recurse(a, 0));
    }
}