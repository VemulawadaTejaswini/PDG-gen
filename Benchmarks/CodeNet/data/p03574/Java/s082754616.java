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
        int n;
        int m;

        boolean r(int x, int y) {
            return x >= 0 && x < n && y >= 0 && y < m;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            char[][] v = new char[n][];
            for (int i = 0; i < n; ++i) v[i] = in.next().toCharArray();
            Dir[] w = {
                    new Dir(0, 1),
                    new Dir(-1, 0),
                    new Dir(0, -1),
                    new Dir(0, -1),
                    new Dir(1, 0),
                    new Dir(1, 0),
                    new Dir(0, 1),
                    new Dir(0, 1)
            };
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (v[i][j] == '#') {
                        out.print("#");
                        continue;
                    }
                    int s = 0;
                    int x = i;
                    int y = j;
                    for (int k = 0; k < 8; ++k) {
                        x += w[k].x;
                        y += w[k].y;
                        if (!r(x, y)) continue;
                        if (v[x][y] == '#') ++s;
                    }
                    out.print(s);
                }
                out.println();
            }
        }

        class Dir {
            int x;
            int y;

            public Dir(int x, int y) {
                this.x = x;
                this.y = y;
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

