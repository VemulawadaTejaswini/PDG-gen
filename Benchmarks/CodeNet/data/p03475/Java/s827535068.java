import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] c = new int[n];
            int[] s = new int[n];
            int[] f = new int[n];
            for (int i = 0; i < n - 1; ++i) {
                c[i] = in.nextInt();
                s[i] = in.nextInt();
                f[i] = in.nextInt();
            }

            for (int i = 0; i < n - 1; ++i) {
                int cur = s[i] + c[i];
                for (int j = i + 1; j < n - 1; ++j) {
                    if (cur < s[j]) {
                        cur = s[j];
                    } else if (cur % f[j] != 0) {
                        cur += f[j] - cur % f[j];
                    }
                    cur += c[j];
                }
                out.println(cur);
            }

            out.println(0);
        }

    }
}

