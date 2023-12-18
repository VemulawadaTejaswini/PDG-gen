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
        COrdinaryBeauty solver = new COrdinaryBeauty();
        solver.solve(1, in, out);
        out.close();
    }

    static class COrdinaryBeauty {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong(), m = in.nextLong(), d = in.nextLong();
            if (d == 0) {
                out.printf("%.10f", (m - 1) / (double) n);
            } else {
                out.printf("%.10f", 2 * (n - d) * (m - 1) / (double) (n * n));
            }
        }

    }
}

