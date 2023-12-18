import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EWeightsOnVerticesAndEdges solver = new EWeightsOnVerticesAndEdges();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWeightsOnVerticesAndEdges {
        int[] dsu;
        long[] total;
        int totalCount = 0;

        int find(int i) {
            if (dsu[i] != i) {
                dsu[i] = find(dsu[i]);
            }
            return dsu[i];
        }

        void merge(int i, int j) {
            i = find(i);
            j = find(j);
            if (i == j) return;
            total[i] += total[j];
            dsu[j] = i;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.NextInt();
            int m = in.NextInt();
            int[] x = in.NextIntArray(n);
            dsu = new int[n];
            for (int i = 0; i < n; i++) {
                dsu[i] = i;
            }
            total = new long[n];
            for (int i = 0; i < n; i++) {
                total[i] = x[i];
            }
            int[][] edges = new int[m][3];
            for (int i = 0; i < m; i++) {
                edges[i][0] = in.NextInt() - 1;
                edges[i][1] = in.NextInt() - 1;
                edges[i][2] = in.NextInt();
            }
            Arrays.sort(edges, Comparator.comparingInt(o -> o[2]));
            int[][][] g = GraphExtension.parseGraph_n_e_array_of_u_v_w_noSelfLoops(n, edges, false);
            boolean[] isBiggestOk = new boolean[m];
            for (int i1 = 0; i1 < m; i1++) {
                merge(edges[i1][0], edges[i1][1]);
                int cur = find(edges[i1][0]);
                isBiggestOk[i1] = total[cur] >= edges[i1][2];
            }

            for (int i = m - 1; i >= 0; i--) {
                if (isBiggestOk[i]) {
                    dfs(g, edges[i][0], edges[i][2]);
                }
            }
            out.println(m - totalCount / 2);
        }

        private void dfs(int[][][] g, final int i, int max) {
            for (int[] e : g[i]) {
                if (e[1] == 0 || e[1] > max) continue;
                e[1] = 0;
                totalCount++;
                dfs(g, e[0], max);
            }
        }

    }

    static class GraphExtension {
        private static int[] countEdgesPerVertex(int n, int[][] e, boolean directed) {
            int[] edgesCount = new int[n];
            for (int[] i : e) {
                edgesCount[i[0]]++;
                if (!directed)
                    edgesCount[i[1]]++;
            }
            return edgesCount;
        }

        public static int[][][] parseGraph_n_e_array_of_u_v_w_noSelfLoops(final int n, final int[][] e, final boolean directed) {
            int[] edgesCount = countEdgesPerVertex(n, e, directed);
            int[][][] graph = new int[n][][];
            for (int i = 0; i < n; i++)
                graph[i] = new int[edgesCount[i]][2];

            for (int[] i : e) {
                graph[i[0]][--edgesCount[i[0]]][0] = i[1];
                graph[i[0]][edgesCount[i[0]]][1] = i[2];
            }
            if (!directed) {
                for (int[] i : e) {
                    graph[i[1]][--edgesCount[i[1]]][0] = i[0];
                    graph[i[1]][edgesCount[i[1]]][1] = i[2];
                }
            }
            return graph;
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() + offset;
            }
            return a;
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(Writer out) {
            super(out);
        }

        public OutputWriter(File file) throws FileNotFoundException {
            super(file);
        }

        public OutputWriter(OutputStream out) {
            super(out);
        }

    }
}

