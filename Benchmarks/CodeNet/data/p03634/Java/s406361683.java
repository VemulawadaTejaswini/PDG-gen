import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.solve();
    }
    private void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Path>[] graph = new List[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            long c = scan.nextLong();
            Path p1 = new Path(b, c);
            graph[a].add(p1);
            Path p2 = new Path(a, c);
            graph[b].add(p2);
        }
        int Q = scan.nextInt();
        int K = scan.nextInt()-1;
        Queue<Integer> queue = new LinkedList<>();
        long[] distances = new long[N];
        Arrays.fill(distances, Long.MAX_VALUE);
        distances[K] = 0;
        queue.add(K);
        while(!queue.isEmpty()) {
            int current = queue.poll();
            List<Path> neighbors = graph[current];
            for (Path p : neighbors) {
                if (distances[current] + p.cost < distances[p.to]) {
                    distances[p.to] = distances[current] + p.cost;
                    queue.add(p.to);
                }
            }
        }
        for (int i = 0; i < Q; i++) {
            int from = scan.nextInt() - 1;
            int to = scan.nextInt() - 1;
            System.out.println(distances[from] + distances[to]);
        }
    }

    class Path {
        int to;
        long cost;
        Path(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}
