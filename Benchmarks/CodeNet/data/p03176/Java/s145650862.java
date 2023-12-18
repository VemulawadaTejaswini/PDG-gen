import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        QFlowers solver = new QFlowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class QFlowers {
        long[] tree;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            long[] dp = new long[N];
            // dp[i] max such that i is the max height flower
            int[] h = new int[N];
            int[] a = new int[N];
            int[] ind_h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt() - 1;
                ind_h[h[i]] = i;
            }
            a = in.nextIntArray(N);
            int max = 1;
            while (max <= N) {
                max *= 2;
            }
            tree = new long[max + 2];
            for (int i = 0; i < N; i++) {
                dp[h[i]] = a[i];
                // maximum value for dp[j] for j in the interval 0 to h[i]-1
                dp[h[i]] += query(0, N - 1, 0, h[i] - 1, 1);
                update(0, N - 1, dp[h[i]], h[i], 1);
            }
            long ans = 0;
            for (int i = 0; i < N; i++) {
                ans = Math.max(ans, dp[i]);
            }
            out.print(ans);
        }

        void update(int st, int en, long val, int idx, int TN) {
            if (st == en) {
                tree[TN] = val;
                return;
            }
            int mid = (st + en) / 2;
            if (idx > mid) {
                update(mid + 1, en, val, idx, 2 * TN + 1);
            } else {
                update(st, mid, val, idx, 2 * TN);
            }
            tree[TN] = Math.max(tree[2 * TN], tree[2 * TN + 1]);
        }

        long query(int st, int en, int ql, int qr, int TN) {
            if (st > qr || en < ql) {
                return 0;
            } else if (st >= ql && en <= qr) {
                return tree[TN];
            } else {
                int mid = (st + en) / 2;
                long a1 = query(st, mid, ql, qr, 2 * TN);
                long a2 = query(mid + 1, en, ql, qr, 2 * TN + 1);
                return Math.max(a1, a2);
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] nextIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = nextInt();
            return array;
        }

    }
}

