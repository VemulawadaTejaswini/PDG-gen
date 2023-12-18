import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[][] c = new int[3][3];
            for (int i = 0; i < 3; i++) {
                c[i] = in.nextIntArray(3);
            }

            int[] dx = {c[0][1] - c[0][0], c[0][2] - c[0][1]};
            int[] dy = {c[1][0] - c[0][0], c[2][0] - c[1][0]};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (c[j][i + 1] - c[j][i] != dx[i]) {
                        out.println("No");
                        return;
                    }

                    if (c[i + 1][j] - c[i][j] != dy[i]) {
                        out.println("No");
                        return;
                    }
                }
            }

            out.println("Yes");
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

