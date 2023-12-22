import java.util.*;

public class Main {

    public static void main(String[] args){
        init();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] mpow = new long[max];
        mpow[0] = 1;
        for(int i=1; i<max; i++) {
            mpow[i] = mpow[i-1] * (m-1) % mod;
        }
        long res = 0;
        for(int i=0; i<=k; i++) {
            res += (conv(n-1, i) * m % mod) * mpow[n-1-i] % mod;
            res %= mod;
        }
        System.out.println(res);

    }

    static int max = 210000;
    static long mod = 998244353;
    static long[] fac;
    static long[] finv;
    static long[] inv;

    static void init() {
        fac = new long[max];
        finv = new long[max];
        inv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2; i<max; i++) {
            fac[i] = fac[i-1] * i % mod;
            inv[i] = mod - inv[(int)mod%i] * (mod / i) % mod;
            finv[i] = finv[i-1] * inv[i] % mod;
        }
    }
    static long conv(int n, int k) {
        if(n<k || n<0 || k<0) return 0;
        return fac[n] * (finv[k]*finv[n-k]%mod) % mod;
    }

}