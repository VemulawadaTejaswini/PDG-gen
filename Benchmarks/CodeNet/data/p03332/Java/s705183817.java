import java.math.*;
import java.util.*;

public class Main {
    long nk[] = new long[300001];
    long mod = 998244353;
    BigInteger bmod = BigInteger.valueOf(mod);

    public void main(Scanner sc) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        nk[0] = 1;
        for (int i = 1; i <= n; i++) {
            nk[i] = nk[i - 1] * i;
            nk[i] %= mod;
        }

        long ans = 0;
        for (long red = 0; a * red <= k; red++) {
            if ((k - a * red) % b == 0) {
                long blue = (k - a * red) / b;
                for (long green = Math.max(0, red + blue - n); (red - green >= 0)
                        && (blue - green >= 0); green++) {
                    ans += calc(n, red - green, green, blue - green);
                    ans %= mod;
                }
            }
        }

        System.out.println(ans);
    }

    private long calc(long n, long r, long g, long b) {
        BigInteger ans = BigInteger.valueOf(nk[(int) n]);

        ans = ans.multiply(BigInteger.valueOf(nk[(int) r]).modInverse(bmod));
        ans = ans.mod(bmod);
        ans = ans.multiply(BigInteger.valueOf(nk[(int) g]).modInverse(bmod));
        ans = ans.mod(bmod);
        ans = ans.multiply(BigInteger.valueOf(nk[(int) b]).modInverse(bmod));
        ans = ans.mod(bmod);
        ans = ans.multiply(BigInteger.valueOf(nk[(int) (n - r - g - b)]).modInverse(bmod));
        ans = ans.mod(bmod);

        return ans.longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
