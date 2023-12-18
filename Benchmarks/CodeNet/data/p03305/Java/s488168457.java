import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static class Dijkstra {
        long[][] edge;
        PriorityQueue<Pair> que;
        long[] d;

        public Dijkstra(int n) {
            this.edge = new long[n][n];
            this.d = new long[n];
            this.que = new PriorityQueue<>();

            for (long[] e : this.edge) {
                Arrays.fill(e, Long.MAX_VALUE / 4);
            }
            Arrays.fill(this.d, Long.MAX_VALUE / 4);
        }

        public void set(int i, int j, long cost) {
            this.edge[i][j] = cost;
            this.edge[j][i] = cost;
        }

        public void calc(int s) {
            this.d[s] = 0;
            this.que.add(new Pair(0, s));

            while (this.que.size() > 0) {
                Pair t = this.que.poll();
                if (this.d[t.now] < t.value) {
                    continue;
                }
                for (int i = 0; i < this.edge[t.now].length; i++) {
                    if (this.d[i] > this.d[t.now] + this.edge[t.now][i]) {
                        this.d[i] = this.d[t.now] + this.edge[t.now][i];
                        this.que.add(new Pair(this.d[i], i));
                    }
                }
            }
        }

        public long distance(int g) {
            return this.d[g];
        }
    }

    public static class Pair implements Comparable<Pair> {
        long value;
        int now;

        public Pair(long first, int second) {
            this.value = first;
            this.now = second;
        }

        @Override
        public int compareTo(Pair o) {

            return Long.compare(this.value, o.value);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int s = scanner.nextInt() - 1;
        int t = scanner.nextInt() - 1;
        Dijkstra sDijkstra = new Dijkstra(N);
        Dijkstra tDijkstra = new Dijkstra(N);
        for (int i = 0; i < M; i++) {
            int v = scanner.nextInt() - 1;
            int u = scanner.nextInt() - 1;
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            sDijkstra.set(v, u, a);
            tDijkstra.set(v, u, b);
        }
        sDijkstra.calc(s);
        tDijkstra.calc(t);
        for (int i = 0; i < N; i++) {
            long ans = 0;
            for (int j = i; j < N; j++) {
                ans = Math.max(ans, (long) Math.pow(10, 15) - sDijkstra.distance(j) - tDijkstra.distance(j));
            }
            System.out.println(ans);
        }
    }
}
