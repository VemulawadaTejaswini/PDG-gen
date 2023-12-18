import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        C4N solver = new C4N();
        solver.solve(1, in, out);
        out.close();
    }

    static class C4N {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            long n = in.ints();
            for (int h = 1; h <= 3500; h++) {
                for (int w = h; w <= 3500; w++) {
                    long c = n * h * w;
                    long m = 4 * h * w - n * (w + h);
                    if (m != 0 && c % m == 0) {
                        out.print(h);
                        out.print(' ');
                        out.print(c / m);
                        out.print(' ');
                        out.println(w);
                        return;
                    }
                }
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

