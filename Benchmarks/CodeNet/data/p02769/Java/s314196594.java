import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        init(n+10);
        int k = sc.nextInt();
        k = Math.min(k, n-1);

        long res = 1;
        for(int i=1; i<=k; i++) {
            long add = conv(n, i) * conv(n-1, i) % mod;
            res += add;
            res %= mod;
        }
        System.out.println(res);


    }

    static long mod = 1000000007;
    static long[] fac;
    static long[] finv;
    static long[] inv;
    static void init(int max) {
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