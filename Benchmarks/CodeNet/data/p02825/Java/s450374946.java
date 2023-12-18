import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        if (n % 3 != 0) {
            out.println(-1);
        } else {
            char[][] s = new char[n][n];
            for (int i = 0; i < n; ++i) {
                Arrays.fill(s[i], '.');
            }
            for (int i = 0, j = 0; i < n; ) {
                if (i % 3 == 0) {
                    s[i][j] = s[i][j + 1] = 'a';
                    i++;
                    j += 2;
                } else {
                    s[i][j] = s[i + 1][j] = 'a';
                    i += 2;
                    j++;
                }
            }
            for (int i = 0; i < n; ++i) {
                out.println(new String(s[i]));
            }
        }
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
