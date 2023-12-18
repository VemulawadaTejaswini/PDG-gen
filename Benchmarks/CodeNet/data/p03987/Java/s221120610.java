import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.util.Comparator;
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
        AtB solver = new AtB(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtB {
        private final FastScanner in;
        private final PrintWriter out;
        private Pair[] a;

        public AtB(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) throws InterruptedException {
            Thread thread = new Thread(null, this::solve, "solution", 1 << 24);
            thread.setUncaughtExceptionHandler((t, e) -> {
                throw new RuntimeException(e);
            });
            thread.start();
            thread.join();
        }

        public void solve() {
            try {
                int n = 0;
                n = in.nextInt();

                a = new Pair[n];
                for (int i = 0; i < n; i++) {
                    int val = in.nextInt();
                    a[i] = new Pair(val, i);
                }

                Arrays.sort(a, Comparator.comparingInt(x -> x.value));

                out.println(calc(0, 0, n - 1));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private BigInteger calc(int i, int from, int to) {
            if (i == a.length) {
                return BigInteger.ZERO;
            }
            int index = a[i].index;
            if (index < from || index > to) {
                return calc(i + 1, from, to);
            }
            BigInteger sum = BigInteger.valueOf(a[i].value * (index - from + 1L) * (to - index + 1L));
            return sum.add(calc(i + 1, from, index - 1)).add(calc(i + 1, index + 1, to));
        }

    }

    static class FastScanner {
        private final BufferedReader br;
        private String line;
        private int pos;

        public FastScanner(String s) throws IOException {
            this(new StringReader(s));
        }

        public FastScanner(InputStream is) throws IOException {
            this(new InputStreamReader(is, "UTF-8"));
        }

        public FastScanner(Reader reader) throws IOException {
            this(new BufferedReader(reader));
        }

        public FastScanner(BufferedReader reader) throws IOException {
            br = reader;
            line = br.readLine();
            pos = 0;
        }

        public String next() throws IOException {
            if (!skipWhitespace()) {
                return null;
            }

            int start = pos;

            while (pos < line.length()) {
                char c = line.charAt(pos);

                if (c == ' ' || c == '\t') {
                    break;
                }

                pos++;
            }

            return line.substring(start, pos);
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        private boolean skipWhitespace() throws IOException {
            while (line != null) {
                while (pos < line.length()) {
                    char c = line.charAt(pos);

                    if (c != ' ' && c != '\t') {
                        return true;
                    }

                    pos++;
                }

                line = br.readLine();
                pos = 0;
            }

            return false;
        }

    }

    static class Pair {
        final int value;
        final int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }
}

