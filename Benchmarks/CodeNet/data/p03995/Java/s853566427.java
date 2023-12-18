import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
/**
 * Created by Aksenov239 on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public class Pair implements Comparable<Pair> {
        int x, y;
        int a;

        public Pair(int x, int y, int a) {
            this.x = x;
            this.y = y;
            this.a = a;
        }

        public int compareTo(Pair p) {
            return x == p.x ? y - p.y : x - p.x;
        }
    }

    public class Edge {
        int v, w;

        public Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    ArrayList<Edge>[] e;
    int[] color;
    int[] value;
    int[] min;

    public void dfs(int v, int c, int current) throws Exception {
        if (color[v] == c) {
            if (value[v] != current) {
                throw new Exception("WTF?!");
            }
            return;
        }
        color[v] = c;
        value[v] = current;
        min[c] = Math.min(min[c], current);
        for (Edge edge : e[v]) {
            dfs(edge.v, c, edge.w + current);
        }
    }

    public void solve() throws IOException {
        int x = nextInt();
        int y = nextInt();
        int n = nextInt();
        Pair[] a = new Pair[n];
        e = new ArrayList[y];
        for (int i = 0; i < e.length; i++) {
            e[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < n; i++) {
            a[i] = new Pair(nextInt() - 1, nextInt() - 1, nextInt());
        }
        Arrays.sort(a);
        int i = 0;
        while (i < a.length) {
            int j = i + 1;
            while (j < a.length && a[i].x == a[j].x) {
                e[a[i].y].add(new Edge(a[j].y, a[j].a - a[i].a));
                e[a[j].y].add(new Edge(a[i].y, a[i].a - a[j].a));
                j++;
            }
            i = j;
        }
        color = new int[e.length];
        Arrays.fill(color, -1);
        min = new int[e.length];
        Arrays.fill(min, Integer.MAX_VALUE);
        value = new int[e.length];
        int c = 0;
        for (i = 0; i < e.length; i++) {
            if (color[i] == -1 && e[i].size() > 0) {
                try {
                    dfs(i, c++, 0);
                } catch (Exception e) {
                    out.println("No");
                    return;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (a[i].y == -1)
                continue;
            c = color[a[i].y];
            int baseline = a[i].a - value[a[i].y];
            if (baseline + min[c] < 0) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
