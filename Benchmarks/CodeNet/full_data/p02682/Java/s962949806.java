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
        EasyLinearProgramming solver = new EasyLinearProgramming();
        solver.solve(1, in, out);
        out.close();
    }

    static class EasyLinearProgramming {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int k = in.nextInt();

            int result = 0;
            if (a > 0) {
                int min = Math.min(a, k);
                k -= min;
                result += min;
            }
            if (b > 0) {
                int min = Math.min(b, k);
                k -= min;
            }
            if (c > 0) {
                int min = Math.min(c, k);
                k -= min;
                result -= min;
            }
            out.append(String.valueOf(result));
        }

    }
}

