
import java.util.Scanner;

public class Main {

    static int mod = 998244353;

    static int max = 4 * 100000 + 2;

    static long[] fact = new long[max];
    static long[] modinv = new long[max];
    static long[] factinv = new long[max];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.close();

        initCombi();

        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += (m * combi(n - 1, i) % mod) * modPow(m - 1, n - 1 - i) % mod;
        ans %= mod
        }

        System.out.println(ans);
    }

    private static void initCombi() {
        fact[0] = 1;
        fact[1] = 1;
        modinv[1] = 1;
        factinv[0] = 1;
        factinv[1] = 1;

        for (int i = 2; i < max; i++) {
            fact[i] = fact[i - 1] * i % mod;
            modinv[i] = mod - modinv[mod % i] * (mod / i) % mod;
            factinv[i] = factinv[i - 1] * modinv[i] % mod;
        }
    }

    private static long combi(int n, int k) {
        return fact[n] * (factinv[k] * factinv[n - k] % mod) % mod;
    }

    private static long modPow(long a, long b) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            return modPow(a * a % mod, b / 2);
        } else {
            return modPow(a * a % mod, (b - 1) / 2) * a % mod;
        }
    }
}
