import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextLong();
            long P = in.nextLong();
            long max = 1;
            Map<Long, Integer> divisorToCount = primeFactor(P);
            for (Long divisor : divisorToCount.keySet()) {
                int count = divisorToCount.get(divisor).intValue();
                while (count >= N) {
                    max *= divisor;
                    count -= N;
                }
            }
            System.out.println(max);
        }
    }

    public static final Map<Long, Integer> primeFactor(long n) {
        HashMap<Long, Integer> res = new HashMap<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                int count = res.get(i) == null ? 0 : res.get(i).intValue();
                res.put(i, count + 1);
                n /= i;
            }
        }
        if (n != 1) {
            int count = res.get(n) == null ? 0 : res.get(n).intValue();
            res.put(n, count + 1);
        }
        return res;
    }
}
