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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextLong();
            }
            for (int i = 0; i < n; ++i) {
                b[i] = in.nextLong();
            }
            for (int i = 0; i < n - 1; ++i) {
                if (a[i] < b[i]) {
                    long diff = b[i] - a[i];
                    long cnt = (diff + 1) / 2;
                    a[i] += cnt * 2;
                    b[n - 1] += cnt;
                }
                if (a[i] > b[i]) {
                    long diff = a[i] - b[i];
                    b[i] = a[i];
                    a[n - 1] += 2 * diff;
                }
            }

            if (a[n - 1] <= b[n - 1]) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }
}

