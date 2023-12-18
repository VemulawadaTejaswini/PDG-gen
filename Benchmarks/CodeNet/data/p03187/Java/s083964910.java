import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int l = in.nextInt();
            int n = in.nextInt();

            List<Long> a = new LinkedList<>();
            for (int i = 0; i < n; i++)
                a.add(in.nextLong());

            long ans = 0;
            long pos = 0;
            while (a.size() >= 2) {
                long ln = a.get(0);
                long left = pos < ln ? (ln - pos) : (l - pos + ln);
                long rn = a.get(a.size() - 1);
                long right = pos > rn ? (pos - rn) : (l - rn + pos);


                int ci = 1;
                long rrn = a.get(a.size() - 1 - ci);
                right += rn > rrn ? (rn - rrn) : (l - rrn + rn);
                right += rn < ln ? (ln - rn) : (l - rn + ln);

                long lln = a.get(ci);
                left += ln < lln ? (lln - ln) : (l - ln + lln);
                left += ln > rn ? (ln - rn) : (l - rn + ln);

                while (left == right && ci < a.size() - 1) {
                    ci++;
                    left += a.get(ci) - a.get(ci - 1);
                    right += a.get(a.size() - ci) - a.get(a.size() - ci - 1);
                }
                if (right > left) {
                    ans += pos > rn ? (pos - rn) : (l - rn + pos);
                    pos = rn;
                    a.remove(a.size() - 1);
                } else {
                    ans += pos < ln ? (ln - pos) : (l - pos + ln);
                    pos = ln;
                    a.remove(0);
                }
            }

            long cn = a.get(0);
            cn = cn > pos ? cn - pos : cn - pos + l;
            ans += Math.max(l - cn, cn);

            out.println(ans);
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

