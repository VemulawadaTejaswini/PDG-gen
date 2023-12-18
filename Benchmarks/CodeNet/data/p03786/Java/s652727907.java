import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
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
        TaskAFG011B solver = new TaskAFG011B();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAFG011B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            Arrays.sort(a);

            long[] psum = new long[n];
            psum[0] = a[0];
            for (int i = 1; i < n; i++) {
                psum[i] = a[i] + psum[i - 1];
            }

            int start = 0;
            int end = n - 1;
            int firstPossible = n - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (possible(mid, a, psum)) {
                    firstPossible = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            System.out.print(n - firstPossible);
        }

        private boolean possible(int pos, long[] a, long[] psum) {
            long startSize = psum[pos];

            int index = pos + 1;
            while (index < a.length) {
                if (startSize * 2 < a[index]) {
                    return false;
                }
                startSize += a[index];
                index++;
            }
            return true;
        }
    }
}

