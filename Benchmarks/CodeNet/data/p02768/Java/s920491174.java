
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static final BigInteger MOD = new BigInteger("1000000007");

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int a = in.nextInt();
        final int b = in.nextInt();
        final long all = fast_pow(2, n) - 1;
        System.out.println((all - c(n, a) - c(n, b) + 1_000_000_007) % 1_000_000_007);
    }

    private static long c(int top, int bottom) {
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

    private static long fast_pow(int base, int top) {
        if (top == 0) {
            return 1;
        }
        final long temp = fast_pow(base, top / 2);
        if (top % 2 == 0) {
            return ((temp % 1_000_000_007) * (temp % 1_000_000_007)) % 1_000_000_007;
        } else {
            return (base * (temp % 1_000_000_007) * (temp % 1_000_000_007)) % 1_000_000_007;
        }
    }
}
