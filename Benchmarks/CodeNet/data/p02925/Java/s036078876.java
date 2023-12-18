import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        static boolean loop;
        static boolean[] stack;
        static boolean[] visited;
        static ELeague.Node[] graph;

        static void dfs(int a) {
            visited[a] = true;
            stack[a] = true;
            for (int i : graph[a].edges) {
                if (stack[i]) {
                    loop = true;
                    return;
                }
                if (!visited[i]) {
                    dfs(i);
                    if (loop) {
                        return;
                    }
                }
                graph[a].max = Math.min(graph[a].max, graph[i].max - 1);
            }
            stack[a] = false;
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            graph = new ELeague.Node[n * (n - 1) / 2];
            visited = new boolean[n * (n - 1) / 2];
            stack = new boolean[n * (n - 1) / 2];
            for (int i = 0; i < n * (n - 1) / 2; i++) {
                graph[i] = new ELeague.Node();
                graph[i].edges = new ArrayList<>();
                graph[i].max = 1000000000;
            }
            HashMap<ELeague.Pair, Integer> rep = new HashMap<>();
            int act = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    rep.put(new ELeague.Pair(i, j), act);
                    act++;
                }
            }
            for (int i = 0; i < n; i++) {
                int deb = sc.nextInt() - 1;
                int a = rep.get(new ELeague.Pair(Math.min(deb, i), Math.max(deb, i)));
                for (int j = 1; j < n - 1; j++) {
                    int nxt = sc.nextInt() - 1;
                    graph[a].edges.add(rep.get(new ELeague.Pair(Math.min(nxt, i), Math.max(nxt, i))));
                    a = rep.get(new ELeague.Pair(Math.min(nxt, i), Math.max(nxt, i)));
                }
            }
            for (int i = 0; i < n * (n - 1) / 2; i++) {
                if (!visited[i]) {
                    dfs(i);
                    if (loop) {
                        out.println(-1);
                        return;
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                min = Math.min(min, graph[i].max);
            }
            out.println(1000000000 - min + 1);
        }

        static class Node {
            ArrayList<Integer> edges;
            int max;

        }

        static class Pair {
            int x;
            int y;

            public Pair() {
            }

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }

                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                ELeague.Pair pair = (ELeague.Pair) o;
                return x == pair.x && y == pair.y;
            }

            public int hashCode() {
                int result = Integer.hashCode(x);
                result = 31 * result + Integer.hashCode(y);
                return result;
            }

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

