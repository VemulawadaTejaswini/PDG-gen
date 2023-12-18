import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BHoles solver = new BHoles();
        solver.solve(1, in, out);
        out.close();
    }

    static class BHoles {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();


            int[] x = new int[n];
            int[] y = new int[n];

            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            for (int cur = 0; cur < n; cur++) {
                double[] angle = new double[n - 1];
                for (int j = 0, index = 0; j < n; j++) {
                    if (j == cur) {
                        continue;
                    }

                    angle[index++] = Math.atan2(y[j] - y[cur], x[j] - x[cur]) / (2 * Math.PI);
                }

                double normalized = angle[0];
                for (int i = 0; i < n - 1; i++) {
                    angle[i] -= normalized;
                    if (angle[i] < -0.5) {
                        angle[i] += 1;
                    }
                    if (angle[i] > +0.5) {
                        angle[i] -= 1;
                    }
                }

                double min = -0.25;
                double max = +0.25;

                for (double a : angle) {
                    double lower = a - 0.25;
                    double upper = a + 0.25;

                    min = Math.max(min, lower);
                    max = Math.min(max, upper);
                }

                out.println(Math.max(0, max - min));
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

