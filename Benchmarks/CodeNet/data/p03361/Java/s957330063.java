import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        char[][] campus;
        void solve(InputReader in, PrintWriter out) {
            // write your code here
            int H = in.nextInt(), W = in.nextInt();
            campus = new char[H + 2][W + 2];
            for (int i = 0; i < H; i++) {
                if (i == 0 || i == H + 1) {
                    Arrays.fill(campus[i], '.');
                } else {
                    campus[i] = ("." + in.next() + ".").toCharArray();
                }
            }

            boolean possible = true;
            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    if (campus[i][j] == '#') {
                        possible &= !isolated(i, j);
                    }
                }
            }

            out.println(possible ? "Yes" : "No");
        }

        boolean isolated(int i, int j) {
            return campus[i - 1][j] == '.' &&
                    campus[i][j - 1] == '.' &&
                    campus[i + 1][j] == '.' &&
                    campus[i][j + 1] == '.';
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}