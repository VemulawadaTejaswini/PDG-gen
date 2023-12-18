import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Long> ansMap = new HashMap<>();

    private static long combination(long n, long r) {
        r = Math.min(r, n - r);
        if (r == 1) {
            return n;
        }

        long sum = 1;
        for (long i = 1; i <= r; i++) {
            sum = sum * (n - i + 1) / i;
            sum %= 998244353;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;

        for (long a = 0; a <= N; a++) {
            long rem = K - (a * A);
            if (rem < 0) {
                break;
            }
            if (rem % B != 0) {
                continue;
            }
            long b = rem / B;
            ans += (combination(N, a) * combination(N, b)) % 998244353;
        }

        System.out.println("" + ans);
    }
}
