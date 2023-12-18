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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int n = in.nextInt();
            final int c = in.nextInt();
/*
        Vertex[] colors = new Vertex[c];
        for(int i = 0; i < c; i++) colors[i] = new Vertex();

        for(int i = 0; i < c; i++){
            for(int j = 0; j < c; j++){
                colors[i].setEdge(colors[j], in.nextInt());
            }
        }
*/

            long[][] d = new long[c][c];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    d[i][j] = in.nextLong();
                }
            }

            long[][] cost = new long[3][c];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int cd = in.nextInt() - 1;
                    for (int nd = 0; nd < c; nd++) {
                        cost[(i + j) % 3][nd] += d[cd][nd];
                    }
                }
            }

            long ans = Long.MAX_VALUE;
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    if (j == i) continue;
                    for (int k = 0; k < c; k++) {
                        if (k == i || k == j) continue;
                        long sum = 0;
                        sum += cost[0][i];
                        sum += cost[1][j];
                        sum += cost[2][k];
                        if (sum < ans) ans = sum;
                    }
                }
            }

            out.println(ans);
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
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
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
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

