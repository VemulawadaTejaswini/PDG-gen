import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Twinkle Twinkle Little Star
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBounding solver = new BBounding();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBounding {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong(), x = in.nextLong();
            long count = 1, sum = 0;
            for (long i = 1; i <= n; i++) {
                long y = in.nextLong();
                sum += y;
                if (sum <= x) count++;
            }
            out.println(count);

        }

    }
}

