import java.math.*;
import java.util.*;

public class Main {
    long kaijo[] = new long[300001];
    long mod = 998244353;
    BigInteger bmod = BigInteger.valueOf(mod);

    public void main(Scanner sc) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        kaijo[0] = 1;
        for (int i = 1; i <= n; i++) {
            kaijo[i] = kaijo[i - 1] * i;
            kaijo[i] %= mod;
        }

        long ans = 0;
        for (long red = 0; red <= n && a * red <= k; red++) {
            if ((k - a * red) % b == 0) {
                long blue = (k - a * red) / b;
                if (blue > n) {
                    continue;
                }

                ans += calc(n, red, blue);
            }
        }

        System.out.println(ans);
    }

    private long calc(long n, long r, long b) {
        BigInteger ans = BigInteger.valueOf(kaijo[(int) n]).modPow(BigInteger.valueOf(2), bmod);
        ans = ans.multiply(BigInteger.valueOf(kaijo[(int) r]).modInverse(bmod));
        ans = ans.mod(bmod);
        ans = ans.multiply(BigInteger.valueOf(kaijo[(int) (n - r)]).modInverse(bmod));
        ans = ans.mod(bmod);
        ans = ans.multiply(BigInteger.valueOf(kaijo[(int) b]).modInverse(bmod));
        ans = ans.mod(bmod);
        ans = ans.multiply(BigInteger.valueOf(kaijo[(int) (n - b)]).modInverse(bmod));
        ans = ans.mod(bmod);

        return ans.longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
