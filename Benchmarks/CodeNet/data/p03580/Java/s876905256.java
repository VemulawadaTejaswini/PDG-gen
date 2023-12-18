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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            char[] S = ("0" + in.next() + "0").toCharArray();

            int[] dp = new int[N + 1];

            for (int i = 1; i < N; i++) {
                dp[i + 1] = Math.max(dp[i + 1], dp[i]);

                if (S[i - 1] == '1' && S[i] == '0' && S[i + 1] == '1') {
                    int j = i - 1;
                    while (j >= 1 && S[j] == '1') {
                        dp[i + 1] = Math.max(dp[i + 1], dp[j - 1] + (i + 1 - j - 1));
                        j--;
                    }

                    j = i + 1;

                    while (j <= N && S[j] == '1') {
                        dp[j] = Math.max(dp[j], dp[i - 2] + (j - (i - 1) - 1));
                        j++;
                    }
                }
            }

            out.println(dp[N]);
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

