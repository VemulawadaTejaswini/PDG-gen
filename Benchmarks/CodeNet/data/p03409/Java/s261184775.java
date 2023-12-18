import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C2DPlane2NPoints solver = new C2DPlane2NPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2DPlane2NPoints {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int[][] r = new int[2 * n + 2][2 * n + 2];
            int[] ax = new int[n], ay = new int[n], bx = new int[n], by = new int[n];
            in.ints(ax, ay);
            in.ints(bx, by);
            for (int i = 1; i <= n; i++) {
                r[0][i] = 1;
                r[n + i][2 * n + 1] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (ax[i] < bx[j] && ay[i] < by[j]) {
                        r[i + 1][j + n + 1] = 1;
                    }
                }
            }
            int ans = 0;
            int[] path;
            while ((path = dfs(r, 0, 2 * n + 1, 0, new boolean[2 * n + 2])) != null) {
                ans++;
                for (int i = 1; i < path.length; i++) {
                    r[path[i - 1]][path[i]]--;
                    r[path[i]][path[i - 1]]++;
                }
            }
            out.println(ans);
        }

        private int[] dfs(int[][] graph, int start, int goal, int depth, boolean[] searched) {
            if (start == goal) {
                int[] res = new int[depth + 1];
                res[depth] = goal;
                return res;
            }
            searched[start] = true;
            for (int i = 0; i < graph.length; i++) {
                if (!searched[i] && graph[start][i] > 0) {
                    int[] res = dfs(graph, i, goal, depth + 1, searched);
                    if (res != null) {
                        res[depth] = start;
                        return res;
                    }
                }
            }
            return null;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public void ints(int[]... arrays) {
            int l = Arrays.stream(arrays).mapToInt(a -> a.length).min().orElse(0);
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = ints();
                }
            }
        }

    }
}

