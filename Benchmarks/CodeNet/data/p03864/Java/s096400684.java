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
        TaskATC64C solver = new TaskATC64C();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskATC64C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            int x = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            long o = 0L;

            for (int i = 0; i < n - 1; i++) {
                int f = a[i];
                int s = a[i + 1];

                int sum = f + s;
                if (sum > x) {
                    int delta = sum - x;
                    o += delta;

                    int m = Math.min(delta, s);
                    a[i + 1] = a[i + 1] - m;
                    int rem = delta - m;
                    a[i] = a[i] - rem;
                }
            }
            out.println(o);
        }
    }
}

