import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSnukeFestival solver = new CSnukeFestival();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSnukeFestival {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < n; i++) b[i] = in.nextInt();
            for (int i = 0; i < n; i++) c[i] = in.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);
            long sum = 0;

            for (int i = 0; i < n; i++) {
                // 各b_iについてそれより小さいa_iの個数とそれより大きいc_iの個数を探す
                int ng = -1;
                int ok = a.length;
                while (Math.abs(ok - ng) > 1) {
                    int mid = (ok + ng) / 2;
                    if (a[mid] >= b[i]) {
                        ok = mid;
                    } else {
                        ng = mid;
                    }
                    // ok個
                }
                long cnta = ok;

                ng = -1;
                ok = c.length;
                while (Math.abs(ok - ng) > 1) {
                    int mid = (ok + ng) / 2;
                    if (c[mid] > b[i]) {
                        ok = mid;
                    } else {
                        ng = mid;
                    }
                }
                // c[ng]までが満たさない
                long cntc = n - 1 - ng;
                sum += cnta * cntc;
            }

            out.println(sum);

        }

    }
}

