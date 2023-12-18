import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lewin
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
            int n = in.nextInt(), m = in.nextInt();
            WIntervals.Interval[] its = new WIntervals.Interval[m];
            for (int i = 0; i < m; i++) {
                its[i] = new WIntervals.Interval(in.nextInt(), in.nextInt(), in.nextInt());
            }

            Arrays.sort(its, Comparator.comparingInt(x -> x.r));

            SegmentTreeLong st = new SegmentTreeLong(n + 3);
            st.modify(0, 0, 0);
            long[] dp = new long[n + 2];
            int idx = 0;
            for (int i = 1; i <= n + 1; i++) {
                while (idx < m && its[idx].r < i) {
                    st.modify(its[idx].l, its[idx].r, its[idx].a);
                    idx++;
                }
                dp[i] = st.query(0, i - 1);
                st.modify(i, i, dp[i]);
            }
            out.println(dp[n + 1]);

        }

        static class Interval {
            public int l;
            public int r;
            public int a;

            public Interval(int l, int r, int a) {
                this.l = l;
                this.r = r;
                this.a = a;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
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

    static class SegmentTreeLong {
        long[] value;
        long[] delta;

        public SegmentTreeLong(int n) {
            value = new long[2 * n];
            for (int i = 0; i < n; i++) {
                value[i + n] = getInitValue();
            }
            for (int i = 2 * n - 1; i > 1; i -= 2) {
                value[i >> 1] = queryOperation(value[i], value[i ^ 1]);
            }
            delta = new long[2 * n];
            Arrays.fill(delta, getNeutralDelta());
        }

        long modifyOperation(long x, long y) {
            return x + y;
        }

        long queryOperation(long leftValue, long rightValue) {
            return Math.max(leftValue, rightValue);
        }

        long deltaEffectOnSegment(long delta, int segmentLength) {
            if (delta == getNeutralDelta()) return getNeutralDelta();
            // Here you must write a fast equivalent of following slow code:
            // int result = delta;
            // for (int i = 1; i < segmentLength; i++) result = queryOperation(result, delta);
            // return result;
            return delta;
//        return delta * segmentLength;
        }

        long getNeutralDelta() {
            return 0;
        }

        long getInitValue() {
            return 0;
        }

        long joinValueWithDelta(long value, long delta) {
            if (delta == getNeutralDelta()) return value;
            return modifyOperation(value, delta);
        }

        long joinDeltas(long delta1, long delta2) {
            if (delta1 == getNeutralDelta()) return delta2;
            if (delta2 == getNeutralDelta()) return delta1;
            return modifyOperation(delta1, delta2);
        }

        void pushDelta(int i) {
            int d = 0;
            for (; (i >> d) > 0; d++) {
            }
            for (d -= 2; d >= 0; d--) {
                int x = i >> d;
                value[x >> 1] = joinNodeValueWithDelta(x >> 1, 1 << (d + 1));
                delta[x] = joinDeltas(delta[x], delta[x >> 1]);
                delta[x ^ 1] = joinDeltas(delta[x ^ 1], delta[x >> 1]);
                delta[x >> 1] = getNeutralDelta();
            }
        }

        long joinNodeValueWithDelta(int i, int len) {
            return joinValueWithDelta(value[i], deltaEffectOnSegment(delta[i], len));
        }

        public long query(int from, int to) {
            if (to < from) return 0;
            from += value.length >> 1;
            to += value.length >> 1;
            pushDelta(from);
            pushDelta(to);
            long res = 0;
            boolean found = false;
            for (int len = 1; from <= to; from = (from + 1) >> 1, to = (to - 1) >> 1, len <<= 1) {
                if ((from & 1) != 0) {
                    res = found ? queryOperation(res, joinNodeValueWithDelta(from, len)) : joinNodeValueWithDelta(from, len);
                    found = true;
                }
                if ((to & 1) == 0) {
                    res = found ? queryOperation(res, joinNodeValueWithDelta(to, len)) : joinNodeValueWithDelta(to, len);
                    found = true;
                }
            }
            if (!found) throw new RuntimeException();
            return res;
        }

        public void modify(int from, int to, long delta) {
            if (from > to) return;
            from += value.length >> 1;
            to += value.length >> 1;
            pushDelta(from);
            pushDelta(to);
            int a = from;
            int b = to;
            for (; from <= to; from = (from + 1) >> 1, to = (to - 1) >> 1) {
                if ((from & 1) != 0) {
                    this.delta[from] = joinDeltas(this.delta[from], delta);
                }
                if ((to & 1) == 0) {
                    this.delta[to] = joinDeltas(this.delta[to], delta);
                }
            }
            for (int i = a, len = 1; i > 1; i >>= 1, len <<= 1) {
                value[i >> 1] = queryOperation(joinNodeValueWithDelta(i, len), joinNodeValueWithDelta(i ^ 1, len));
            }
            for (int i = b, len = 1; i > 1; i >>= 1, len <<= 1) {
                value[i >> 1] = queryOperation(joinNodeValueWithDelta(i, len), joinNodeValueWithDelta(i ^ 1, len));
            }
        }

    }
}

