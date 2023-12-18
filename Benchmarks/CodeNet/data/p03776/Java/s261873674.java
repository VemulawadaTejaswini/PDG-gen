
import java.math.BigInteger;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        final Map<Long, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final long v = scanner.nextLong();
            counter.compute(v, (key, value) -> value == null ? 1 : value + 1);
        }

        final List<Long> keys = counter.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if (counter.get(keys.get(0)) >= a) {
            System.out.println(keys.get(0));
            final long bound = Math.min(counter.get(keys.get(0)), b);
            BigInteger sum = BigInteger.ZERO;
            BigInteger tmp1 = BigInteger.ONE;
            BigInteger tmp2 = BigInteger.ONE;
            for (int i = 1; i < a; i++) {
                tmp1 = tmp1.multiply(BigInteger.valueOf(bound - i + 1));
                tmp2 = tmp2.multiply(BigInteger.valueOf(i));
            }
            for (int i = a; i <= bound; i++) {
                tmp1 = tmp1.multiply(BigInteger.valueOf(bound - i + 1));
                tmp2 = tmp2.multiply(BigInteger.valueOf(i));
                sum = sum.add(tmp1.divide(tmp2));
            }
            System.out.println(sum);
            return;
        }

        int accumulation = 0;
        double sum = 0;
        for (final long key : keys) {
            final int value = counter.get(key);
            if (accumulation + value < a) {
                accumulation += value;
                sum += key * value;
                continue;
            }

            final int needed = a - accumulation;
            sum += needed * key;
            System.out.println(sum / (double) a);

            BigInteger tmp1 = BigInteger.ONE;
            BigInteger tmp2 = BigInteger.ONE;
            for (int i = 1; i <= needed; i++) {
                tmp1 = tmp1.multiply(BigInteger.valueOf(value - i + 1));
                tmp2 = tmp2.multiply(BigInteger.valueOf(i));
            }
            System.out.println(tmp1.divide(tmp2));
            return;
        }
    }
}
