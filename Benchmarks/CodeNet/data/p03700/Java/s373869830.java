import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.function.Predicate;
import java.util.Scanner;

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
        DWidespread solver = new DWidespread();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWidespread {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
            long[] h = LongStream.range(0, n).map(x -> in.nextInt()).toArray();
            Predicate<Integer> p = k -> Arrays.stream(h)
                    .map(i -> i - b * k)
                    .filter(i -> i > 0)
                    .map(i -> (i + a - b - 1) / (a - b)).sum() <= k;
            int min = 1, max = 1000_000_000;
            while (max - min > 1) {
                int mid = (min + max) / 2;
                if (p.test(mid)) {
                    max = mid;
                } else {
                    min = mid;
                }
            }
            out.println(p.test(min) ? min : max);
        }

    }
}

