package arc.arc103;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class C {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[][] even = new int[100010][2];
        int[][] odd = new int[100010][2];
        for (int i = 0; i < n ; i++) {
            int v = in.nextInt();
            if (i % 2 == 0) {
                even[v][0]++;
            } else {
                odd[v][0]++;
            }
        }
        for (int i = 0; i < even.length ; i++) {
            even[i][1] = i;
            odd[i][1] = i;
        }

        List<int[]> eset = max2(even);
        List<int[]> oset = max2(odd);

        int best = n;
        for (int[] e : eset) {
            for (int[] o : oset) {
                if (e[1] != o[1]) {
                    best = Math.min(best, n-e[0]-o[0]);
                }
            }
        }
        if (eset.size() == 1 && oset.size() == 1 && eset.get(0)[1] == oset.get(0)[1]) {
            best = n/2;
        }

        out.println(best);
        out.flush();
    }

    static List<int[]> max2(int[][] a) {
        Arrays.sort(a, (u, v) -> v[0] - u[0]);

        List<int[]> mex = new ArrayList<>();
        for (int i = 0; i < 2 ; i++) {
            if (a[i][0] >= 1) {
                mex.add(a[i]);
            }
        }
        return mex;
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}