import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SimpleKnapsack solver = new SimpleKnapsack();
        solver.solve(1, in, out);
        out.close();
    }

    static class SimpleKnapsack {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();

            long[] weights = new long[n];
            long[] values = new long[n];
            for (int i = 0; i < n; i++) {
                long ww = Long.parseLong(in.next());
                long vv = Long.parseLong(in.next());
                weights[i] = ww;
                values[i] = vv;
            }

            long result = 0;
            for (int i = 0; i < (1 << n); i++) {
                long tmp = 0;
                long tmpv = 0;
                for (int j = 0; j < n; j++) {
                    if (((i >> j) & 1) == 1) {
                        if (tmp + weights[j] <= w) {
                            tmp += weights[j];
                            tmpv += values[j];
                        }
                    }
                }
                result = Math.max(result, tmpv);
            }
            out.println(result);
        }

    }
}

