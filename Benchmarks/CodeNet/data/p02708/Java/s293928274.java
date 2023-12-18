import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         final long mod = 1000000007;

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long sum_bottom, sum_upper;
        long ans ;

        sum_bottom = (k * (k-1) % mod  * modinv(2, mod)) % mod;
        sum_upper = (((2*n%mod) - ((k-1) % mod)) * k  % mod* modinv(2, mod)) % mod;
        ans = (mod(sum_upper - sum_bottom, mod) + 1 )% mod;

        for (long i = k+1; i <= n+1; i++) {
            sum_bottom = (sum_bottom + i-1) % mod;
            sum_upper = (sum_upper + n - (i-1)) % mod;
            ans =( ans + (mod(sum_upper - sum_bottom, mod) + 1) % mod) % mod;
        }

        System.out.println(ans);
    }
    static long modinv(long  a, long m) {
        long b = m, u = 1, v = 0;
        long tmp;
        while (b != 0) {
            long t = a / b;
            a -= t * b;
            tmp = b;
            b = a;
            a = tmp;
            
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }

    static long mod(long val, long m) {
        long res = val % m;
        if (res < 0) res += m;
        return res;
    }
}
