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
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        static DEvenRelation.Node[] graph;
        static boolean[] visited;
        static ArrayList<Integer> ans;

        static void dfs(int a) {
            visited[a] = true;
            for (DEvenRelation.Pair p : graph[a].edges) {
                if (!visited[p.x]) {
                    if (p.y % 2 == 0) {
                        graph[p.x].c = graph[a].c;
                    } else {
                        graph[p.x].c = (graph[a].c + 1) % 2;
                    }
                    dfs(p.x);
                }
            }
        }

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            graph = new DEvenRelation.Node[n];
            ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph[i] = new DEvenRelation.Node();
                graph[i].edges = new ArrayList<>();
                ans.add(0);
            }

            for (int i = 0; i < n - 1; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                int w = sc.nextInt();
                graph[u].edges.add(new DEvenRelation.Pair(v, w));
                graph[v].edges.add(new DEvenRelation.Pair(u, w));
            }
            graph[0].c = 0;
            visited = new boolean[n];
            dfs(0);
            for (int i = 0; i < n; i++) {
                out.println(graph[i].c);
            }
        }

        static class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

        public static class Node {
            ArrayList<DEvenRelation.Pair> edges;
            int c;

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

