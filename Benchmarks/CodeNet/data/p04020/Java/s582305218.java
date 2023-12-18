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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) continue;
                ans += a[i] / 2;
                a[i] %= 2;
                if (a[i] == 1) {
                    if (i + 1 < n && a[i + 1] != 0) {
                        a[i]--;
                        a[i + 1]--;
                        ans++;
                    }
                }
            }
            out.println(ans);
        }

    }
}

