
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final long MOD = 1_000_000_007;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final long[] accum = new long[200_001];
        final long[] sums = new long[n];
        final int first = scanner.nextInt();
        int prev = first;
        accum[first] = 1;
        sums[0] = 1;
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1];
            final int c = scanner.nextInt();
            if (prev == c) {
                continue;
            }
            prev = c;

            sums[i] += accum[c];
            sums[i] %= MOD;
            accum[c] += sums[i - 1];
            accum[c] %= MOD;
        }

        System.out.println(sums[n - 1]);
    }
}
