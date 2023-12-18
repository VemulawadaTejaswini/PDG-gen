import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.LongStream;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDecreaseContestantVer solver = new DDecreaseContestantVer();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecreaseContestantVer {
        private static final int MAX_PILES = 50;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            out.println(MAX_PILES);
            long k = in.nextLong();
            long m = k % MAX_PILES;
            k /= MAX_PILES;

            long[] a = new long[MAX_PILES];
            Arrays.fill(a, MAX_PILES + k - m - 1);
            for (int i = 0; i < m; i++) {
                a[i] += MAX_PILES + 1;
            }
            out.println(Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" ")));
        }

    }
}

