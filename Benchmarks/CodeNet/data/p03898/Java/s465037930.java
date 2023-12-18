import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskK solver = new TaskK();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskK {
        public ArrayList<Integer>[] graph;
        public int[] deg;
        public int[] size;
        public int[] numleaves;
        public int[] tochild;
        public int[] depth;
        public int res;
        public int ss;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            graph = new ArrayList[n];
            deg = new int[n];
            size = new int[n];
            numleaves = new int[n];
            tochild = new int[n];
            depth = new int[n];
            for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                graph[a].add(b);
                graph[b].add(a);
                deg[a]++;
                deg[b]++;
            }
            int root = -1;
            ss = 0;
            for (int i = 0; i < n; i++) {
                if (deg[i] == 1) {
                    root = i;
                }
                if (deg[i] == 1) ss++;
            }
            if (root == -1) {
                out.println(n);
                return;
            }

            res = ss;
            dfs(root, -1);

            out.println(res);
        }

        public int dfs(int node, int par) {
            size[node] = 1;
            tochild[node] = 1;
            depth[node] = (par == -1 ? 0 : (depth[par] + 1));
            int best1 = 0, best2 = 0;
            for (int next : graph[node]) {
                if (next == par) continue;
                int a1 = dfs(next, node);
                if (a1 > best1) {
                    best2 = best1;
                    best1 = a1;
                } else if (a1 > best2) {
                    best2 = a1;
                }
                tochild[node] = Math.max(tochild[node], 1 + tochild[next]);
                numleaves[node] += numleaves[next];
                size[node] += size[next];
            }
            res = Math.max(res, best1 + best2 + ss);
            res = Math.max(res, depth[node] + best1 + numleaves[node]);
            numleaves[node] += (deg[node] == 1 ? 1 : 0);

            return Math.max(best1, tochild[node] - numleaves[node]);
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

