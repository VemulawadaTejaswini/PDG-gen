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
        CStrawberryCakes solver = new CStrawberryCakes();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrawberryCakes {
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int m = ni();
            int k = ni();
            int[][] mat = new int[n][m];
            int i = 0, j = 0, tot = 0;
            for (i = 0; i < n; i++) {
                String st = n();
                for (j = 0; j < m; j++) {
                    mat[i][j] = st.charAt(j) == '#' ? 1 : 0;
                    tot += mat[i][j];
                }
            }
            int[][] val = new int[n][m];
            int[] arr = new int[k];
            for (i = 0; i < k; i++)
                arr[i] = tot / k;
            for (i = 0; i < tot % k; i++)
                arr[i]++;
            int mx = tot / k;
            int cnt = 0;
            int curr = 1;
            int last = 0;
            int c = 0;
            for (i = 0; i < n; i++) {
                if (last == 0) {
                    for (j = 0; j < m; j++) {
                        cnt += mat[i][j];
                        if (cnt > arr[c]) {
                            curr++;
                            c++;
                            cnt = 1;
                        }
                        val[i][j] = curr;
                    }
                } else {
                    for (j = m - 1; j >= 0; j--) {
                        cnt += mat[i][j];
                        if (cnt > arr[c]) {
                            curr++;
                            cnt = 1;
                            c++;
                        }
                        val[i][j] = curr;
                    }
                }
                last ^= 1;
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    p(val[i][j] + " ");
                }
                pn("");
            }
        }

        String n() {
            return in.next();
        }

        int ni() {
            return in.nextInt();
        }

        void pn(String zx) {
            out.println(zx);
        }

        void p(Object o) {
            out.print(o);
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

        public int nextInt() {
            return Integer.parseInt(next());
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

