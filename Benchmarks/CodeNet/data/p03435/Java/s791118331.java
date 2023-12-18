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
        CTakahashisInformation solver = new CTakahashisInformation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTakahashisInformation {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int[][] grid = new int[4][4];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    grid[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                grid[3][i] = grid[0][i];
                grid[i][3] = grid[i][0];
            }
            for (int i = 0; i < 3; i++) {
                if (grid[i][0] - grid[i + 1][0] != grid[i][1] - grid[i + 1][1] ||
                        grid[i][2] - grid[i + 1][2] != grid[i][1] - grid[i + 1][1] ||
                        grid[i][2] - grid[i + 1][2] != grid[i][0] - grid[i + 1][0] ||
                        grid[0][i] - grid[0][i + 1] != grid[1][i] - grid[1][i + 1] ||
                        grid[2][i] - grid[2][i + 1] != grid[1][i] - grid[1][i + 1] ||
                        grid[2][i] - grid[2][i + 1] != grid[0][i] - grid[0][i + 1]) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");

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

