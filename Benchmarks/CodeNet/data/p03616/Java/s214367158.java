import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Comparator;
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
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        int B;
        int S;
        int[] bucketS;
        int[] bucketA;
        SegRMQInt seg;
        int X;
        int K;
        int Q;
        int[] r;
        int[][] qs;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            X = in.nextInt();
            K = in.nextInt();
            r = new int[K + 1];
            System.arraycopy(in.nextIntArray(K), 0, r, 0, K);
            r[K] = Integer.MAX_VALUE;
            Q = in.nextInt();
            qs = in.nextIntArray2DWithIndex(Q, 2);
            Arrays.sort(qs, Comparator.comparingInt(a -> a[1]));
            seg = new SegRMQInt(K);
            for (int i = 0; i < K; i++) {
                seg.set(i, qs[i][1]);
                qs[i][2] = i;
            }
            int[] ans = new int[Q];
            B = (int) Math.sqrt(Q);
            S = (Q + B - 1) / B;
            bucketS = new int[B];
            bucketA = new int[B];
            Arrays.fill(bucketS, -1);
            Arrays.sort(qs, Comparator.comparingInt(a -> a[0]));
            for (int i = 0, j = 0; i <= K && j < Q; i++) {
                for (; j < Q && qs[j][0] < r[i]; j++) {
                    ans[j] = f(i, qs[j][2], r[i] - qs[j][0]);
                }
                int dt = r[i] - (i == 0 ? 0 : r[i - 1]);
                if (i % 2 == 0) {
                    int k = 0, l = S - 1;
                    for (; f(i, l, dt) <= 0; k++, l += S) {
                        bucketS[k] = 0;
                        bucketA[k] = 0;
                    }
                    for (; k < B; k++) {
                        bucketA[k] -= dt;
                    }
                } else {
                    int k = B - 1, l = S * (B - 1);
                    for (; f(i, l, dt) >= X; k--, l -= S) {
                        bucketS[k] = 0;
                        bucketA[k] = 0;
                    }
                    for (; k >= 0; k--) {
                        bucketA[k] += dt;
                    }
                }
            }
            for (int a : ans) out.println(a);
        }

        int f(int i, int j, int dt) {
            j = Math.min(j, Q - 1);
            int a;
            int k = j / S;
            if (bucketS[k] == -1) {
                a = qs[j][1];
            } else {
                a = bucketS[k];
            }
            a += bucketA[k];
            if (i % 2 == 0) {
                return Math.max(0, a - dt);
            } else {
                int b = X - a;
                return a + Math.min(b, dt);
            }
        }

    }

    static class SegRMQInt {
        final int INF = 1 << 29;
        static int min;
        static int max;
        final int n;
        final int[] seg;
        final int[] add;

        public SegRMQInt(final int n) {
            this.n = Integer.highestOneBit(n) << 1;
            seg = new int[this.n << 1];
            add = new int[this.n << 1];
            Arrays.fill(seg, INF);
        }

        void propagate(int curL, int curR, int k) {
            if (add[k] != 0) {
                final int curM = (curL + curR) / 2;
                add(curL, curR, 2 * k + 1, add[k], curL, curM);
                add(curL, curR, 2 * k + 2, add[k], curM, curR);
                add[k] = 0;
            }
        }

        void clip(int k) {
            seg[k] = Math.max(Math.min(seg[k], max), min);
        }

        void add(int l, int r, int v) {
            add(l, r, 0, v, 0, n);
        }

        void add(int l, int r, int k, int v, int curL, int curR) {
            if (curR <= l || curL >= r) return;
            if (l <= curL && curR <= r) {
                clip(k);
                seg[k] += v;
                add[k] += v;
                return;
            }
            final int curM = (curL + curR) / 2;
            propagate(curL, curR, k);
            add(l, r, 2 * k + 1, v, curL, curM);
            add(l, r, 2 * k + 2, v, curM, curR);
            seg[k] = Math.min(seg[2 * k + 1], seg[2 * k + 2]);
        }

        void set(int i, int v) {
            // propagate to leaf
            add(i, i + 1, 0);

            i += n - 1;
            seg[i] = v;
            add[i] = 0;
            while (i != 0) {
                i = (i - 1) / 2;
                seg[i] = Math.min(seg[2 * i + 1], seg[2 * i + 2]) + add[i];
            }
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[][] nextIntArray2DWithIndex(final int n, final int k) {
            final int[][] res = new int[n][k + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    res[i][j] = nextInt();
                }
                res[i][k] = i;
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

