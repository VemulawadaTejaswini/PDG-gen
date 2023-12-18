import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Closeable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCandles solver = new CCandles();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCandles {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            List<Integer> xs = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                if (x != 0) xs.add(x);
                if (x == 0) K--;
            }
            xs.add(0);
            xs.sort(Comparator.naturalOrder());
            if (K == 0) {
                out.println(0);
                return;
            }
            long ans = Long.MAX_VALUE;
            int zeroIndex = xs.indexOf(0);
            int startIndex;
            if (zeroIndex - K >= 0) {
                startIndex = zeroIndex - K;
            } else {
                startIndex = 0;
            }
            for (int i = startIndex; i + K < xs.size(); i++) {
                long cand1 = (long) xs.get(startIndex + K) * 2;
                long cand2 = (long) xs.get(startIndex + K);
                if (xs.get(startIndex) < 0) {
                    cand1 += (long) xs.get(startIndex) * -2;
                    cand2 += (long) -xs.get(startIndex);
                }
                ans = Math.min(ans, Math.min(cand1, cand2));
            }
            out.println(ans);
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

