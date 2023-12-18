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
        FloorFunction solver = new FloorFunction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FloorFunction {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long n = in.nextLong();

            long r = n;
            long l = 1;
            double result = 0;
            while (l < r && r <= n) {
                double tl = cal(l, a, b);
                double tr = cal(r, a, b);
                if (tl < tr) {
                    l += (r - l) / 2 + 1;
                } else {
                    r -= (r - l) / 2 - 1;
                }
                result = Math.max(tl, tr);
            }
            out.append(String.valueOf((int) result));

        }

        public double cal(long x, long a, long b) {
            return Math.floor(a * x / b) - a * Math.floor(x / b);
        }

    }
}

