import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        WIntervals solver = new WIntervals();
        solver.solve(1, in, out);
        out.close();
    }

    static class WIntervals {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            PriorityQueue<up> pq = new PriorityQueue<>((u1, u2) ->
            {
                return u1.r - u2.r;
            });

            int n = in.nextInt();
            int m = in.nextInt();

            long[] dp = new long[n];

            Arrays.fill(dp, Long.MIN_VALUE);

            SimpleLazySegmentTree st = new SimpleLazySegmentTree(dp, n);
            st.build(0, 0, n - 1);

            up[] ups = new up[m];
            for (int i = 0; i < m; i++) {
                ups[i] = new up(in.nextInt() - 1, in.nextInt() - 1, in.nextInt());
            }

            Arrays.sort(ups, (u1, u2) -> u1.l - u2.l);

            int j = 0;


            long ans = 0;
            long cur = 0;
            for (int i = 0; i < n; i++) {
                while (j < m && ups[j].l == i) {
                    cur += ups[j].a;
                    pq.add(ups[j]);
                    if (ups[j].l > 0) {
                        st.update(0, 0, n - 1, 0, ups[j].l - 1, ups[j].a);
                    }
                    j++;
                }

                while (!pq.isEmpty() && pq.peek().r + 1 == i) {
                    up cu = pq.poll();

                    if (cu.l > 0) {
                        st.update(0, 0, n - 1, 0, cu.l - 1, -cu.a);
                    }

                    cur -= cu.a;
                }

                dp[i] = st.query(0, 0, n - 1, 0, i - 1);

                dp[i] = Math.max(dp[i], cur);

                st.update(0, 0, n - 1, i, i, -Long.MIN_VALUE + dp[i]);

                ans = Math.max(ans, dp[i]);
            }

            //ans = Math.max(ans, st.query(0, 0, n - 1, 0, n - 1));

            out.println(ans);
        }

        class SimpleLazySegmentTree {
            long[] tree;
            int n;
            long[] lazy;
            boolean[] lu;
            long[] a;
            long minf = Long.MIN_VALUE;

            public SimpleLazySegmentTree(long[] a, int n) {
                super();
                this.n = n;
                this.a = a;
                this.tree = new long[4 * n];
                this.lazy = new long[4 * n];
                this.lu = new boolean[4 * n];
            }

            public long build(int i, int rs, int re) {
                if (rs == re) {
                    tree[i] = a[rs];
                    return tree[i];
                } else {
                    int mid = (rs + re) / 2;

                    long left = build(i * 2 + 1, rs, mid);
                    long right = build(i * 2 + 2, mid + 1, re);

                    tree[i] = Math.max(left, right);

                    return tree[i];
                }
            }

            public long query(int i, int rs, int re, int qs, int qe) {
                lazyAdjustment(i, rs, re);

                if (re < qs || qe < rs) {
                    return minf;
                }

                if (qs <= rs && qe >= re) {
                    return tree[i];
                }

                int mid = (rs + re) / 2;

                long p1 = query(i * 2 + 1, rs, mid, qs, qe);
                long p2 = query(i * 2 + 2, mid + 1, re, qs, qe);

                return Math.max(p1, p2);
            }

            private void lazyAdjustment(int i, int rs, int re) {
                if (!lu[i])
                    return;

                //Do something with the lazy value
                //tree[i] = pst.query(pst.roots[rs], pst.roots[re + 1], 0, pst.mv, lazy[i]);
                tree[i] += lazy[i];

                if (rs < re) {
                    lazy[i * 2 + 1] += lazy[i];
                    lu[i * 2 + 1] = true;

                    lazy[i * 2 + 2] += lazy[i];
                    lu[i * 2 + 2] = true;
                }

                lu[i] = false;
                lazy[i] = 0;
            }

            public long update(int i, int rs, int re, int us, int ue, long add) {
                if (re < us || ue < rs) {
                    lazyAdjustment(i, rs, re);
                    return tree[i];
                }

                if (us <= rs && ue >= re) {
                    lazy[i] += add;
                    lu[i] = true;
                    lazyAdjustment(i, rs, re);
                    return tree[i];
                }

                lazyAdjustment(i, rs, re);

                int mid = (rs + re) / 2;

                long p1 = update(i * 2 + 1, rs, mid, us, ue, add);
                long p2 = update(i * 2 + 2, mid + 1, re, us, ue, add);

                tree[i] = Math.max(p1, p2);

                return tree[i];
            }

        }

        class up {
            int l;
            int r;
            long a;

            public up(int l, int r, long a) {
                this.l = l;
                this.r = r;
                this.a = a;
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

