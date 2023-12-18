import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        PrintWriter out = new PrintWriter(outputStream);
        DAtCoderExpress solver = new DAtCoderExpress();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAtCoderExpress {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int[] t = in.ints(n);
            int[] v = in.ints(n);
            int s = IntStream.of(t).sum() * 2;
            int[] m = new int[s + 1];
            int cv = 0;
            int rt = 0;
            int ci = -1;
            for (int i = 1; i < s; i++) {
                if (rt == 0) {
                    ci++;
                    rt = t[ci] * 2;
                    if (v[ci] * 2 < cv) {
                        cv = v[ci] * 2;
                    }
                }
                if (cv < v[ci] * 2) {
                    cv++;
                }
                m[i] = cv;
                rt--;
            }
            //System.out.println(Arrays.toString(m));
            cv = 0;
            rt = 0;
            ci = n;
            for (int i = s - 1; i > 0; i--) {
                if (rt == 0) {
                    ci--;
                    rt = t[ci] * 2;
                    if (v[ci] < cv) {
                        cv = v[ci];
                    }
                }
                if (cv < v[ci] * 2) {
                    cv++;
                }
                m[i] = Math.min(cv, m[i]);
                rt--;
            }
            //System.out.println(Arrays.toString(m));
            out.println(IntStream.of(m).sum() / 4.0);
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

    }
}

