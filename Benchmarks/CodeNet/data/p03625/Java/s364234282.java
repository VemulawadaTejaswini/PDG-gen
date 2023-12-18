import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long max1 = 0;
            long max2 = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            Arrays.sort(a);
            for (int i = n - 1; i > 0; i--) {
                if (a[i - 1] == a[i]) {
                    max1 = a[i];
                    for (int j = i - 2; j > 0; j--) {
                        if (a[j - 1] == a[j]) {
                            max2 = a[j];
                            out.println(max1 * max2);
                            return;
                        }
                        if (j == 1) {
                            out.println(0);
                            return;
                        }
                    }
                }
            }
            out.println(0);
        }

    }
}

