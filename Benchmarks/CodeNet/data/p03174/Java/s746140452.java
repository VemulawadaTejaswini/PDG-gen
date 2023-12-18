import java.util.*;
import java.io.*;
class Main {
    static long MOD = (long)(1e9+7);
    static long[] dp;
    static long recurse(int[] woMask, int mask) {
        int n = woMask.length;
        if(dp[mask]!=-1)
            return dp[mask];
        int idx = Integer.bitCount(mask);
        if(idx==n)
            return 1;
        long ans = 0;
        for(int i = 0; i<n; i++) {
            int bit1 = (woMask[idx]>>i)&1;
            int bit2 = (mask>>i)&1;
            if(bit1==1 && bit2==0)
                ans+=recurse(woMask, mask|(1<<i));
            ans%=MOD;
            if(ans<0)
                ans+=MOD;
        }
        dp[mask] = ans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] woMask = new int[n];
        for(int i = 0; i<n; i++) {
            int mask = 0;
            for(int j = 0; j<n; j++) {
                if(sc.nextInt()==1)
                    mask|=(1<<j);
            }
            woMask[i] = mask;
        }
        dp = new long[1<<n];
        Arrays.fill(dp, -1);
        System.out.println(recurse(woMask, 0));
    }
}