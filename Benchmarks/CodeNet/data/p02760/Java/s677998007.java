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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = 3;
            int[][] ar = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    ar[i][j] = in.nextInt();
            int sz = in.nextInt();
            boolean[][] f = new boolean[n][n];
            for (int i = 0; i < sz; i++) {
                int cur = in.nextInt();
                for (int j = 0; j < n; j++)
                    for (int k = 0; k < n; k++)
                        if (ar[j][k] == cur) {
                            f[j][k] = true;
                        }
            }
            boolean ok = false;
            for (int i = 0; i < n; i++) {
                boolean fl = true;
                for (int j = 0; j < n; j++)
                    if (!f[i][j]) {
                        fl = false;
                    }
                if (fl)
                    ok = true;
            }
            for (int i = 0; i < n; i++) {
                boolean fl = true;
                for (int j = 0; j < n; j++)
                    if (!f[j][i]) {
                        fl = false;
                    }
                if (fl)
                    ok = true;
            }
            boolean fl = true;
            for (int i = 0; i < n; i++) {
                if (!f[i][i]) {
                    fl = false;
                }
            }
            if (fl)
                ok = true;
            fl = true;
            for (int i = 0; i < n; i++) {
                if (!f[i][n - i - 1]) {
                    fl = false;
                }
            }
            if (fl)
                ok = true;
            if (ok)
                out.println("Yes");
            else
                out.println("No");
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

