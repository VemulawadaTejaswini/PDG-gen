import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Edge>[] adj;
    static int n;
    static int[] res;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        adj = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        res = new int[n];
        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(new Edge(b, i));
            adj[b].add(new Edge(a, i));
        }

        dfs(1, 0, -1);

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(res[i], max);
        }

        System.out.println(max);
        for (int i = 0; i < n-1; i++) {
            System.out.println(res[i]);
        }
    }

    static void dfs(int u, int prev, int prevColor) {
        int last = 0;
        for (Edge e : adj[u]) {
            if (e.v == prev) {
                continue;
            }
            last++;
            if (last == prevColor) {
                last++;
            }
            dfs(e.v, u, last);
            res[e.id] = last;
        }
    }

    static class Edge {
        int v, id;
        public Edge(int v, int id) {
            this.v = v;
            this.id = id;
        }
    }

}
/*


 */