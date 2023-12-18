import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ProblemB_TwoContests solver = new ProblemB_TwoContests();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemB_TwoContests {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            Segment[] s = new Segment[n];
            for (int i = 0; i < n; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                s[i] = new Segment(l, r);
            }
            int ans = solve(s);
            for (Segment seg : s) {
                seg.reflect();
            }
            ans = Math.max(ans, solve(s));
            out.println(ans);
        }

        private int solve(Segment[] s) {
            int n = s.length;
            Arrays.sort(s);
            Segment[] pref = new Segment[n];
            for (int i = 0; i < n; i++) {
                pref[i] = s[i];
                if (i > 0) {
                    pref[i] = intersect(pref[i], pref[i - 1]);
                }
            }
            Segment[] suff = new Segment[n];
            for (int i = n - 1; i >= 0; i--) {
                suff[i] = s[i];
                if (i + 1 < n) {
                    suff[i] = intersect(suff[i], suff[i + 1]);
                }
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (Segment seg : s) {
                min = Math.min(min, seg.l);
                min = Math.min(min, seg.r);
                max = Math.max(max, seg.l);
                max = Math.max(max, seg.r);
            }

            int res = 0;
            final int N = (int) 1e9;
            for (int i = 0; i < n; i++) {
                Segment o = new Segment(min, max);
                if (i + 1 < n) {
                    o = intersect(o, suff[i + 1]);
                    res = Math.max(res, pref[i].length() + o.length());
                }
                if (i > 0) {
                    o = intersect(o, pref[i - 1]);
                }
                res = Math.max(res, s[i].length() + o.length());
            }
            return res;
        }

        Segment intersect(Segment a, Segment b) {
            return new Segment(Math.max(a.l, b.l), Math.min(a.r, b.r));
        }

        class Segment implements Comparable<Segment> {
            int l;
            int r;

            Segment(int l, int r) {
                this.l = l;
                this.r = r;
            }

            int length() {
                return Math.max(0, r - l + 1);
            }

            public int compareTo(Segment o) {
                if (l != o.l) {
                    return l < o.l ? -1 : 1;
                }
//            if (r != o.r) {
//                return r < o.r ? -1 : 1;
//            }
                return 0;
            }

            public void reflect() {
                int nl = -r;
                int nr = -l;
                l = nl;
                r = nr;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

