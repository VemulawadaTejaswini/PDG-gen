import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPairs solver = new DPairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPairs {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            long k = s.nextLong() - 1;
            int[] a = new int[n];
            int cz = 0;
            int cp = 0, cn = 0;
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                if (a[i] > 0)
                    cp++;
                else if (a[i] < 0)
                    cn++;
                else
                    cz++;
            }
            Long[] pos = new Long[cp];
            Long[] neg = new Long[cn];
            int vp = 0, vn = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    pos[vp] = (long) a[i];
                    vp++;
                } else if (a[i] < 0) {
                    neg[vn] = (long) -a[i];
                    vn++;
                }
            }
            Arrays.sort(pos);
            Arrays.sort(neg);
            long zcnt = 0;
            for (int i = 1; i <= cz; i++)
                zcnt += n - i;
            long ncnt = (long) cn * cp;
            long pcnt = (long) cp * (cp - 1) / 2 + (long) cn * (cn - 1) / 2;
            if (k >= ncnt + zcnt) {
                k -= ncnt + zcnt;
                long left = 0, right = (long) 1e18;
                long ans = 0;
                while (left <= right) {
                    long m = (left + right) / 2;
                    long c = 0;
                    int r = cp - 1;
                    for (int l = 0; l < cp; l++) {
                        while (r >= 0 && pos[l] * pos[r] > m) {
                            r--;
                        }
                        if (r - l > 0) {
                            c += r - l;
                        }
                    }
                    r = cn - 1;
                    for (int l = 0; l < cn; l++) {
                        while (r >= 0 && neg[l] * neg[r] > m) {
                            r--;
                        }
                        if (r - l > 0) {
                            c += r - l;
                        }
                    }
                    if (c >= k + 1) {
                        ans = m;
                        right = m - 1;
                    } else {
                        left = m + 1;
                    }
                }
                w.println(ans);
            } else if (k >= ncnt) {
                w.println(0);
            } else {
                k = ncnt - 1 - k;
                long left = 0, right = (long) 1e18;
                long ans = 0;
                while (left <= right) {
                    long m = (left + right) / 2;
                    long c = 0;
                    int r = cn - 1;
                    for (int l = 0; l < cp; l++) {
                        while (r >= 0 && pos[l] * neg[r] > m) {
                            r--;
                        }
                        c += r + 1;
                    }
                    if (c >= k + 1) {
                        ans = m;
                        right = m - 1;
                    } else {
                        left = m + 1;
                    }
                }
                w.println(-ans);
            }
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

