import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEoui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskBAtCoder solver = new TaskBAtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskBAtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            int ans = 0;
            for (int i = 1; i <= n; i += 2) {
                int cnt = divisors(i);
                if (cnt == 8) {
                    ++ans;
                    //out.println(i + " " + cnt);
                }
            }

            out.println(ans);
        }

        private int divisors(int n) {
            int cnt = 0;
            for (int i = 1; i <= n; ++i) {
                if (n % i == 0)
                    ++cnt;
            }

            return cnt;
        }

    }
}

