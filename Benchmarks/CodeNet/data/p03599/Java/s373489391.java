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
        CSugarWater solver = new CSugarWater();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSugarWater {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int a = in.ints(), b = in.ints(), c = in.ints(), d = in.ints();
            int e = in.ints(), f = in.ints();
            int maxs = 1;
            int maxm = 0;

            for (int x = 0; x <= 30; x++) {
                int rdx = f - 100 * a * x;
                for (int y = 0; y * 100 <= rdx; y++) {
                    int n = a * x + b * y;
                    int cap = n * e;
                    int rdy = rdx - 100 * b * y;
                    for (int z = 0; z * c <= rdy && c * z <= cap; z++) {
                        int rdz = rdy - c * z;
                        for (int w = 0; d * w <= rdz && (c * z + d * w) <= cap; w++) {
                            int m = c * z + d * w;
                            int s = 100 * n + m;
                            if (maxm * s < m * maxs) {
                                maxm = m;
                                maxs = s;
                            }
                        }
                    }
                }
            }
            out.println(maxs + " " + maxm);
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

