import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aman Kumar Singh
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDisjointSetOfCommonDivisors solver = new DDisjointSetOfCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDisjointSetOfCommonDivisors {
        int MAXN = 1000005;
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            long a = nl();
            long b = nl();
            long gcd = gcd(a, b);
            long i = 0, cnt = 1;
            TreeSet<Long> tset = new TreeSet<>();
            for (i = 2; i < MAXN; i++) {
                boolean ok = true;
                while (gcd > 1 && gcd % i == 0) {
                    gcd /= i;
                    ok = false;
                }
                if (!ok)
                    cnt++;
            }
            if (gcd > 1)
                cnt++;
            pn(cnt);

        }

        long nl() {
            return in.nextLong();
        }

        void pn(long zx) {
            out.println(zx);
        }

        long gcd(long a, long b) {
            return (b == 0) ? a : gcd(b, a % b);
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
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

