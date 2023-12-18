import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
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
        FXORMatching solver = new FXORMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class FXORMatching {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int M = in.nextInt();
            int K = in.nextInt();
            long pow2M = pow(2, M);
            if (pow2M <= K || (M == 1 && K == 1)) {
                out.println(-1);
                return;
            }
            if (M == 1 && K == 0) {
                out.println("0 0 1 1");
                return;
            }
            StringBuilder ansb = new StringBuilder();
            for (long i = 0; i < pow2M; i++) {
                if (i != K) ansb.append(i).append(' ');
            }
            ansb.append(K).append(' ');
            for (long i = pow2M - 1; i >= 0; i--) {
                if (i != K) ansb.append(i).append(' ');
            }
            ansb.append(K);
            out.println(ansb);

        }

        public long pow(long x, long n) {
            long sum = 1;
            while (n > 0) {
                if ((n & 1) == 1) {  //ビットが立っていたら
                    sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
                }
                x *= x;              //((x^2)^2)^2・・・
                n >>= 1;
            }
            return sum;
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

