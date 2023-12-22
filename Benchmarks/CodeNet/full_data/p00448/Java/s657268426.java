import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Seikichi KONDO (seikichi@kmc.gr.jp)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AOJ0525 solver = new AOJ0525();
        solver.solve(1, in, out);
        out.close();
    }

    static final class AOJ0525 {
        @SuppressWarnings("unused")
        public void solve(final int testNumber, final FastScanner in, final PrintWriter out) {
            while (true) {
                final int R = in.nextInt(), C = in.nextInt();
                if (R == 0 && C == 0) {
                    break;
                }
                final boolean[][] board = new boolean[R][C];
                final int[] face = new int[C];
                for (int y = 0; y < R; y++) {
                    for (int x = 0; x < C; x++) {
                        board[y][x] = in.next().equals("1");
                        face[x] += board[y][x] ? 1 : 0;
                    }
                }

                int result = 0;
                for (int x = 0; x < C; x++) {
                    result += Math.max(face[x], R - face[x]);
                }

                for (int b = 1; b < (1 << R); b++) {
                    final int g = b ^ (b >> 1), g_1 = (b - 1) ^ ((b - 1) >> 1);
                    final int z = Integer.numberOfTrailingZeros(g ^ g_1);

                    int next = 0;
                    for (int x = 0; x < C; x++) {
                        board[z][x] = !board[z][x];
                        face[x] += board[z][x] ? +1 : -1;
                        next += Math.max(face[x], R - face[x]);
                    }

                    result = Math.max(result, next);
                }

                out.println(result);
            }
        }

    }

    static final class FastScanner {
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

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
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

    }
}