import java.util.*;

public class Main {

    public static void main(String[] args) {
        final long MOD = (long) (1e9) + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        long ans = modpow(2, n, MOD);
        long nCa = 1;
        long prod_a = 1;
        for (long i = 1; i <= a; i++) {
            nCa = (nCa * (n - i + 1)) % MOD;
            prod_a = (prod_a * i) % MOD;
        }
        nCa = (nCa * modinv(prod_a, MOD)) % MOD;

        long nCb = 1;
        long prod_b = 1;
        for (long i = 1; i <= b; i++) {
            nCb = (nCb * (n - i + 1)) % MOD;
            prod_b = (prod_b * i) % MOD;
        }
        nCb = (nCb * modinv(prod_b, MOD)) % MOD;

        ans = (ans - 1 - nCa - nCb + 3 * MOD) % MOD;

        System.out.println(ans);
    }

    static long modpow(long a, long n, long MOD) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            n >>= 1;
        }

        return res;
    }

    static long modinv(long a, long MOD) {
        return modpow(a, MOD - 2, MOD);
    }
}

