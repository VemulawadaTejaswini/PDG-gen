import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.AbstractCollection;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
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
        ARangeFlipFindRoute solver = new ARangeFlipFindRoute();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARangeFlipFindRoute {
        private static final int INF = 1000000;
        private static final int[] DX = {0, 1};
        private static final int[] DY = {1, 0};

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int h = in.ints(), w = in.ints();
            char[][] s = in.chars(h);
            int[][] cost = new int[h][w];
            ArrayUtil.fill(cost, INF);
            cost[0][0] = s[0][0] == '#' ? 1 : 0;
            PriorityQueue<ARangeFlipFindRoute.P> q = new PriorityQueue<>(Comparator.comparing(p -> cost[p.y][p.x]));
            q.offer(new ARangeFlipFindRoute.P(0, 0));
            while (!q.isEmpty()) {
                ARangeFlipFindRoute.P now = q.poll();
                for (int i = 0; i < 2; i++) {
                    int ny = now.y + DY[i], nx = now.x + DX[i];
                    if (ny < 0 || nx < 0 || h <= ny || w <= nx || cost[ny][nx] < INF) continue;
                    int c;
                    if (s[now.y][now.x] == s[ny][nx]) c = cost[now.y][now.x];
                    else c = cost[now.y][now.x] + 1;
                    if (c < cost[ny][nx]) {
                        cost[ny][nx] = c;
                        q.offer(new ARangeFlipFindRoute.P(ny, nx));
                    }
                }
            }
        /*for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.ans(cost[i][j]);
            }
            out.ln();
        }*/
            out.ans((cost[h - 1][w - 1] + 1) / 2).ln();
        }

        private static class P {
            int y;
            int x;

            P(int y, int x) {
                this.y = y;
                this.x = x;
            }

        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

