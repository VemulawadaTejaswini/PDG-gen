import java.math.*;
import java.util.*;

public class Main {
    BigInteger kaijo[] = new BigInteger[300001];
    BigInteger inv_kaijo[] = new BigInteger[300001];
    long mod = 998244353;
    BigInteger bmod = BigInteger.valueOf(mod);
    BigInteger btwo = BigInteger.valueOf(2);

    public void main(Scanner sc) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        kaijo[0] = BigInteger.ONE;
        inv_kaijo[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            kaijo[i] = kaijo[i - 1].multiply(BigInteger.valueOf(i)).mod(bmod);
            inv_kaijo[i] = kaijo[i].modInverse(bmod);
        }

        long red, blue;
        long ans = 0;
        for (red = 0; red <= n && a * red <= k; red++) {
            if ((k - a * red) % b == 0) {
                blue = (k - a * red) / b;
                if (blue > n) {
                    continue;
                }

                ans += calc(n, red, blue);
                ans %= mod;
            }
        }

        System.out.println(ans);
    }

    private long calc(long n, long r, long b) {
        BigInteger ans = kaijo[(int) n].modPow(btwo, bmod);
        ans = ans.multiply(inv_kaijo[(int) r]).mod(bmod);
        ans = ans.multiply(inv_kaijo[(int) (n - r)]).mod(bmod);
        ans = ans.multiply(inv_kaijo[(int) b]).mod(bmod);
        ans = ans.multiply(inv_kaijo[(int) (n - b)]).mod(bmod);
        return ans.longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
