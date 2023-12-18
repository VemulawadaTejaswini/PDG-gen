import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        EYutori solver = new EYutori();
        solver.solve(1, in, out);
        out.close();
    }

    static class EYutori {
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni(), k = ni(), c = ni();
            String s = n();
            int i = 0;
            int[] pf = new int[n + 1];
            int[] sf = new int[n + 1];
            int last = -1;
            for (i = 0; i < n; i++) {
                if (s.charAt(i) == 'o' && last != -1) {
                    if (i - last > c) {
                        pf[i]++;
                        last = i;
                    }
                } else if (s.charAt(i) == 'o') {
                    last = i;
                    pf[i]++;
                }
                if (i > 0)
                    pf[i] += pf[i - 1];
            }
            last = -1;
            for (i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'o' && last != -1) {
                    if (last - i > c) {
                        sf[i]++;
                        last = i;
                    }
                } else if (s.charAt(i) == 'o') {
                    last = i;
                    sf[i]++;
                }
                if (i < n - 1)
                    sf[i] += sf[i + 1];
            }
            //pn(Arrays.toString(pf));
            //pn(Arrays.toString(sf));
            for (i = 0; i < n; i++) {
                int sum = 0;
                if (i == 0)
                    sum += sf[i + 1];
                else if (i == n - 1)
                    sum += pf[i - 1];
                else
                    sum += sf[i + 1] + pf[i - 1];
                if (sum < k)
                    pn(i + 1);
            }
        }

        String n() {
            return in.next();
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
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
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
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

