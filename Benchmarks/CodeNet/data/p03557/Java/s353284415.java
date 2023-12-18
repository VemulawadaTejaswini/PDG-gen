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
            long ans = 0;
            int ai = 0;
            int ci = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);

        /*
        out.println(Arrays.toString(a));
        out.println(Arrays.toString(b));
        out.println(Arrays.toString(c));
        
         */

            for (int i = 0; i < n; i++) {
                // 各b[i]について考えればいい
                while (ai < n && a[ai] < b[i]) {
                    ai++;
                }
                while (ci < n && c[ci] <= b[i]) {
                    ci++;
                }
                // out.println((long) ai * (long) (n - ci));
                ans += (long) ai * (long) (n - ci);
            }

            out.println(ans);


        }

    }
}

