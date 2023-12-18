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
        RedGreenApples solver = new RedGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class RedGreenApples {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            Long[] p = new Long[a + 1];
            Long[] q = new Long[b + 1];
            Long[] r = new Long[c + 1];
            p[a] = 0L;
            q[b] = 0L;
            r[c] = 0L;

            for (int i = 0; i < a; i++) {
                p[i] = Long.parseLong(in.next());
            }
            for (int i = 0; i < b; i++) {
                q[i] = Long.parseLong(in.next());
            }
            for (int i = 0; i < c; i++) {
                r[i] = Long.parseLong(in.next());
            }
            Arrays.sort(p, Collections.reverseOrder());
            Arrays.sort(q, Collections.reverseOrder());
            Arrays.sort(r, Collections.reverseOrder());

            int ai = 0;
            int bi = 0;
            int ci = 0;
            int cai = 0;
            int cbi = 0;

            long result = 0;
            while (true) {
                if ((ai + cai) == x && (bi + cbi) == y) {
                    break;
                }
                if (ai + cai < x && r[ci] <= p[ai]) {
                    result += p[ai];
                    ai++;
                    continue;
                }
                if (bi + cbi < y && r[ci] <= q[bi]) {
                    result += q[bi];
                    bi++;
                    continue;
                }
                if (ai + cai == x) {
                    result += r[ci];
                    ci++;
                    cbi++;
                    continue;
                }
                if (bi + cbi == y) {
                    result += r[ci];
                    ci++;
                    cai++;
                    continue;
                }
                long aa = (ai == p.length ? 0 : p[ai]);
                long bb = (bi == q.length ? 0 : q[bi]);
                if (Math.abs(r[ci] - bb) <= Math.abs(r[ci] - aa)) {
                    result += r[ci];
                    ci++;
                    cbi++;
                } else {
                    result += r[ci];
                    ci++;
                    cai++;
                }
            }

            out.println(result);

        }

    }
}

