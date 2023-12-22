import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    int n;
    List<List<Integer>> graph;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int c = sc.nextInt();
                graph.get(i).add(c);
                graph.get(c).add(i);
            }
        }
        LowestCommonAncestor lca = new LowestCommonAncestor(graph);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(lca.lca(sc.nextInt(), sc.nextInt()));
        }
    }

    class LowestCommonAncestor {
        List<List<Integer>> graph;
        int[][] parents;
        int[] depth;

        LowestCommonAncestor(List<List<Integer>> graph) {
            this.graph = graph;
            int n = graph.size();
            int logN = (int)Math.ceil(Math.log(n)/Math.log(2)+1e-10);
            parents = new int[logN][n];
            depth = new int[n];
            init(0, -1, 0);
            initParents();
        }

        int lca(int u, int v) {
            if (depth[u] > depth[v]) {
                int temp = u;
                u = v;
                v = temp;
            }
            for (int i = 0; i < parents.length; i++) {
                if (((depth[v] - depth[u]) >> i & 1) > 0) {
                    v = parents[i][v];
                }
            }
            if (u == v) {
                return u;
            }
            for (int i = parents.length - 1; i >= 0; i--) {
                if (parents[i][u] != parents[i][v]) {
                    u = parents[i][u];
                    v = parents[i][v];
                }
            }
            return parents[0][u];
        }

        void init(int v, int p, int d) {
            parents[0][v] = p;
            depth[v] = d;
            for (int next : graph.get(v)) {
                if (next != p) {
                    init(next, v, d + 1);
                }
            }
        }

        void initParents() {
            for (int i = 0; i < parents.length - 1; i++) {
                for (int j = 0; j < parents[0].length; j++) {
                    if (parents[i][j] < 0) {
                        parents[i + 1][j] = -1;
                    } else {
                        parents[i + 1][j] = parents[i][parents[i][j]];
                    }
                }
            }
        }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}

