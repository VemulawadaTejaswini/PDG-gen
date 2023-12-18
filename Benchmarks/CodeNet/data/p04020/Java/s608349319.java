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
            int a[] = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                ans += a[i] / 2;
                a[i] %= 2;
            }
            int ans1 = 0, ans2 = 0;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == 1 && a[i + 1] == 1) {
                    ans1++;
                    a[i]--;
                    a[i + 1]--;
                }
            }
            for (int i = 1; i < n - 1; i++) {
                if (a[i] == 1 && a[i + 1] == 1) {
                    ans2++;
                    a[i]--;
                    a[i + 1]--;
                }
            }
            out.println(ans + Math.max(ans1, ans2));
        }

    }
}

