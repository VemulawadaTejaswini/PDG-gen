import java.util.*;

class Main{
    static long mod = 998244353L;
    static Long n;
    static Long m;
    static Long k;
    static int max = 200000;
    static long[] dp = new long[max+1];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        m = sc.nextLong();
        k = sc.nextLong();

        dp[0] = 1;
        for(int i=1;i<=max;i++){
            dp[i] = dp[i-1]*i;
            dp[i] %= mod;
        }

        Long result = 0L;
        for(long i=0;i<=k;i++){
            Long nuri = nurikata(n-i)%mod;
            Long com = combi(n-1, i)%mod;
            // System.out.println(nuri + " " + com);
            result += (nuri*com)%mod;
        }
        System.out.println(result);
    }

    private static Long combi(long n, long k) {
        if(k==0 || k==n)return 1L;
        int ni = (int)n;
        int ki = (int)k;
        long res = mod + dp[ni];
        res /= dp[ki];
        res += mod;
        res /= dp[ni-ki];
        return res%mod;
    }

    private static Long nurikata(Long x) {
        Long tmp = m%mod;
        for(long i=0;i<x-1;i++){
            tmp *= (m-1);
            tmp %= mod;
        }
        return tmp;
    }
}
