import java.io.*;
import java.util.*;

public class Main {
    private static void solve() throws Exception {
        int n = fs.nextInt();
        int m = fs.nextInt();
        int sx = fs.nextInt()-1;
        int sy = fs.nextInt()-1;
        int dx = fs.nextInt()-1;
        int dy = fs.nextInt()-1;
        char[][] G = new char[n][m];
        int[][] D = new int[n][m];
        for (int i = 0; i < n; i ++) {
            G[i] = fs.next().toCharArray();
            Arrays.fill(D[i], -1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(sx, sy, 0));

        int[] deltaX = new int[]{1, -1, 0, 0};
        int[] deltaY = new int[]{0, 0, 1, -1};

        while (!pq.isEmpty()) {
            Node top = pq.poll();
            if (D[top.x][top.y] != -1) continue;

            D[top.x][top.y] = top.d;
            if (top.x == dx && top.y == dy) {
                out.println(top.d);
                return;
            }

            for (int i = 0 ; i < 4 ; i ++ ) {
                int x = top.x + deltaX[i];
                int y = top.y + deltaY[i];
                if (isUnvisitedRoad(G, n, m,x ,y,D)) {
                    pq.add(new Node(x, y, top.d));
                }
            }

            for (int i = -2; i < 3; i ++ ) {
                for (int j = -2; j < 3; j ++) {
                    int x = top.x + i;
                    int y = top.y + j;
                    if (isUnvisitedRoad(G, n, m,x ,y,D)) {
                        pq.add(new Node(x, y, top.d+1));
                    }
                }
            }
        }
        out.println(-1);
    }

    private static boolean isUnvisitedRoad(char[][] G, int n, int m, int x, int y, int[][] D) {
        if (0 <= x && x < n) {
            if (0 <= y && y < m) {
                return G[x][y] == '.' && D[x][y] == -1;
            }
        }
        return false;
    }

    static class Node implements  Comparable<Node> {
        int x, y, d;
        Node(int a, int b, int c) {
            x = a; y = b; d = c;
        }

        @Override
        public int compareTo(Node other) {
            if (this.d == other.d) {
                if (this.x == other.x) {
                    return Integer.compare(this.y, other.y);
                }
                return Integer.compare(this.x, other.x);
            }
            return Integer.compare(this.d, other.d);
        }

        @Override
        public String toString() {
            return "<" + x  + ", " + y + "> : " + d;
        }
    }

    private static FastScanner fs = new FastScanner();
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int T = 1;
        for (int t = 0; t < T; t++) {
            solve();
        }
        out.close();
    }

    static void debug(Object... O) {
        System.err.print("DEBUG ");
        System.err.println(Arrays.deepToString(O));
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextString() {
            return next();
        }
    }
}
