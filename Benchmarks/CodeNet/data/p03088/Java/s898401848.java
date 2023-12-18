import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
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
        DWeLikeAGC solver = new DWeLikeAGC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLikeAGC {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            Map<DWeLikeAGC.V, Long> dp = new HashMap<>();
            n -= 3;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if ((i == 0 && j == 1 && k == 2)
                                || (i == 1 && j == 0 && k == 2)
                                || (i == 0 && j == 2 && k == 1)) continue;
                        dp.put(new DWeLikeAGC.V(i, j, k), 1L);
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                //System.out.println(dp);
                Map<DWeLikeAGC.V, Long> res = new HashMap<>();

                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            DWeLikeAGC.V prev = new DWeLikeAGC.V(j, k, l);
                            if (!dp.containsKey(prev)) continue;
                            for (int m = 0; m < 4; m++) {
                                if (prev.invl(m)) continue;
                                DWeLikeAGC.V next = new DWeLikeAGC.V(k, l, m);
                                res.merge(next, dp.get(prev), (x, y) -> (x + y) % MOD);
                            }
                        }
                    }
                }

                dp = res;
            }
            //System.out.println(dp);

            long ans = 0;
            for (long v : dp.values()) {
                ans += v;
                ans %= MOD;
            }
            out.ansln(ans);
        }

        private static class V {
            int first;
            int middle;
            int last;

            public V(int first, int middle, int last) {
                this.first = first;
                this.middle = middle;
                this.last = last;
            }

            public boolean invl(int a) {
                return (middle == 0 && last == 1 && a == 2)
                        || (middle == 0 && last == 2 && a == 1)
                        || (middle == 1 && last == 0 && a == 2)
                        || (first == 0 && middle == 1 && a == 2)
                        || (first == 0 && last == 1 && a == 2);
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                DWeLikeAGC.V v = (DWeLikeAGC.V) o;
                return first == v.first &&
                        middle == v.middle &&
                        last == v.last;
            }

            public int hashCode() {
                return Objects.hash(first, middle, last);
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ansln(long... n) {
            for (long n1 : n) {
                ans(n1).ln();
            }
            return this;
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

    }
}

