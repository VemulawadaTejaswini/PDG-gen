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
        DGridComponents solver = new DGridComponents();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridComponents {
        static final int maxH = 100;
        static final int maxW = 100;
        static final char A = '.';
        static final char B = '#';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt();

            a--;
            b--;

            char[][] answer = new char[maxH][maxW];

            int r = 0, c = 0;

            for (int i = 0; i < a; i++) {
                answer[r][c] = A;
                answer[r + 1][c] = B;
                answer[r + 1][c + 1] = B;
                answer[r][c + 1] = B;
                c += 2;
                if (c >= maxW) {
                    c = 0;
                    r += 2;
                }
            }

            for (; c < maxW; c++) {
                answer[r][c] = B;
                answer[r + 1][c] = B;
            }

            r += 2;
            c = 0;

            for (; c < maxW; c++) {
                answer[r][c] = A;
            }
            r++;
            c = 0;

            for (int i = 0; i < b; i++) {
                answer[r][c] = B;
                answer[r + 1][c] = A;
                answer[r + 1][c + 1] = A;
                answer[r][c + 1] = A;
                c += 2;
                if (c >= maxW) {
                    c = 0;
                    r += 2;
                }
            }

            for (; c < maxW; c++) {
                answer[r][c] = A;
                answer[r + 1][c] = A;
            }

            r += 2;
            c = 0;

            out.println(r + " " + maxW);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < maxW; j++) {
                    out.print(answer[i][j]);
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

