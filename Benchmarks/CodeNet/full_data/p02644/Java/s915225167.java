import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        FPondSkater solver = new FPondSkater();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPondSkater {
        private static final int INF = 100_000_000;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int h = in.ints(), w = in.ints(), k = in.ints();
            int sy = in.ints() - 1, sx = in.ints() - 1, gy = in.ints() - 1, gx = in.ints() - 1;
            char[][] s = in.chars(h);
            boolean[][][] visited = new boolean[2][h][w];
            int[][] cost = new int[h][w];
            ArrayUtil.fill(cost, INF);
            cost[sy][sx] = 0;
            Queue<FPondSkater.P> q = new ArrayDeque<>();
            q.offer(new FPondSkater.P(sx, sy));
            while (!q.isEmpty()) {
                FPondSkater.P now = q.poll();
                if (!visited[0][now.y][now.x]) {
                    for (int d = 1; d <= k; d++) {
                        if (w <= now.x + d
                                || s[now.y][now.x + d] == '@'
                                || visited[0][now.y][now.x + d]
                                || cost[now.y][now.x + d] < INF) break;
                        if (d != k) visited[0][now.y][now.x + d] = true;
                        cost[now.y][now.x + d] = cost[now.y][now.x] + 1;
                        q.offer(new FPondSkater.P(now.x + d, now.y));
                    }
                    for (int d = 1; d <= k; d++) {
                        if (now.x - d < 0
                                || s[now.y][now.x - d] == '@'
                                || visited[0][now.y][now.x - d]
                                || cost[now.y][now.x - d] < INF) break;
                        if (d != k) visited[0][now.y][now.x - d] = true;
                        cost[now.y][now.x - d] = cost[now.y][now.x] + 1;
                        q.offer(new FPondSkater.P(now.x - d, now.y));
                    }
                }
                visited[0][now.y][now.x] = true;
                if (!visited[1][now.y][now.x]) {
                    for (int d = 1; d <= k; d++) {
                        if (h <= now.y + d
                                || s[now.y + d][now.x] == '@'
                                || visited[1][now.y + d][now.x]
                                || cost[now.y + d][now.x] < INF) break;
                        if (d != k) visited[1][now.y + d][now.x] = true;
                        cost[now.y + d][now.x] = cost[now.y][now.x] + 1;
                        q.offer(new FPondSkater.P(now.x, now.y + d));
                    }
                    for (int d = 1; d <= k; d++) {
                        if (now.y - d < 0
                                || s[now.y - d][now.x] == '@'
                                || visited[1][now.y - d][now.x]
                                || cost[now.y - d][now.x] < INF) break;
                        if (d != k) visited[1][now.y - d][now.x] = true;
                        cost[now.y - d][now.x] = cost[now.y][now.x] + 1;
                        q.offer(new FPondSkater.P(now.x, now.y - d));
                    }
                }
                visited[0][now.y][now.x] = true;
            }
            out.ans(cost[gy][gx] == INF ? -1 : cost[gy][gx]).ln();
        }

        private static class P {
            int x;
            int y;

            P(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public char[] chars() {
            return string().toCharArray();
        }

        public char[][] chars(int h) {
            char[][] res = new char[h][];
            for (int i = 0; i < h; i++) res[i] = chars();
            return res;
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(int[] a, int v) {
            Arrays.fill(a, v);
        }

        public static void fill(int[][] a, int v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

