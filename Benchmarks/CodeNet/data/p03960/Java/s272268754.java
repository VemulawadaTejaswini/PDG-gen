import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtD solver = new AtD(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtD {
        private final FastScanner in;
        private final PrintWriter out;

        public AtD(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] map = new char[h][];
            for (int i = 0; i < h; i++) {
                map[i] = in.next().toCharArray();
            }

            boolean[][][] next = new boolean[w - 1][h + 1][h + 1];
            int[][][] totalCost = new int[w - 1][h + 1][h + 1];
            int[][][] nextCost = new int[w - 1][h + 1][h + 1];

            for (int i = 0; i + 1 < w; i++) {
                for (int k = 0; k <= h + h; k++) {
                    for (int left = Math.max(0, k - h); left <= Math.min(k, h); left++) {
                        int right = k - left;

                        if (left * right == 0) {
                            next[i][left][right] = left == 0;
                        } else {
                            nextCost[i][left][right] = nextCost[i][left - 1][right - 1];

                            if (map[left - 1][i] == map[right - 1][i + 1]) {
                                nextCost[i][left][right]++;
                            }

                            totalCost[i][left][right] = nextCost[i][left][right];

                            if (totalCost[i][left - 1][right] < totalCost[i][left][right - 1]) {
                                totalCost[i][left][right] += totalCost[i][left - 1][right];
                                next[i][left][right] = false;
                            } else {
                                totalCost[i][left][right] += totalCost[i][left][right - 1];
                                next[i][left][right] = true;
                            }
                        }
                    }
                }
            }

            int[] heights = new int[w];
            Arrays.fill(heights, h);

            int ans = 0;
            while (true) {
                boolean ok = false;
                for (int i = 0; i + 1 < w; i++) {
                    int left = heights[i];
                    int right = heights[i + 1];
                    if (!next[i][left][right]) {
                        ans += nextCost[i][left][right];
                        if (i > 0) {
                            ans += nextCost[i - 1][heights[i - 1]][left];
                        }
                        heights[i]--;
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    if (heights[w - 1] == 0) {
                        break;
                    }
                    ans += nextCost[w - 2][heights[w - 2]][heights[w - 1]];
                    heights[w - 1]--;
                }
            }

            out.println(ans);
        }

    }

    static class FastScanner {
        private final static int BUFFER_SIZE = 4096;
        private final InputStream in;
        private final StringBuilder sb = new StringBuilder();
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int pos = 0;
        private int size;

        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }

        public String next() {
            int c = skipWhitespace();
            if (c == -1) {
                return null;
            }

            sb.setLength(0);

            do {
                sb.append((char) c);
                c = read();
            } while (c > ' ');

            return sb.toString();
        }

        public int nextInt() {
            int c = skipWhitespace();

            int sign = -1;
            if (c == '-') {
                sign = 1;
                c = read();
            }

            int ans = 0;

            while (c > ' ') {
                ans *= 10;
                ans -= c - '0';
                c = read();
            }

            return sign * ans;
        }

        private int skipWhitespace() {
            while (true) {
                int c = read();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }

        private int read() {
            if (pos >= size) {
                try {
                    size = in.read(buffer, 0, BUFFER_SIZE);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (size <= 0) {
                    return -1;
                }
                pos = 0;
            }
            return buffer[pos++];
        }

    }
}

