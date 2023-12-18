
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static final BigInteger MOD = new BigInteger("1000000007");

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long n = in.nextLong();
        final long a = in.nextLong();
        final long b = in.nextLong();
        final long all = fast_pow(2, n) - 1;
        System.out.println((all - c(n, a) - c(n, b) + 1_000_000_007) % 1_000_000_007);
    }

    private static long c(long top, long bottom) {
        long result = 1;
        for (int i = 0; i < bottom; i++) {
            result *= top - i;
            result %= 1_000_000_007;
        }
        for (int i = 2; i <= bottom; i++) {
            final long target = new BigInteger(String.valueOf(i)).modInverse(MOD).longValue();
            result *= target;
            result %= 1_000_000_007;
        }
        return result;
    }

    private static long fast_pow(long base, long top) {
        if (top == 0) {
            return 1;
        }
        final long temp = fast_pow(base, top / 2) % 1_000_000_007;
        final long result = (temp * temp) % 1_000_000_007;
        if (top % 2 == 0) {
            return result;
        } else {
            return (base * result) % 1_000_000_007;
        }
    }
}
