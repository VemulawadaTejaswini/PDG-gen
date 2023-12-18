import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            List<TaskD.Sushi> sushis = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TaskD.Sushi cs = new TaskD.Sushi(in.nextLong(), in.nextLong());
                sushis.add(cs);
            }

            sushis.sort(Comparator.comparing(TaskD.Sushi::getD).reversed());
            Set<Long> checked = new HashSet<>();
            long[] ta = new long[n + 1];
            long[] da = new long[n + 1];
            int tn = 0;
            int dn = 0;
            for (int i = 0; i < n; i++) {
                long cd = sushis.get(i).getD();
                if (!checked.contains(sushis.get(i).getT())) {
                    ta[++tn] = ta[tn - 1] + cd;
                    checked.add(sushis.get(i).getT());
                } else {
                    da[++dn] = da[dn - 1] + cd;
                }
            }
            long max = 0;
            for (int i = 1; i <= k; i++) {
                max = Math.max(max, (long) i * (long) i + ta[i] + da[k - i]);
            }
            out.println(max);
        }

        private static class Sushi {
            long d;
            long t;

            Sushi(long t, long d) {
                this.t = t;
                this.d = d;
            }

            public long getT() {
                return t;
            }

            public long getD() {
                return d;
            }

        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }
}

