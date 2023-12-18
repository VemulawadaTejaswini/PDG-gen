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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBingo solver = new BBingo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBingo {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a[][] = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            boolean cc[][] = new boolean[3][3];
            int q = in.nextInt();
            while (q-- > 0) {
                int temp = in.nextInt();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (a[i][j] == temp) {
                            cc[i][j] = true;
                        }
                    }
                }
            }
            boolean ans = false;
            for (int i = 0; i < 3; i++) {
                if (cc[i][0] && cc[i][1] && cc[i][2]) ans = true;
                if (cc[0][i] && cc[1][i] && cc[2][i]) ans = true;
            }
            if (cc[0][0] && cc[1][1] && cc[2][2]) ans = true;
            if (cc[0][2] && cc[1][1] && cc[2][0]) ans = true;
            if (ans) out.println("Yes");
            else out.println("No");

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

