import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

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
        KatanaThrower solver = new KatanaThrower();
        solver.solve(1, in, out);
        out.close();
    }

    static class KatanaThrower {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long h = in.nextLong();

            Long[] a = new Long[n];
            Long[] b = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in.next());
                b[i] = Long.parseLong(in.next());
            }
            Arrays.sort(a, Collections.reverseOrder());
            Arrays.sort(b, Collections.reverseOrder());
            long amax = a[0];
            long bmax = b[0];
            int bpos = 0;
            long result = 0;
            while (0 < h && amax <= bmax) {
                h -= bmax;
                result++;
                bpos++;
                if (b.length <= bpos) {
                    break;
                }
                bmax = b[bpos];
            }
            if (0 < h) {
                result += (h % amax == 0) ? h / amax : h / amax + 1;
            }
            out.println(result);
        }

    }
}

