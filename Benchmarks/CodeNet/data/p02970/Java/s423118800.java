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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGoldenApple solver = new BGoldenApple();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGoldenApple {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int d = in.nextInt();
            int total = 0;
            int pos = d + 1;
            int painted = 0;
            while (true) {
                if (pos > n) {
                    break;
                } else {
                    total++;
                    painted += d * 2 + 1;
                    pos = pos + d + 1 + d;
                }

            }
            if (painted < n)
                total++;
            out.println(total);
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

