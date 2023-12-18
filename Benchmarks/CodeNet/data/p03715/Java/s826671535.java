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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            long w = in.nextLong();
            long h = in.nextLong();

            if (w % 3 == 0 || h % 3 == 0) {
                out.println(0);
                return;
            }

            long ansX = Integer.MAX_VALUE;
            long ansY = Integer.MAX_VALUE;
            for (int i = 1; i < w; i++) {
                long cs1 = i * h;
                long cs2 = (w - i) * (h / 2);
                if (h % 2 == 1 && cs2 > cs1) cs2 += w - i;
                long ca = Math.abs(cs1 - cs2);
                if (ca > ansX) break;
                ansX = ca;
            }

            for (int i = 1; i < h; i++) {
                long cs1 = i * w;
                long cs2 = (h - i) * (w / 2);
                if (w % 2 == 1 && cs2 > cs1) cs2 += h - i;
                long ca = Math.abs(cs1 - cs2);
                if (ca > ansY) break;
                ansY = ca;
            }

            long ans = Math.min(ansX, ansY);

            long d3w = ((w / 3) + 1) * h - (w / 3) * h;
            if (w >= 3 && d3w < ans) ans = d3w;

            long d3h = ((h / 3) + 1) * w - (h / 3) * w;
            if (h >= 3 && d3h < ans) ans = d3h;

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

