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
        CSqrtInequality solver = new CSqrtInequality();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSqrtInequality {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            if (c - a - b < 0 || (c - a - b) * (c - a - b) <= 4 * a * b) {
                out.println("No");
            } else {
                out.println("Yes");
            }
        }

    }
}

