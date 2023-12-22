import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
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
        AOJ0118 solver = new AOJ0118();
        solver.solve(1, in, out);
        out.close();
    }

    static final class AOJ0118 {
        @SuppressWarnings("unused")
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            while (true) {
                final int H = in.nextInt(), W = in.nextInt();
                if (H == 0 && W == 0) {
                    break;
                }

                final char[][] map = new char[H][];
                for (int i = 0; i < H; i++) {
                    map[i] = in.next().toCharArray();
                }

                // solve
                boolean visited[][] = new boolean[H][W];
                int result = 0;
                while (true) {
                    final Queue<Pair<Integer, Integer>> que = new LinkedList<Pair<Integer, Integer>>();

                    int sx, sy;
                    init:
                    {
                        for (int y = 0; y < H; y++) {
                            for (int x = 0; x < W; x++) {
                                if (!visited[y][x]) {
                                    sy = y;
                                    sx = x;
                                    break init;
                                }
                            }
                        }
                        break;
                    }
                    result++;
                    que.add(Pair.of(sy, sx));
                    visited[sy][sx] = true;
                    final int delta[][] = {{0, +1}, {+1, 0}, {0, -1}, {-1, 0}};
                    while (!que.isEmpty()) {
                        final Pair<Integer, Integer> p = que.remove();
                        for (int[] d : delta) {
                            final int ny = p.first() + d[0];
                            final int nx = p.second() + d[1];
                            if (ny < 0 || H <= ny || nx < 0 || W <= nx || visited[ny][nx] || map[ny][nx] != map[p.first()][p.second()]) {
                                continue;
                            }
                            visited[ny][nx] = true;
                            que.add(Pair.of(ny, nx));
                        }
                    }
                }

                out.println(result);
            }
        }

    }

    static final class Pair<F, S> {
        private final F first;
        private final S second;

        public static <F, S> Pair<F, S> of(F first, S second) {
            return new Pair<F, S>(first, second);
        }

        private Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F first() {
            return this.first;
        }

        public S second() {
            return this.second;
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