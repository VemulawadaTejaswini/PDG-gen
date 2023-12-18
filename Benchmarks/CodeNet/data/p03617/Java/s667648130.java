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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long q = in.nextLong();
            long h = in.nextLong();
            long s = in.nextLong();
            long d = in.nextLong();
            if (2 * q < h) {
                h = 2 * q;
            }
            if (2 * h < s) {
                s = 2 * h;
            }

            long n = in.nextLong();
            out.println(Math.min(s * n, n / 2 * d + (n % 2) * s));
        }

    }
}

