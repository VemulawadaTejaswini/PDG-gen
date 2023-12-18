import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] g;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] verts;
    static char[][] grid;
    static int count = 0;
    static boolean[] visited = new boolean[500];
    static int[] dist = new int[500];

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        int H = in.nextInt();
        int W = in.nextInt();
        g = graph(500);
        verts = new int[H][W];
        grid = new char[H][];
        for (int i = 0; i < H; i++) {
            grid[i] = in.next().toCharArray();
        }
        int s = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                verts[i][j] = s++;
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (grid[i][j] == '.') {
                    addEgde(i, j);
                }
            }
        }
        int sol = 0;
        for (int i = 0; i < H * W; i++) {
            bfs(i);
            sol = Math.max(sol, Arrays.stream(dist).max().getAsInt());
            Arrays.fill(dist, 0);
            Arrays.fill(visited, false);
        }
        out.println(sol);
    }

    static void bfs(int start) {
        visited[start] = true;
        Queue<Integer> Q = new ArrayDeque<>();
        Q.add(start);
        while (!Q.isEmpty()) {
            int v = Q.poll();
            for (int a : g[v]) {
                if (!visited[a]) {
                    visited[a] = true;
                    dist[a] = dist[v] + 1;
                    Q.add(a);
                }
            }
        }
    }

    static void addEgde(int i, int j) {
        for (int x = 0; x < dx.length; x++) {
            int i1 = i + dx[x];
            if (i1 < 0 || i1 >= grid.length) {
                continue;
            }
            int j1 = j + dy[x];
            if (j1 < 0 || j1 >= grid[i].length) {
                continue;
            }
            if (grid[i1][j1] != '#') {
                g[verts[i][j]].add(verts[i1][j1]);
                g[verts[i1][j1]].add(verts[i][j]);
            }
        }
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static ArrayList<Integer>[] graph(int n) {
        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        return g;
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
