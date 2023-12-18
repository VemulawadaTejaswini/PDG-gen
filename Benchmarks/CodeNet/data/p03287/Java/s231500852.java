import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;

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
        DCandyDistribution solver = new DCandyDistribution();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCandyDistribution {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            Map<Integer, Integer> values = new HashMap<>();
            values.put(0, 1);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
                sum %= m;
                values.merge(sum, 1, (v1, v2) -> v1 + v2);
            }
            out.println(values.values().stream().mapToLong(i -> (i - 1L) * i / 2).sum());
        }

    }
}

