import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) h[i] = inp.nextInt();

            int[] dp = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);

            dp[0] = 0;
            for (int i = 0; i < n; i++) {
                if (i + 1 < n) {
                    dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i] - h[i+1]));
                }
                if (i + 2 < n) {
                    dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i] - h[i+2]));
                }
            }
            out.print(dp[n-1]);
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}