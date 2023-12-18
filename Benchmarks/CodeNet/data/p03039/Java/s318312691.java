import java.util.*;

public class Main {
    static int N;
    static int M;
    static int K;
    static final long MOD = 1_000_000_007;
    static long fact[];
    static long invfact[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        precalc();
        long NM = N*M;
        long ans = g((long) N, (long) M);
        // System.out.println(ans);
        // ans /= N*M;
        // ans /= (N*M-1);
        // ans /= 2;
        ans = modPrd(ans, modPow(NM,MOD-2,MOD), MOD);
        ans = modPrd(ans, modPow(NM-1,MOD-2,MOD), MOD);
        // ans = modPrd(ans, invfact[N*M-1], MOD);
        // System.out.println(ans);
        ans = modPrd(ans, comb(K, 2), MOD);
        // System.out.println(ans);
        ans = modPrd(ans, comb(NM, K), MOD);
        System.out.println(ans);
    }
    public static long f(long x, long y) {
        long ans = (x * (x+1))/2;
        ans += ((y-1-x)*(y-x))/2;
        return ans;
    }
    public static long g(long x, long y) {
        long ans = 0;
        for (long i = 0; i < x; i++) {
            for (long j = 0; j < y; j++) {
                ans += x * f(j,y) + y * f(i,x);
            }
        }
        return ans;
    }
    public static long comb(long n, long m) {
        long ans = fact[(int) n];
        long d = modPrd(invfact[((int) n)-(int) m],invfact[(int) m], MOD);
        ans = modPrd(ans, d, MOD);
        return ans;
    }
    public static void precalc() {
        fact = new long[N*M + 10];
        invfact = new long[N*M + 10];
        fact[0] = 1;
        invfact[0] = 1;
        for (int i = 1; i < N*M + 5; i++) {
            invfact[i] = invfact[i-1] * modPow((long) i, MOD-2, MOD);
            invfact[i] %= MOD;
            fact[i] = i * fact[i-1];
            fact[i] %= MOD;
        }

    }
    public static long modPow(long x, long pow, long mod){
        if (pow == 0) {
            return 1;
        }
        long y = x*x;
        y %= mod;
        long ans = 1;
        if (pow % 2 == 1) {
            ans *= x;
            ans %= mod;
        }
        return (modPrd(ans, modPow(y, pow/2, mod),mod));
    }
    public static long modPrd(long x, long y, long mod) {
        return (x*y)%mod;
    }

} 