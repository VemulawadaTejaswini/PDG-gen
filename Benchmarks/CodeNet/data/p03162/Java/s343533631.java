import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);

        int n = in.nextInt();
        StringBuilder output = new StringBuilder();

        int[][] dp = new int[n][3];
        for (int i = 0; i < n; ++i) {
            String[] s = in.nextLine().split(" ");

            for (int j=0; j<3; ++j) {
                if (i == 0) {
                    if (j == 0)
                        dp[i][j] = toInt(s[0]);
                    else if (j == 1)
                        dp[i][j] = toInt(s[1]);
                    else
                        dp[i][j] = toInt(s[2]);
                } else {
                    for (int k=0; k<3; ++k) {
                        if (j == k) continue;

                        if (j == 0)
                            dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + toInt(s[0]));
                        else if (j == 1)
                            dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + toInt(s[1]));
                        else
                            dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + toInt(s[2]));
                    }
                }
            }
        }

        output.append(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));

        System.out.print(output);
    }

    static int toInt(String c) {
        return Integer.parseInt(c);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
