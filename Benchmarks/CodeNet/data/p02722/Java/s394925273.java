import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.BufferedOutputStream;
import java.util.HashSet;
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
        FDivisionOrSubstraction solver = new FDivisionOrSubstraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class FDivisionOrSubstraction {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            // out.setCaseLabel(LightWriter.CaseLabel.NONE);
            long n = in.longs();
            Set<Long> ans = new HashSet<>();
            for (long x : IntMath.getAllDivisors(n)) if (isValid(n, x)) ans.add(x);
            for (long x : IntMath.getAllDivisors(n - 1)) if (isValid(n, x)) ans.add(x);
            out.ans(ans.size()).ln();
        }

        private static boolean isValid(long n, long k) {
            if (k == 1) return false;
            while (n % k == 0) n /= k;
            return n % k == 1;
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static long[] getAllDivisors(long p) {
            Set<Long> res = new TreeSet<>();
            for (long i = 1; i * i <= p; i++) {
                if (p % i != 0) continue;
                res.add(i);
                if (i * i != p) res.add(p / i);
            }
            return res.stream().mapToLong(x -> x).toArray();
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

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

