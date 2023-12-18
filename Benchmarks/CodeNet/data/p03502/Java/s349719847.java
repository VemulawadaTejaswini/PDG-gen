import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        BHarshadNumber solver = new BHarshadNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class BHarshadNumber {
        private static final String YES = "Yes";
        private static final String NO = "No";

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), t = n;
            int f = 0;
            while (t > 0) {
                f += t % 10;
                t /= 10;
            }
            out.println(n % f == 0 ? YES : NO);
        }

    }
}

