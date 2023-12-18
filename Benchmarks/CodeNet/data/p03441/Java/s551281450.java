// Taken from http://codeforces.com/gym/101681/submission/33993705
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    ArrayList<Integer>[] g;
    HashSet<Integer> ans = new HashSet<>();
    boolean[] used;
    boolean[] marked;
    int[] someLeaf;
    int[] parent;

    int dfs(int v) {
        used[v] = true;
        int leaf = v;
        for (int i = 0; i < g[v].size(); i++) {
            int to = g[v].get(i);
            if (!used[to]) {
                parent[to] = v;
                leaf = someLeaf[to] = dfs(to);
                marked[v] |= marked[to];
            }
        }
        boolean isFirst = true;
        for (int i = 0; i < g[v].size(); i++) {
            int to = g[v].get(i);
            if (parent[to] != v) {
                continue;
            }
            if (!marked[to]) {
                if (!isFirst) {
                    ans.add(someLeaf[to]);
                    marked[v] = true;
                }
                isFirst = false;
            }
        }
        return leaf;
    }

    public void run() throws IOException {
        MyScanner in = new MyScanner(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            g[a].add(b);
            g[b].add(a);
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (g[i].size() > 2) {
                root = i;
                break;
            }
        }
        if (root == -1) {
            for (int i = 0; i < n; i++) {
                if (g[i].size() == 1) {
                    out.println("1");
                    //out.println(i + 1);
                    out.close();
                    return;
                }
            }
        }
        parent = new int[n];
        Arrays.fill(parent, -1);
        someLeaf = new int[n];
        used = new boolean[n];
        marked = new boolean[n];
        dfs(root);
        out.println(ans.size());
        //for (int v : ans) {
        //    out.print(v + 1 + " ");
        //}
        out.close();
    }

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    static class MyScanner {
        private BufferedReader br;
        private StringTokenizer st;

        public MyScanner(Reader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
