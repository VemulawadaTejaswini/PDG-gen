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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BFindSymmetries solver = new BFindSymmetries();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFindSymmetries {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            char[][] c = new char[n][];
            for (int i = 0; i < n; i++) {
                c[i] = in.next().toCharArray();
            }

            char[][] b = new char[n][n];
            int answer = 0;
            for (int offset = 0; offset < n; offset++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        b[i][j] = c[i][(j + offset) % n];
                    }
                }
                boolean valid = true;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        valid &= b[i][j] == b[j][i];
                    }
                }
                if (valid) {
                    answer++;
                }
            }

            answer *= n;

            out.println(answer);
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

