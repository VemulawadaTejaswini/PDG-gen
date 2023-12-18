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
        BMaximumDifference solver = new BMaximumDifference();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMaximumDifference {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int min = Integer.MAX_VALUE, max = 0;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                min = Math.min(min, a);
                max = Math.max(max, a);
            }
            out.println(max - min);
        }

    }
}

