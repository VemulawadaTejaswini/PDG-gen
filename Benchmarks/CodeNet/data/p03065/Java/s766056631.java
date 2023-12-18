import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
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
        EPolynomialDivisors solver = new EPolynomialDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class EPolynomialDivisors {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            long[] q = in.longs(n + 1);
            ArrayUtil.reverse(q, 0, n + 1);

            BigInteger[] a = new BigInteger[n + 1];
            for (int i = 0; i <= n; i++) {
                a[i] = BigInteger.valueOf(q[i]);
            }
            BigInteger ans = BigInteger.valueOf(LongStream.of(q).sum());

            for (int i = 0; i <= 10_010; i++) {
                BigInteger v = BigInteger.ZERO;
                BigInteger ib = BigInteger.valueOf(i);
                BigInteger m = ib;
                for (int j = 0; j <= n; j++) {
                    v = v.add(m.multiply(a[j])).mod(ans);
                    m = m.multiply(ib).mod(ans);
                }
                if (!v.equals(BigInteger.ZERO)) {
                    ans = v;
                }
            }

            long ansl = ans.longValue();
            for (long i = 2; i * i <= ansl; i++) {
                if (ansl % i != 0) continue;
                while (ansl % i == 0) {
                    ansl /= i;
                }
                out.ans(i).ln();
            }
            if (ansl > 1) {
                out.ans(ansl).ln();
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

        public long longs() {
            return Long.parseLong(string());
        }

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void reverse(long[] a, int left, int right) {
            right--;
            while (left < right) {
                long temp = a[left];
                a[left++] = a[right];
                a[right--] = temp;
            }
        }

    }
}

