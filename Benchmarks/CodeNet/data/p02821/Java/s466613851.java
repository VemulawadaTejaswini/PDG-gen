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
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EHandshake solver = new EHandshake();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHandshake {
        int N = (int) 2e5 + 2;
        long[] sum = new long[N];
        long[] summ = new long[N];
        long[] f = new long[N];

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            long m = s.nextLong(), ans = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                sum[x]++;
                f[x]++;
            }
            for (int i = N - 2; i >= 0; i--) {
                sum[i] += sum[i + 1];
                summ[i] = summ[i + 1] + f[i] * i;
            }
            //w.println(summ[0]+" "+sum[0]);
            int can = 0, l = 0, r = N - 1;
            long q = 0;
            while (l <= r) {
                int mid = l + r >> 1;
                long cur = chk(mid);
                if (cur <= m) {
                    r = mid - 1;
                    can = mid;
                    q = cur;
                } else l = mid + 1;
            }
            //w.println(can+" "+q);
            for (int i = 0; i < N; i++) {
                if (i < can) {
                    ans += f[i] * summ[can - i];
                    ans += i * f[i] * sum[can - i];
                } else {
                    ans += f[i] * summ[0];
                    ans += i * f[i] * sum[0];
                }
            }
            ans += (m - q) * (can - 1);
            w.println(ans);
        }

        long chk(int cur) {
            long q = 0;
            for (int i = 0; i < N; i++) {
                if (i < cur) q += f[i] * sum[cur - i];
                else q += f[i] * sum[0];
            }
            return q;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }

            while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

