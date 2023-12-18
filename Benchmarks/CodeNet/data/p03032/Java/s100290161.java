import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            long[] d = in.nextLongArray(N);

            long[] lSum = new long[N];
            long[] rSum = new long[N];
            lSum[0] = d[0];
            rSum[N - 1] = d[N - 1];
            for (int i = 1; i < N; i++) {
                lSum[i] = lSum[i - 1] + d[i];
                rSum[N - i - 1] = rSum[N - i] + d[N - i - 1];
            }

            Queue<Long> pq = new PriorityQueue<>();
            long ans = 0;
            for (int i = 1; i <= Math.min(K, N); i++) {
                for (int r = 0; r <= i; r++) {
                    int l = i - r;
                    long score = 0;


                    if (l > 0)
                        score += lSum[l - 1];
                    if (r > 0)
                        score += rSum[N - r];

                    pq.clear();
                    for (int j = 0; j < l; j++)
                        pq.add(d[j]);
                    for (int j = 0; j < r; j++)
                        pq.add(d[N - j - 1]);

                    int count = K - i;
                    while (pq.size() > 0 && count-- > 0 && pq.peek() < 0) {
                        score -= pq.poll();
                    }
                    ans = score > ans ? score : ans;

                }
            }

            if (K >= N) {
                long score = lSum[N - 1];
                pq.clear();
                for (long cd : d)
                    pq.add(cd);
                int count = K - N;
                while (pq.size() > 0 && count-- > 0 && pq.peek() < 0) {
                    score -= pq.poll();
                }
                ans = score > ans ? score : ans;
            }
            out.println(ans);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
            this.bufPointer = 0;
            this.bufLength = 0;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            int n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

    }
}

