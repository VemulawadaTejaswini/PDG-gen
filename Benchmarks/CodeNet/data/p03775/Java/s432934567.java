import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CDigitsInMultiplication solver = new CDigitsInMultiplication();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDigitsInMultiplication {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            int min = 100;
            for (long i = 1; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    min = Math.min(min, f(i, n / i));
                }
            }
            out.println(min);
        }

        int f(long a, long b) {
            return Math.max(Long.toString(a).length(), Long.toString(b).length());
        }

    }
}

