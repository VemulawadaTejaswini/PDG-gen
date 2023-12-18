import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSortingAGrid solver = new DSortingAGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSortingAGrid {
        List<Integer>[] graph;
        boolean[] used;
        int[] match;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] a = new int[n][m];

            graph = Utils.listArray(n);
            boolean[][] put = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt() - 1;
                    graph[i].add(a[i][j] / m);
                }
            }

            int[][] b = new int[n][m];
            int[][] c = new int[n][m];

            for (int iter = 0; iter < m; iter++) {
                used = new boolean[n];
                match = new int[n];
                Arrays.fill(match, -1);
                for (int i = 0; i < n; i++) {
                    Arrays.fill(used, false);
                    dfs(i);
                }

                for (int r = 0; r < n; r++) {
                    int l = match[r];
                    for (int i = 0; i < m; i++) {
                        if (!put[l][i] && a[l][i] / m == r) {
                            put[l][i] = true;
                            b[l][iter] = a[l][i];
                            break;
                        }
                    }
                    graph[l].remove((Integer) r);
                }
            }
            for (int i = 0; i < m; i++) {
                int[] tmp = new int[n];
                for (int j = 0; j < n; j++) {
                    tmp[j] = b[j][i];
                }
                Arrays.sort(tmp);
                for (int j = 0; j < n; j++) {
                    c[j][i] = tmp[j];
                }
            }

            for (int[][] output : new int[][][]{b, c}) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        out.print(output[i][j] + 1);
                        if (j + 1 == m) {
                            out.println();
                        } else {
                            out.print(' ');
                        }
                    }
                }
            }
        }

        private boolean dfs(int u) {
            used[u] = true;
            for (int t = 0; t < graph[u].size(); t++) {
                int v = graph[u].get(t);
                if (match[v] == -1) {
                    match[v] = u;
                    return true;
                }
            }

            for (int t = 0; t < graph[u].size(); t++) {
                int v = graph[u].get(t);
                if (!used[match[v]] && dfs(match[v])) {
                    match[v] = u;
                    return true;
                }
            }
            return false;
        }

    }

    static class Utils {
        public static <T> List<T>[] listArray(int size) {
            List<T>[] result = new List[size];
            for (int i = 0; i < size; i++) {
                result[i] = new ArrayList<>();
            }
            return result;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

