
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

        Pair[] ps = new Pair[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int cp = 0, cm = 0;
            int l = kk[i].length();
            for (int j = 0; j < l; j++) {
                cp += kk[i].charAt(j) == '(' ? 1 : -1;
                cm = Math.min(cm, cp);
            }
            ps[i] = new Pair(cp, cm);
            sum += cp;
        }

        debug(sum, ps);

        if (sum != 0) {
            out.println("No");
        } else {
            Arrays.sort(ps);
            boolean ok = true;
            int c = 0;
            for (Pair p : ps) {
                if (c + p.m < 0) {
                    ok = false;
                    break;
                }
                c += p.p;
            }
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
            if (m != o.m) {
                return o.m - m;
            }
            return o.p - p;
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