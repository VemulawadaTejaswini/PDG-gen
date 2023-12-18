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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private int[] match;
        private boolean[] mark;
        private int[][] cap;
        private int height;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            height = in.nextInt();
            int width = in.nextInt();
            int[][] a = new int[height][width];
            for (int r = 0; r < height; ++r) {
                for (int c = 0; c < width; ++c) {
                    a[r][c] = in.nextInt() - 1;
                }
            }
            cap = new int[height][height];
            int[][] first = new int[height][height];
            int[][] next = new int[height][width];
            for (int r = 0; r < height; ++r) {
                for (int o = 0; o < height; ++o) {
                    cap[r][o] = 0;
                    first[r][o] = -1;
                }
            }
            for (int r = 0; r < height; ++r) {
                for (int c = 0; c < width; ++c) {
                    int o = a[r][c] / width;
                    ++cap[r][o];
                    next[r][c] = first[r][o];
                    first[r][o] = c;
                }
            }
            match = new int[height];
            mark = new boolean[height];
            int[][] res = new int[height][width];
            for (int stage = 0; stage < width; ++stage) {
                Arrays.fill(match, -1);
                for (int r = 0; r < height; ++r) {
                    Arrays.fill(mark, false);
                    if (!dfs(r)) throw new RuntimeException();
                }
                for (int o = 0; o < height; ++o) {
                    int r = match[o];
                    res[r][stage] = a[r][first[r][o]];
                    first[r][o] = next[r][first[r][o]];
                    --cap[r][o];
                }
            }
            for (int r = 0; r < height; ++r) {
                for (int c = 0; c < width; ++c) {
                    out.print(res[r][c] + 1 + " ");
                }
                out.println();
            }
            int[] tmp = new int[height];
            for (int c = 0; c < width; ++c) {
                for (int r = 0; r < height; ++r) {
                    tmp[r] = res[r][c];
                }
                Arrays.sort(tmp);
                for (int r = 0; r < height; ++r) {
                    res[r][c] = tmp[r];
                }
            }
            for (int r = 0; r < height; ++r) {
                for (int c = 0; c < width; ++c) {
                    out.print(res[r][c] + 1 + " ");
                }
                out.println();
            }
        }

        private boolean dfs(int r) {
            if (mark[r]) return false;
            mark[r] = true;
            for (int o = 0; o < height; ++o)
                if (cap[r][o] > 0) {
                    if (match[o] < 0) {
                        match[o] = r;
                        return true;
                    }
                }
            for (int o = 0; o < height; ++o)
                if (cap[r][o] > 0) {
                    if (dfs(match[o])) {
                        match[o] = r;
                        return true;
                    }
                }
            return false;
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

