
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        BigInteger s = BigInteger.valueOf(a[0]);
        for (int i = 1; i < n; i++) {
            s = lcm(s, BigInteger.valueOf(a[i]));
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
//            debug(s.divide(BigInteger.valueOf(a[i])).mod(MOD));
            ans += s.divide(BigInteger.valueOf(a[i])).mod(MOD).longValue();
            ans %= (long)1e9 + 7;
        }
        System.out.println(ans);
    }

    BigInteger lcm(BigInteger a, BigInteger b) {
//        debug(a, b, gcd(a, b));
        return a.divide(gcd(a, b)).multiply(b);
    }

    BigInteger gcd(BigInteger a, BigInteger b) {
        if (BigInteger.ZERO.equals(b)) return a;
        return gcd(b, a.divideAndRemainder(b)[1]);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
