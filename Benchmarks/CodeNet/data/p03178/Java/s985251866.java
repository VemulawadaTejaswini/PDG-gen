import java.util.*;
import java.io.*;
class Main {
    static long MOD = (long)(1e9+7);
    static long[][][] dp;
    static long recurse(String s, int mod, int idx, boolean isTight, int currRem) {
        if(idx==s.length()) {
            if(currRem==0)
                return 1;
            return 0;
        }
        int secIdx = isTight?1:0;
        if(dp[idx][secIdx][currRem]!=-1)
            return dp[idx][secIdx][currRem];
        int limit = 9;
        int currDig = s.charAt(idx)-'0';
        if(isTight)
            limit = currDig;
        long ans = 0;
        for(int i = 0; i<=limit; i++) {
            boolean newTight = isTight;
            if(i<limit)
                newTight = false;
            int newRem = (currRem+i)%mod;
            ans = (ans + recurse(s, mod, idx+1, newTight, newRem))%MOD;
        }
        return dp[idx][secIdx][currRem] = ans;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int rem = sc.nextInt();
        dp = new long[s.length()][2][rem];
        for(long[][] i: dp)
            for(long[] j: i)
                Arrays.fill(j, -1);
        long ans = (recurse(s, rem, 0, true, 0)+MOD-1)%MOD;
        System.out.println(ans);
    }
}