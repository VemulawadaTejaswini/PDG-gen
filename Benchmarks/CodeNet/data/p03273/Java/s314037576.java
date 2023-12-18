import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        BGridCompression solver = new BGridCompression();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGridCompression {
        static final char BLACK = '#';
        static final char WHITE = '.';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();

            boolean[][] a = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                String s = in.next();
                for (int j = 0; j < w; j++) {
                    a[i][j] = s.charAt(j) == BLACK;
                }
            }

            boolean[] skipRow = new boolean[h];
            boolean[] skipCol = new boolean[w];
            Arrays.fill(skipRow, true);
            Arrays.fill(skipCol, true);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    skipRow[i] &= !a[i][j];
                    skipCol[j] &= !a[i][j];
                }
            }

            for (int i = 0; i < h; i++) {
                if (skipRow[i])
                    continue;
                for (int j = 0; j < w; j++) {
                    if (skipCol[j])
                        continue;

                    out.print(a[i][j] ? BLACK : WHITE);
                }

                out.println();
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

