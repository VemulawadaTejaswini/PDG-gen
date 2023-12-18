import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.solve();
    }
    private void solve() throws Exception {
        FastScan scan = new FastScan(System.in);
        int N = scan.scanInt();
        List<List<Path>> graph = new ArrayList(N);
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scan.scanInt()-1;
            int b = scan.scanInt()-1;
            int c = scan.scanInt();
            graph.get(a).add(new Path(b, c));
            graph.get(b).add(new Path(a, c));
        }
        int Q = scan.scanInt();
        int K = scan.scanInt()-1;
        Queue<Integer> queue = new ArrayDeque<>();
        long[] distances = new long[N];
        boolean[] visited = new boolean[N];
        queue.add(K);
        while(!queue.isEmpty()) {
            int current = queue.poll();
            visited[current] = true;
            for (Path p : graph.get(current)) {
                if (visited[p.to]) {
                    continue;
                }
                distances[p.to] = distances[current] + p.cost;
                queue.add(p.to);
            }
        }
        for (int i = 0; i < Q; i++) {
            int from = scan.scanInt() - 1;
            int to = scan.scanInt() - 1;
            System.out.println(distances[from] + distances[to]);
        }
    }

    class Path {
        int to;
        int cost;
        Path(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        long scanLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int scanInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double scanDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char scanCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
