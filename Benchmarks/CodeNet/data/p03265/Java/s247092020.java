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
        BRuinedSquare solver = new BRuinedSquare();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRuinedSquare {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] x = new int[4];
            int[] y = new int[4];

            for (int i = 0; i <= 1; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            for (int i = 2; i <= 3; i++) {
                int dx = x[i - 1] - x[i - 2];
                int dy = y[i - 1] - y[i - 2];

                x[i] = x[i - 1] - dy;
                y[i] = y[i - 1] + dx;
            }

            String answer = String.format("%d %d %d %d", x[2], y[2], x[3], y[3]);

            out.println(answer);
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

