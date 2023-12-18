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
        APC001B solver = new APC001B();
        solver.solve(1, in, out);
        out.close();
    }

    static class APC001B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long aSum = 0;
            long bSum = 0;
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                aSum += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                bSum += b[i];
            }

            if (aSum > bSum) {
                out.println("No");
                return;
            }

            long count = bSum - aSum;
            for (long i = 0; i < count; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[j] < b[j]) {
                        a[j] += 2;
                        if (a[j] % 2 == b[j] % 2) {
                            boolean done = false;
                            for (int k = j; k < n; k++) {
                                if (!done && a[k] > b[k] && a[k] % 2 != b[k] % 2) {
                                    b[k] += 1;
                                    done = true;
                                }
                            }
                            for (int k = j; k < n; k++) {
                                if (!done && a[k] > b[k]) {
                                    b[k] += 1;
                                    done = true;
                                }
                            }
                            if (!done) b[n - 1] += 1;
                        } else {
                            b[j] += 1;
                        }
                    } else if (a[j] > b[j]) {
                        b[j] += 1;
                        boolean done = false;
                        for (int k = j; k < n; k++) {
                            if (!done && a[k] < b[k]) {
                                a[k] += 2;
                            }
                        }
                        if (!done) a[n - 1] += 2;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

    }
}

