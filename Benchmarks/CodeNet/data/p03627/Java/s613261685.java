import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Integer[] a = new Integer[n];
            long[] kinds = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                kinds[a[i] - 1]++;
            }
            long ans = 0;
            Arrays.sort(a, Comparator.reverseOrder());
            for (int i = 0; i < n; i++) {
                if (kinds[a[i] - 1] >= 4) {
                    ans = a[i] * a[i];
                    out.println(ans);
                    return;
                } else if (kinds[a[i] - 1] >= 2) {
                    int tmp = a[i];
                    for (int j = i + 1; j < n - 1; j++) {
                        if (a[j - 1] != a[j] && kinds[a[j] - 1] >= 2) {
                            ans = a[j] * tmp;
                            out.println(ans);
                            return;
                        }
                    }
                }
            }

            out.println(ans);

        }

    }
}

