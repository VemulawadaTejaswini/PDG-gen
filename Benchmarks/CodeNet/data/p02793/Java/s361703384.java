import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        BigInteger lcm = BigInteger.valueOf(A[0]);
        for (int i = 1; i < N; i++) {
            BigInteger gcd = gcd(lcm, BigInteger.valueOf(A[i]));
            lcm = lcm.multiply(BigInteger.valueOf(A[i])).divide(gcd);
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += lcm.divide(BigInteger.valueOf(A[i])).mod(BigInteger.valueOf(MOD)).longValue();
            ans %= MOD;
        }

        System.out.println(ans);
    }

    static BigInteger gcd(BigInteger x, BigInteger y) {
        if (x.compareTo(y) < 0) {
            return gcd(y, x);
        }
        if (y.equals(BigInteger.ZERO)) {
            return x;
        }
        return gcd(y, x.remainder(y));
    }
}
