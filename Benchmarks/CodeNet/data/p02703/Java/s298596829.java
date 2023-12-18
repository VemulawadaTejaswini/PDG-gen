import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;


import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 2019;
    Vertex[] vs;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        s = Math.min(s, m * 50);
        int up = m * 55;
        long[][] dis = new long[n][up];
        vs = new Vertex[n];
        for (int i = 0; i < n; i++) vs[i] = new Vertex(i);
        for (int i = 0; i < m; i++) {
            Vertex u = vs[in.nextInt() - 1];
            Vertex v = vs[in.nextInt() - 1];
            int a = in.nextInt();
            int b = in.nextInt();
            addEdge(u, v, a, b);
        }
        for (int i = 0; i < n; i++) {
            vs[i].c = in.nextInt();
            vs[i].d = in.nextInt();
        }
        Boolean[][] vis = new Boolean[n][up];
        for (int i = 0; i < n; i++) Arrays.fill(dis[i], -1L);
        for (int i = 0; i < n; i++) Arrays.fill(vis[i],false);
        dis[0][s] = 0;
        vis[0][s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(s);
        while (!queue.isEmpty()) {
            int x = queue.poll();
            int k = queue.poll();
            vis[x][k] = false;
            Vertex u = vs[x];
            int kk = Math.min(k + u.c, up - 1);
            if ((dis[x][kk] == -1 || dis[x][kk] > dis[x][k] + u.d)) {
                dis[x][kk] = dis[x][k] + u.d;
                if (!vis[x][kk]) {
                    vis[x][kk] = true;
                    queue.add(x);
                    queue.add(kk);
                }
            }
            for (Edge edge : u.adj) {
                int y = edge.dist;
                int nk = k - edge.a;
                if (nk >= 0 && (dis[y][nk] == -1 || dis[y][nk] > dis[x][k] + edge.b)) {
                    dis[y][nk] = dis[x][k] + edge.b;
                    if (!vis[y][nk]) {
                        vis[y][nk] = true;
                        queue.add(y);
                        queue.add(nk);
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            Long ans = Long.MAX_VALUE;
            for (int j = 0; j < up; j++) if (dis[i][j] != -1) {
                ans = Math.min(ans, dis[i][j]);
            }
            out.println(ans);
        }

    }

    private void addEdge(Vertex u, Vertex v, int a, int b) {
        Edge uv = new Edge();
        Edge vu = new Edge();
        uv.dist = v.id;
        uv.a = a;
        uv.b = b;
        vu.dist = u.id;
        vu.a = a;
        vu.b = b;
        u.adj.add(uv);
        v.adj.add(vu);
    }

    class Vertex {
        int id;
        List<Edge> adj = new ArrayList<>();
        int c, d;

        public Vertex(int id) {
            this.id = id;
        }
    }

    class Edge {
        int dist;
        int a;
        int b;
    }


}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}