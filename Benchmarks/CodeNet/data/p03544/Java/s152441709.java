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
        BLucasNumber solver = new BLucasNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class BLucasNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long[] r = new long[87];
            r[0] = 2;
            r[1] = 1;
            for (int i = 2; i < 87; i++) {
                r[i] = r[i - 2] + r[i - 1];
            }
            out.println(r[in.nextInt()]);
        }

    }
}

