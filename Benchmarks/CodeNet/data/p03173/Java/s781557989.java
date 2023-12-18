import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            long a[] = in.nla(n);
            long temp[][] = new long[n][n];
            //out.println(a);
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    temp[i][j] = Long.MAX_VALUE;
            long sum[] = new long[n + 1];
            for (i = 1; i <= n; i++)
                sum[i] = sum[i - 1] + a[i - 1];
            out.println(func(0, n - 1, temp, a, sum));
        /*
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                out.print(temp[i][j]+" ");
            out.println();}
        */
        }

        static long func(int low, int high, long temp[][], long a[], long sum[]) {   //System.out.println(low+" "+high);
            if (low == high) {
                temp[low][low] = a[low];
                return 0;
            }
            if (high - low == 1) {
                temp[low][high] = (a[low] + a[high]);
                return temp[low][high];
            }
            if (high - low == 2) {
                long x = 2 * (a[low] + a[low + 1]) + a[high];
                long y = 2 * (a[high] + a[low + 1]) + a[low];
                temp[low][high] = Math.min(x, y);
                return temp[low][high];
            }
            if (temp[low][high] != Long.MAX_VALUE)
                return temp[low][high];
            for (int i = low; i < high; i++)
                temp[low][high] = Math.min(func(low, i, temp, a, sum) + func(i + 1, high, temp, a, sum) + sum[high + 1] - sum[low], temp[low][high]);
            return temp[low][high];
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

        public void println(long i) {
            writer.println(i);
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

        public int ni() {
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

        public long nl() {
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

        public long[] nla(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nl();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

