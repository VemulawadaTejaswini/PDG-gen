import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Echizen
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        private final static int MOD = (int) (1e9 + 7);

        private long Sum(long a) {
            long sum = 1;
            for (long i = 1; i <= a; i++) {
                sum = sum * i % MOD;
            }
            return sum;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int m, n;
            m = in.nextInt();
            n = in.nextInt();
            if (Math.abs(n - m) >= 2) {
                out.println(0);
            } else if (Math.abs(n - m) == 1) {
                out.println(Sum(n) * Sum(m) % MOD);
            } else {
                out.println(2 * Sum(n) * Sum(m) % MOD);
            }
        }

    }
}

