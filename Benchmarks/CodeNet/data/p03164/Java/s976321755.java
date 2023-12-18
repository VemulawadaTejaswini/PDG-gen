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
            int n = inp.nextInt(), w = inp.nextInt();
            long[] dp = new long[100001]; // minimum weight required for value
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;
            for (int i = 0; i < n; i++) {
                int weight = inp.nextInt(), value = inp.nextInt();

                long[] dp2 = new long[100001];
                System.arraycopy(dp, 0, dp2, 0, 100001);

                for (int j = 0; j + value <= 100000; j++) {
                    if (dp[j] != Long.MAX_VALUE) {
                        dp2[j+value] = Math.min(dp[j+value], dp[j] + weight);
                    }
                }
                dp = dp2;
            }
            long res = 0;
            for (int i = 0; i <= 100000; i++) {
                if (dp[i] <= w) res = Math.max(res, i);
            }
            out.print(res);
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
