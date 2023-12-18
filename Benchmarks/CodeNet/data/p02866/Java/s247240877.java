
import java.util.Scanner;

public class Main {
    private static long MOD = 998244353;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long[] array = new long[n + 1];
        for (int i = 0; i < n; i++) {
            final int tmp = scanner.nextInt();
            if (i == 0 && tmp != 0) {
                System.out.println(0);
                return;
            }
            array[tmp]++;
        }

        int last = n;
        for (; last >= 0; last--) {
            if (array[last] != 0) {
                break;
            }
        }

        for (int i = 0; i <= last; i++) {
            if (array[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        long answer = 1;
        long pre = 1;
        for (int i = 1; i <= last; i++) {
            answer *= originalPow(pre, array[i]);
            answer %= MOD;
            pre = array[i];
        }

        System.out.println(answer);
    }

    private static long originalPow(final long a, final long b) {
        long result = 1;
        for (long i = 0; i < b; i++) {
            result *= a % MOD;
            result %= MOD;
        }

        return result;
    }
}
