import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        BSportsFestival solver = new BSportsFestival();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSportsFestival {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            int[][] a = in.ints(n, m);
            for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) a[i][j]--;

            int min = 0, max = m;
            while (max - min > 1) {
                int mid = (min + max) / 2;

                int[] cur = new int[n];
                boolean[] removed = new boolean[m];
                boolean[] participated = new boolean[n];

                for (int i = 0; i < m; i++) {
                    int[] cnt = new int[m];
                    for (int j = 0; j < n; j++) {
                        if (participated[j]) continue;
                        while (removed[a[j][cur[j]]]) cur[j]++;
                        cnt[a[j][cur[j]]]++;
                    }

                    int typeCount = 1, type = -1;
                    for (int j = 0; j < n; j++) {
                        if (participated[j]) continue;
                        if (type == -1) type = a[j][cur[j]];
                        else if (a[j][cur[j]] == type) typeCount++;
                    }

                    if (typeCount > mid) {
                        removed[type] = true;
                    } else {
                        for (int j = 0; j < n; j++) {
                            if (a[j][cur[j]] == type) participated[j] = true;
                        }
                    }
                }

                int cnt = 0;
                for (int i = 0; i < n; i++) if (participated[i]) cnt++;
                if (cnt == n) max = mid;
                else min = mid;
            }
            out.ans(max).ln();
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
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

        public int[][] ints(int height, int width) {
            return IntStream.range(0, height).mapToObj(x -> ints(width)).toArray(int[][]::new);
        }

    }
}

