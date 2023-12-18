import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static final int MOD = (int) (1e9 + 7);

    class Magic {
        int a, b;

        public Magic(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public void solve(InputReader in, PrintWriter out) {
        int h = in.nextInt(), n = in.nextInt();
        int[] magics = new int[h + 1];
        for (int i = 1; i <= h; ++i) {
            magics[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt(), b = in.nextInt();
            magics[a] = Math.min(magics[a], b);
        }

        int[] dp = new int[h + 1];
        dp[0] = 0;
        for (int i = 1; i <= h; ++i) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= h; ++i) {
            if (magics[i] == Integer.MAX_VALUE) continue;
            for (int j = h; j >= 1; --j) {
                for (int k = 1; j - k * i >= 0; ++k) {
                    if (dp[j - k * i] < Integer.MAX_VALUE) {
                        dp[j] = Math.min(dp[j], dp[j - k * i] + magics[i] * k);
                    }
                }
            }
        }

        out.println(dp[h]);
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(in, out);
        out.flush();
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}