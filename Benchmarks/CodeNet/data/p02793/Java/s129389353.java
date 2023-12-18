import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            int a[] = c.readIntArray(n);
            HashMap<Integer, Integer> hm[] = new HashMap[n];
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int k = a[i];
                hm[i] = new HashMap<>();
                for (int j = 2; j * j <= k; j++) {
                    int cnt = 0;
                    while (k % j == 0) {
                        cnt++;
                        k /= j;
                    }
                    if (cnt > 0) {
                        hm[i].put(j, cnt);
                        hs.add(j);
                    }
                }
                if (k != 1) {
                    hm[i].put(k, 1);
                    hs.add(k);
                }

            }

            long res[] = new long[n];
            Arrays.fill(res, 1);
            long mod = (long) 1e9 + 7;
//        w.printLine(hs);
            for (int x : hs) {
                int max = 0;
                for (int i = 0; i < n; i++) {
                    max = Math.max(max, hm[i].getOrDefault(x, 0));
                }
                for (int j = 0; j < n; j++) {
                    int left = max - hm[j].getOrDefault(x, 0);
                    long mul = Utils.power(x, left, mod);
                    res[j] *= mul;
//                w.printLine(x,j,left,a[j],max,res[j]);
                    res[j] %= mod;
                }
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += res[i];
                ans %= mod;
            }
            w.printLine(ans);

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

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class Utils {
        public static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res = (res * x) % p;
                }
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

        public int readInt() {
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

