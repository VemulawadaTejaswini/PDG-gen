import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextLong();

            long sum = 0;
            ArrayList<Long> divisors = divisor(N);
            for (Long divisor : divisors) {
                if (divisor.longValue() == 1) {
                    continue;
                }
                long m = divisor.longValue() - 1;
                if (N / m == N % m) {
                    sum += m;
                }
            }

            System.out.println(sum);
        }
    }

    public static final ArrayList<Long> divisor(long n) {
        ArrayList<Long> res = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (n / i != i) {
                    res.add(n / i);
                }
            }
        }
        return res;
    }
}
