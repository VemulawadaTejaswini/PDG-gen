
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.close();

        int mod = 1000000000 + 7;

        long[] d = new long[k + 1];
        for (int i = 1; i <= k; i++) {
            int count = k / i;
            d[i] = modPow(count, n, mod);
        }

        for (int i = k; i > 0; i--) {
            int a = 2;
            while (i * a <= k) {
                if (d[i] >= d[i * a]) {
                    d[i] -= d[i * a];
                } else {
                    d[i] = d[i] + mod - d[i * a];
                }
                a++;
            }
        }

        long ans = 0;
        for (int i = 1; i <= k; i++) {
            ans += i * d[i];
            ans %= mod;
        }

        System.out.println(ans);

    }

    private static long modPow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            return modPow((a * a) % mod, b / 2, mod);
        } else {
            return modPow((a * a) % mod, b / 2, mod) * a % mod;
        }
    }

}
