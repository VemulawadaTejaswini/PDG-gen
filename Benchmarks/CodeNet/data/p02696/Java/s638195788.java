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

            long border = Math.min(b - 1, n);
            out.append(String.valueOf((int) cal(border, a, b)));

        }

        public double cal(long x, long a, long b) {
            return Math.floor(a * x / b) - a * Math.floor(x / b);
        }

    }
}

