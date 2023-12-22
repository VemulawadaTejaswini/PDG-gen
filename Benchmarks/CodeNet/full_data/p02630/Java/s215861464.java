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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            int[] cnt = new int[110000];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                cnt[a[i]]++;
                sum += a[i];
            }
            int q = Integer.parseInt(in.next());
            int[] b = new int[q];
            int[] c = new int[q];
            for (int i = 0; i < q; i++) {
                b[i] = Integer.parseInt(in.next());
                c[i] = Integer.parseInt(in.next());
            }

            for (int i = 0; i < q; i++) {
                long tmp = cnt[b[i]];
                sum -= b[i] * tmp;
                sum += c[i] * tmp;
                cnt[b[i]] = 0;
                cnt[c[i]] += tmp;
                out.println(sum);
            }

        }

    }
}

