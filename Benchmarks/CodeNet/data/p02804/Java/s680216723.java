import java.util.*;

public class Main {


    static long mod = 1000000007;

    static long[] fac;
    static long[] finv;
    static long[] inv;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = n+1;
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


        long res = 0;

        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        for(int i=0; i<n; i++) {
            res += mod - c(n-i-1, k-1) * a[i];
            res %= mod;
            res += c(i, k-1) * a[i];
            res %= mod;
        }
        System.out.println(res);
    }

    static long c(int n, int k) {
        if(n < k) return 0;
        if(n < 0 || k< 0) return 0;
        return fac[n] * (finv[k] * finv[n-k] % mod) % mod;
    }


}


