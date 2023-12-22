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
        Task2 solver = new Task2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long k = in.nextLong();
            long a1[] = new long[n + 1];
            long a2[] = new long[m + 1];
            a1[0] = 0;
            a2[0] = 0;
            for (int i = 1; i <= n; ++i) {
                a1[i] = a1[i - 1] + in.nextLong();
            }
            for (int i = 1; i <= m; ++i) {
                a2[i] = a2[i - 1] + in.nextLong();
            }
            long ans = 0;
            for (int i = 0; i <= n && a1[i] <= k; ++i) {
                while (a1[i] + a2[m] > k) m--;
                ans = Math.max(ans, i + m);
            }
            out.println(ans);
        }

    }
}

