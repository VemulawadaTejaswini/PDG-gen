import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            Debug debug = new Debug();
            int n = in.nextInt();
            int K = in.nextInt();
            int[] a = in.nextIntArray(n);
            int minT = Integer.MAX_VALUE;
            if (K == 1) {
                for (int aa : a) minT = Math.min(minT, Math.abs(aa));
                out.println(minT);
                return;
            }
//        if (Arrays.binarySearch(a, 0) >= 0) {
//            --K;
//        } else {
//            int[] b = new int[n + 1];
//            int ptr = 0;
//            int f = -1;
//            for (int aa : a) {
//                if (aa > 0 && f == -1) {
//                    b[ptr++] = 0;
//                    f = 0;
//                }
//                b[ptr++] = aa;
//            }
//            a = b;
//            n = a.length;
//        }
            for (int i = 0; i + K - 1 < n; ++i) {
                if (a[i] < 0 && a[i + K - 1] < 0) continue;
                int sg1 = Integer.signum(a[i]);
                int sg2 = Integer.signum(a[i + K - 1]);
                if (sg1 * sg2 < 0) {
                    int v1 = 2 * Math.abs(a[i]) + Math.abs(a[i + K - 1]);
                    int v2 = 2 * Math.abs(a[i + K - 1]) + Math.abs(a[i]);
                    minT = Math.min(minT, Math.min(v1, v2));
                } else {
                    minT = Math.min(minT, Math.abs(a[i + K - 1]));
                }
//            debug.tr(a[i], a[i + K - 1]);

            }
            out.println(minT);
        }

    }

    static class Debug {
        PrintWriter out;
        boolean oj;
        boolean system;
        long timeBegin;
        Runtime runtime;

        public Debug(PrintWriter out) {
            oj = System.getProperty("ONLINE_JUDGE") != null;
            this.out = out;
            this.timeBegin = System.currentTimeMillis();
            this.runtime = Runtime.getRuntime();
        }

        public Debug() {
            system = true;
            oj = System.getProperty("ONLINE_JUDGE") != null;
            OutputStream outputStream = System.out;
            this.out = new PrintWriter(outputStream);
            this.timeBegin = System.currentTimeMillis();
            this.runtime = Runtime.getRuntime();
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

