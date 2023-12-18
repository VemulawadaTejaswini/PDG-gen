import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author caoash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B0Or1Swap solver = new B0Or1Swap();
        solver.solve(1, in, out);
        out.close();
    }

    static class B0Or1Swap {
        public void solve(int testNumber, FastScanner br, PrintWriter pw) {
            int n = br.nextInt();
            int[] in = br.nextIntArray(n);
            ArrayList<Integer> sort = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                sort.add(in[i]);
            }
            Collections.sort(sort);
            boolean same2 = true;
            for (int i = 0; i < n; i++) {
                if (in[i] != sort.get(i)) {
                    same2 = false;
                }
            }
            if (same2) {
                pw.println("YES");
                pw.close();
            }
            for (int first = 0; first < n; first++) {
                for (int second = 0; second < n; second++) {
                    if (first != second) {
                        int temp = in[first];
                        in[first] = in[second];
                        in[second] = temp;
                        boolean same = true;
                        for (int i = 0; i < n; i++) {
//                        pw.print(in[i] + " ");
                            if (in[i] != sort.get(i)) {
                                same = false;
                            }
                        }
//                    pw.println();
                        if (same) {
                            pw.println("YES");
                            pw.close();
                        }
                        temp = in[first];
                        in[first] = in[second];
                        in[second] = temp;
                    }
                }
            }
            pw.println("NO");
            pw.close();
        }

    }

    static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastScanner.SpaceCharFilter filter;

        public FastScanner(InputStream stream) {
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

