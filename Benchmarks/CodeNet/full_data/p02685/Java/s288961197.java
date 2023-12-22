import java.util.*;
public class Main
{
    static int mod; static long[] fac;
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        mod = 998244353;
        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt(); long ans = 0; fac = new long [n+1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = (fac[i - 1]  * i) % mod;
        }
        for (int a = n - k; a <= n; a++) {
            long temp = (exponentiation(m - 1, a - 1) * nck(n - 1, a - 1))%mod;
            ans = (ans + (m * temp) % mod)%mod;
        }
        System.out.println(ans);
    }

    static long exponentiation(long base, long exp)
    {
        long t = 1L;
        while (exp > 0) {

            // for cases where exponent
            // is not an even value
            if (exp % 2 != 0)
                t = (t * base) % mod;

            base = (base * base) % mod;
            exp /= 2;
        }
        return t % mod;
    }

    static long nck(int n, int k) {
        if (n < k)
            return 0;
        long den = inv((int) (fac[k] * fac[n - k] % mod));
        return fac[n] * den % mod;
    }

    static int pow(long b, int e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return (int) ans;
    }

    static int inv(int x) {
        return pow(x, mod - 2);
    }


}