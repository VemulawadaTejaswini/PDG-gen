import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static class Dijkstra {
        long[][] edge;
        boolean[] used;
        PriorityQueue<long[]> que;
        long[] d;

        public Dijkstra(int n) {
            this.edge = new long[n][n];
            this.que = new PriorityQueue<long[]>(n, new Comparator<long[]>() {
                @Override
                public int compare(long[] o1, long[] o2) {
                    if (o1[0] < o2[0]) {
                        return -1;
                    } else if (o1[0] > o2[0]) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });
            this.d = new long[n];
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
            this.que.add(new long[] { 0, s });

            while (!this.que.isEmpty()) {
                long[] t = this.que.poll();
                try {

                    if (this.d[(int) t[1]] < t[0]) {
                        continue;
                    }
                } catch (Exception e) {
                    while (true) {

                    }
                }
                for (int i = 0; i < this.edge[(int) t[1]].length; i++) {
                    if (this.d[i] > this.d[(int) t[1]] + this.edge[(int) t[1]][i]) {
                        this.d[i] = this.d[(int) t[1]] + this.edge[(int) t[1]][i];
                        this.que.add(new long[] { this.d[i], i });
                    }
                }
            }
        }

        public long distance(int g) {
            return this.d[g];
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
        dijkstra.calc(0);
        for (int i = 0; i < N; i++) {
            System.out.println(dijkstra.distance(i) % 2);
        }
    }
}
