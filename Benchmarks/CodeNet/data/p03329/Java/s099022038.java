
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.LongStream;

public class Main {
    static final long MOD = 998244353;
    private final long n;

    final List<Long> POWER6;
    final List<Long> POWER9;

    public Main(final long n) {
        this.n = n;

        POWER6 = LongStream.range(1, 12).mapToObj(i -> (long) Math.pow(6, i)).collect(toList());
        POWER9 = LongStream.range(1, 12).mapToObj(i -> (long) Math.pow(9, i)).collect(toList());
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextLong();

        final long result = new Main(n).calculate();

        System.out.println(result);
    }

    long calculate() {
        return calcRecursive(0, n);
    }

    long calcRecursive(final long depth, final long currentN) {
        if (currentN < 9) {
            switch ((int) currentN) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return depth + currentN;
                default:
                    return depth + 1 + currentN % 6;
            }

        }

        return Math.min(
                calcRecursive(depth + 1, currentN - POWER6.get(binarySearchInsertionPoint(POWER6, currentN))),
                calcRecursive(depth + 1, currentN - POWER9.get(binarySearchInsertionPoint(POWER9, currentN)))
        );
    }

    int binarySearchInsertionPoint(final List<Long> list, final long target) {
        final int i = Collections.binarySearch(list, target);
        if (i >= 0) {
            return i;
        }
        if (i == -1) {
            return -1;
        }
        return -i - 2;
    }

    long c(final long p, final long q) {
        if (q == 1) {
            return p;
        }

        if (q * 2 < p) {
            return c(p, p - q);
        }

        long result = 1;
        final Set<Long> hashSet = new TreeSet<>(LongStream.rangeClosed(2, q).boxed().collect(toSet()));
        for (long i = p; i > p - q; --i) {
            final long i_ = i;
            final Long div = hashSet.stream().filter(k -> i_ % k == 0).findFirst().orElse(1L);
            hashSet.remove(div);
            result *= (i / div);
            if (result > MOD) {
                result = result % MOD;
            }
        }
        return result;
    }
}
