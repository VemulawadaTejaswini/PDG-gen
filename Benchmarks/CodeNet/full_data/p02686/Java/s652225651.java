
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        int n = sc.nextInt();
        String[] kk = new String[n];
        for (int i = 0; i < n; i++) {
            kk[i] = sc.next();
        }

        Pair[] psl = new Pair[n];
        Pair[] psr = new Pair[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int cpl = 0, cml = 0, cpr = 0, cmr = 0;
            int l = kk[i].length();
            for (int j = 0; j < l; j++) {
                cpl += kk[i].charAt(j) == '(' ? 1 : -1;
                cml = Math.min(cml, cpl);
                cpr += kk[i].charAt(l - j - 1) == ')' ? 1 : -1;
                cmr = Math.min(cmr, cpr);
            }
            psl[i] = new Pair(-cmr, cml);
            psr[i] = new Pair(-cml, cmr);
            sum += cpl;
        }
        Arrays.sort(psl);
        debug(sum, psl);

        if (sum != 0) {
            out.println("No");
        } else {
            boolean ok = true;
            int cl = 0, li = 0;
            int cr = 0, ri = n - 1;

            for (int i = 0; i < n; i++) {

                if (cl + psl[i].m < 0) {
                    ok = false;
                    li = i;
                }

                cl += psl[i].m + psl[i].p;
            }
            ok &= cl == 0;
            out.println(ok ? "Yes" : "No");
        }

        out.flush();
    }

    class Pair implements Comparable<Pair> {
        int p, m;

        Pair(int p, int m) {
            this.p = p;
            this.m = m;
        }

        @Override
        public int compareTo(Pair o) {
            if (p != o.p) {
                return o.p - p;
            }
            return o.m - m;
        }

        @Override
        public String toString() {
            return "(" + p + ", " + m + ")";
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}