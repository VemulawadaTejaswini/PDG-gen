import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalLong;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                long a = scanner.nextLong();
                long b = scanner.nextLong();
                System.out.println(GCDCalculator.calc(a, b) +" " + LCMCalculator.calc(a, b));
            }
        }
    }
}

class GCDCalculator {
    private GCDCalculator() {
    }

    static long calc(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        long ld = max % min;
        if (ld == 0L) {
            return min;
        }
        return calc(min, ld);
    }

}

class LCMCalculator {
    private LCMCalculator() {}

    static long calc(long a, long b) {
        Map<Long, Integer> factoringA = FactoringCalculator.calc(a);
        Map<Long, Integer> factoringB = FactoringCalculator.calc(b);
        Map<Long, Integer> lcm = new HashMap<>();
        factoringA.keySet().forEach(it -> {
            if (factoringB.containsKey(it)) {
                lcm.put(it, Math.max(factoringA.get(it), factoringB.get(it)));
            } else {
                lcm.put(it, factoringA.get(it));
            }
        });
        factoringB.entrySet().forEach(it -> {
            if (!lcm.containsKey(it.getKey())) {
                lcm.put(it.getKey(), it.getValue());
            }
        });
        return lcm.entrySet().stream().mapToLong(it -> (long) Math.pow(it.getKey(), it.getValue())).reduce((left, right) -> left * right).getAsLong();
    }
}

class FactoringCalculator {
    private FactoringCalculator() {}

    static Map<Long, Integer> calc(long n) {
        Map<Long, Integer> map = new HashMap<>();
        for (long i = 2; i <= n; i ++) {
            if (!isPrimeNumber(i)) {
                continue;
            }
            if (n % i == 0) {
                n /= i;
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
                i--;
            }
        }

        return map;
    }

    private static boolean isPrimeNumber(long n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (long i = 3; i < n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}