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
        BSumOfThreeIntegers solver = new BSumOfThreeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSumOfThreeIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int k = in.nextInt(), s = in.nextInt();
            long ans = 0;
            for (int x = Math.max(0, s - 2 * k); x <= Math.min(k, s); x++) {
                for (int y = Math.max(0, s - x - k); y <= Math.min(k, s - x); y++) {
                    ans++;
                }
            }
            out.println(ans);
        }

    }
}

