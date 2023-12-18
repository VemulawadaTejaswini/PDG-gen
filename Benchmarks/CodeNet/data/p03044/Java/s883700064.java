import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static class Dijkstra {
        long[][] edge;
        boolean[] used;
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

            while (!this.que.isEmpty()) {
                Pair t = this.que.poll();
                if (this.d[t.second] < t.first) {
                    continue;
                }
                for (int i = 0; i < this.edge[t.second].length; i++) {
                    if (this.d[i] > this.d[t.second] + this.edge[t.second][i]) {
                        this.d[i] = this.d[t.second] + this.edge[t.second][i];
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
        long first;
        int second;

        public Pair(long first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {

            return (int) (this.first - o.first);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Dijkstra dijkstra = new Dijkstra(N);
        for (int i = 0; i < N - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            long w = scanner.nextLong();
            dijkstra.set(u, v, w);
        }
    }
}
