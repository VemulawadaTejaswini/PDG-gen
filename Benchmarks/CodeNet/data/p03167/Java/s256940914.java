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
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HGrid1 solver = new HGrid1();
        solver.solve(1, in, out);
        out.close();
    }

    static class HGrid1 {
        long mod = (long) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.ni(), w = in.ni();
            char[][] grid = new char[h + 1][w + 1];
            long[][] pr = new long[h + 1][w + 1];
            for (int i = 1; i <= h; ++i) {
                String x = in.next();
                for (int j = 1; j <= w; ++j) {
                    grid[i][j] = x.charAt(j - 1);
                }
            }
            pr[1][1] = 1;
            for (int i = 1; i <= h; ++i) {
                for (int j = 1; j <= w; ++j) {
                    if (grid[i][j] == '.') {
                        pr[i][j] += (pr[i - 1][j] + pr[i][j - 1]) % mod;
                    }
                }
            }
            out.println(pr[h][w] % mod);
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

        public int ni() {
            return Integer.parseInt(next());
        }

    }
}

