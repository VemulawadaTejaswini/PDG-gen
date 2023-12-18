import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static long inf = 0x7ffffffffffffffL;

    public static void main(String[]$) throws Exception {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Grid>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
            if (i > 0) {
                edges.get(i).add(new Grid(i - 1, 0));
            }
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            long c = scanner.nextLong();
            edges.get(l).add(new Grid(r, c));
        }
        long ans = dijkstra(edges, 0)[n - 1];
        System.out.println(ans >= inf ? -1 : ans);
    }

    static long[] dijkstra(List<List<Grid>> edges, int start) {
        long[] cost = new long[edges.size()];
        Arrays.fill(cost, inf);
        cost[start] = 0;

        Queue<Grid> queue = new PriorityQueue<>();
        queue.add(new Grid(start, 0));

        while (!queue.isEmpty()) {
            Grid grid = queue.poll();
            if (cost[grid.to] >= grid.cost) {
                for (Grid g : edges.get(grid.to)) {
                    if (cost[g.to] > cost[grid.to] + g.cost) {
                        cost[g.to] = cost[grid.to] + g.cost;
                        queue.add(new Grid(g.to, cost[g.to]));
                    }
                }
            }
        }
        return cost;
    }

    static class Grid implements Comparable<Grid> {
        int to;
        long cost;

        Grid(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Grid o) {
            return Long.compare(this.cost, o.cost);
        }

        @Override
        public String toString() {
            return String.format("[%s, %s]", to, cost);
        }
    }

    static class System {
        static PrintWriter out = new PrintWriter(java.lang.System.out);

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(System.out::flush));
        }

        static void exit() {
            java.lang.System.exit(0);
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        char[][] nextCharArray(int n, int m) {
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }
        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        int[] nextIntArray(int n, IntUnaryOperator op) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsInt(nextInt());
            }
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        long[] nextLongArray(int n, LongUnaryOperator op) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsLong(nextLong());
            }
            return a;
        }
    }
}
