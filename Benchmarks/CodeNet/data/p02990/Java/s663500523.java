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
        DBlueAndRedBalls solver = new DBlueAndRedBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBlueAndRedBalls {
        public static long mod = 10000_0000_7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long c[][] = new long[2001][2001];
            for (int i = 0; i <= 2000; i++) c[i][0] = 1;
            for (int i = 1; i <= 2000; i++) {
                for (int j = 1; j <= i; j++) {
                    c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
                }
            }
            int n = in.nextInt();
            int k = in.nextInt();
            for (int i = 1; i <= k; i++) {
                out.println((c[k - 1][i - 1] * c[n - k + 1][i]) % mod);
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

