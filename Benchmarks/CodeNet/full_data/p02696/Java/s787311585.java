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
        abc165_e solver = new abc165_e();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc165_e {
        long max = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long A = in.nextLong();
            long B = in.nextLong();
            long N = in.nextLong();
            out.println(calc(A, B, N));
        }

        private long calc(long a, long b, long x) {
            if (x == 0) {
                return max;
            }
            long ans = (long) (Math.floor((a * x) / b) - a * Math.floor(x / b));
            if (ans > max) {
                max = ans;
            }
            calc(a, b, --x);
            return max;
        }

    }
}

