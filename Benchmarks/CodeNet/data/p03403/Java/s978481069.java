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
        CTravelingPlan solver = new CTravelingPlan();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTravelingPlan {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 2];
            long sum = 0;
            for (int i = 0; i <= n + 1; i++) {
                if (i == 0) a[i] = 0;
                else if (i == n + 1) a[i] = 0;
                else a[i] = in.nextInt();
            }
            for (int i = 1; i <= n + 1; i++) {
                sum += Math.abs(a[i] - a[i - 1]);
            }

            for (int i = 1; i <= n; i++) {
                // iがいかない
                out.println(sum - Math.abs(a[i] - a[i - 1]) - Math.abs(a[i] - a[i + 1]) + Math.abs(a[i - 1] - a[i + 1]));
            }

        }

    }
}

