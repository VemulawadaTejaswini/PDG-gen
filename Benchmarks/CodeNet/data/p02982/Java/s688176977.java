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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGoodDistance solver = new BGoodDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGoodDistance {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int d = in.nextInt();
            int a[][] = new int[n][d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < d; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            int count = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {
                    sum = 0;
                    for (int k = 0; k < d; k++) {
                        sum += (a[j][k] - a[i][k]) * (a[j][k] - a[i][k]);
                    }
                    long x = (long) Math.sqrt((double) sum);
                    if (x * x == sum) {
                        count++;
                    }
                }
            }
            out.println(count);
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

