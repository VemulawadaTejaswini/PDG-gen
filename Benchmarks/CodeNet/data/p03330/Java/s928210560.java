
import static java.util.stream.Collectors.toSet;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.LongStream;

public class Main {
    static final long MOD = 998244353;

    final int n;
    final int c;
    final int cost[][];
    final int initial[][];

    public Main(final int n, final int c, final int[][] cost, final int[][] initial) {
        this.n = n;
        this.c = c;
        this.cost = cost;
        this.initial = initial;
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int c = scanner.nextInt();

        final int cost[][] = new int[c][c];
        for (int i = 0; i < c; i++) {
            final int[] costLine = new int[c];
            for (int j = 0; j < c; j++) {
                costLine[j] = scanner.nextInt();
            }
            cost[i] = costLine;
        }

        final int initial[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            final int[] initialLine = new int[n];
            for (int j = 0; j < n; j++) {
                initialLine[j] = scanner.nextInt() - 1;
            }
            initial[i] = initialLine;
        }

        final long result = new Main(n, c, cost, initial).calculate();

        System.out.println(result);
    }

    long calculate() {
        final int[][] countSlot = new int[3][c];
        for (int i = 0; i < 3; ++i) {
            countSlot[i] = new int[c];
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                countSlot[(i + j) % 3][initial[i][j]]++;
            }
        }

        final int trans[][] = new int[3][c];
        for (int i = 0; i < 3; ++i) {
            trans[i] = new int[c];
        }

        for (int i = 0; i < 3; ++i) {
            for (int row = 0; row < c; ++row) {
                for (int col = 0; col < c; ++col) {
                    trans[i][col] += countSlot[i][row] * cost[row][col];
                }
            }
        }

        // find minimum
        int minimum = Integer.MAX_VALUE;
        for (int i0 = 0; i0 < c; ++i0) {
            for (int i1 = 0; i1 < c; ++i1) {
                if (i0 == i1) {
                    continue;
                }
                if (trans[0][i0] + trans[1][i1] >= minimum) {
                    continue;
                }

                for (int i2 = 0; i2 < c; ++i2) {
                    if (i0 == i2 || i1 == i2) {
                        continue;
                    }

                    final int costInThisSwitch = trans[0][i0] + trans[1][i1] + trans[2][i2];
                    if (minimum > costInThisSwitch) {
                        minimum = costInThisSwitch;
                    }
                }
            }
        }

        return minimum;
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
