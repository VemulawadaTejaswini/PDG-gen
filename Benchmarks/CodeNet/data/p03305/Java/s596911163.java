import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        long init = (long)1e15;

        int n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt() - 1, t = sc.nextInt() - 1;
        E[] g = new E[n];
        for (int i = 0; i < n; i++) {
            g[i] = new E();
        }
        
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
            long a = sc.nextLong(), b = sc.nextLong();
            g[u].add(new V(v, a, b));
            g[v].add(new V(u, a, b));
        }
        
        long[] yen = dijkstra(n, s, g, v -> v.a);
        long[] snk = dijkstra(n, t, g, v -> v.b);
        long[] ans = new long[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = Math.max(ans[i + 1], init - yen[i] - snk[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

    public long[] dijkstra(int n, int s, E[] g, Function<V, Long> f) {
        PriorityQueue<P> pq = new PriorityQueue<>();
        long[] visit = new long[n];
        Arrays.fill(visit, 1L << 50);
        visit[s] = 0;
        pq.add(new P(s, 0));

        while (!pq.isEmpty()) {
            P cur = pq.remove();
            if (cur.c != visit[cur.p]) continue;

            for (V next: g[cur.p]) if (visit[next.to] > cur.c + f.apply(next)) {
                visit[next.to] = cur.c + f.apply(next);
                pq.add(new P(next.to, cur.c + f.apply(next)));
            }
        }
        return visit;
    }

    private static class E extends ArrayList<V> {}

    private static class V {
        int to;
        long a, b;
        public V(int to, long a, long b) {
            this.to = to;
            this.a = a;
            this.b = b;
        }
    }

    private static class P implements Comparable<P> {
        int p;
        long c;
        public P(int p, long c) {
            this.p = p;
            this.c = c;
        }

        @Override
        public int compareTo(P o) {
            return o.c > c ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
