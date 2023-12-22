import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.util.OptionalLong;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.Writer;
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
        FAirSafety solver = new FAirSafety();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAirSafety {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            Map<Integer, List<FAirSafety.P>> lr = new HashMap<>();
            Map<Integer, List<FAirSafety.P>> du = new HashMap<>();
            Map<Integer, List<FAirSafety.P>> ul = new HashMap<>();
            Map<Integer, List<FAirSafety.P>> ur = new HashMap<>();
            Map<Integer, List<FAirSafety.P>> dl = new HashMap<>();
            Map<Integer, List<FAirSafety.P>> dr = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = in.ints(), y = in.ints();
                char c = in.chr();
                if (c == 'D') {
                    du.computeIfAbsent(x, k -> new ArrayList<>()).add(new FAirSafety.P(y, -1));
                    dl.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new FAirSafety.P(x, 1));
                    dr.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new FAirSafety.P(x, -1));
                }
                if (c == 'U') {
                    du.computeIfAbsent(x, k -> new ArrayList<>()).add(new FAirSafety.P(y, 1));
                    ul.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new FAirSafety.P(x, 1));
                    ur.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new FAirSafety.P(x, -1));
                }
                if (c == 'L') {
                    lr.computeIfAbsent(y, k -> new ArrayList<>()).add(new FAirSafety.P(x, -1));
                    dl.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new FAirSafety.P(x, -1));
                    ul.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new FAirSafety.P(x, -1));
                }
                if (c == 'R') {
                    lr.computeIfAbsent(y, k -> new ArrayList<>()).add(new FAirSafety.P(x, 1));
                    dr.computeIfAbsent(x - y, k -> new ArrayList<>()).add(new FAirSafety.P(x, 1));
                    ur.computeIfAbsent(x + y, k -> new ArrayList<>()).add(new FAirSafety.P(x, 1));
                }
            }

            long ans = Integer.MAX_VALUE;
            ans = Math.min(ans, 5 * lr.values().stream().map(FAirSafety::solve).mapToLong(x -> x).min().orElse(Integer.MAX_VALUE));
            ans = Math.min(ans, 5 * du.values().stream().map(FAirSafety::solve).mapToLong(x -> x).min().orElse(Integer.MAX_VALUE));
            ans = Math.min(ans, 10 * dr.values().stream().map(FAirSafety::solve).mapToLong(x -> x).min().orElse(Integer.MAX_VALUE));
            ans = Math.min(ans, 10 * dl.values().stream().map(FAirSafety::solve).mapToLong(x -> x).min().orElse(Integer.MAX_VALUE));
            ans = Math.min(ans, 10 * ur.values().stream().map(FAirSafety::solve).mapToLong(x -> x).min().orElse(Integer.MAX_VALUE));
            ans = Math.min(ans, 10 * ul.values().stream().map(FAirSafety::solve).mapToLong(x -> x).min().orElse(Integer.MAX_VALUE));


            if (ans < 0) throw new RuntimeException();
            if (ans >= Integer.MAX_VALUE) out.ans("SAFE").ln();
            else out.ans(ans).ln();
        }

        private static long solve(List<FAirSafety.P> li) {
            long ans = Integer.MAX_VALUE;
            li.sort(Comparator.comparing(p -> p.x));
            for (int i = 1; i < li.size(); i++) {
                if (li.get(i - 1).d == 1 && li.get(i).d == -1) {
                    ans = Math.min(ans, li.get(i).x - li.get(i - 1).x);
                }
            }
            return ans;
        }

        private static class P {
            int x;
            int d;

            P(int x, int d) {
                this.x = x;
                this.d = d;
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
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

        public char chr() {
            return string().charAt(0);
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
}

