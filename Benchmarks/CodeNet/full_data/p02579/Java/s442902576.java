import java.util.*;

public class Main {

    private static final int INF = 1_000_000_000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int Ch = sc.nextInt()-1;
        int Cw = sc.nextInt()-1;
        int Dh = sc.nextInt()-1;
        int Dw = sc.nextInt()-1;
        int[][] cost = new int[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                char c = s.charAt(j);
                if (c == '#') {
                    cost[i][j] = -1;
                } else {
                    cost[i][j] = INF;
                }
            }
        }

        boolean[][] done = new boolean[H][W];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.offer(new Pair(Ch,Cw,0));
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            while (p != null && done[p.i][p.j]) {
                p = pq.poll();
            }
            if (p == null) {
                break;
            }
            done[p.i][p.j] = true;
            cost[p.i][p.j] = p.cost;

            for (int v = 0; v < 4; v++) {
                int nexti = p.i + dy[v];
                int nextj = p.j + dx[v];
                if (0 <= nexti && nexti < H
                    && 0 <= nextj && nextj < W
                    && !done[nexti][nextj]
                    && cost[nexti][nextj] != -1) {
                    pq.offer(new Pair(nexti,nextj,Math.min(p.cost,cost[nexti][nextj])));
                }
            }
            for (int v = 0; v < 16; v++) {
                int nexti = p.i + d2y[v];
                int nextj = p.j + d2x[v];
                if (0 <= nexti && nexti < H
                    && 0 <= nextj && nextj < W
                    && !done[nexti][nextj]
                    && cost[nexti][nextj] != -1) {
                    pq.offer(new Pair(nexti,nextj,Math.min(p.cost+1,cost[nexti][nextj])));
                }
            }
        }

        /*
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(cost[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        */

        System.out.println(cost[Dh][Dw] != INF ? cost[Dh][Dw] : -1);
    }

    private static int[] dx = new int[] { 0, 0, 1, -1 };
    private static int[] dy = new int[] { 1, -1, 0, 0 };
    private static int[] d2x = new int[] { -2, -2, -2, -2, -2, -1, 0, 1, 2, 2, 2,  2,  2,  1,  0, -1 };
    private static int[] d2y = new int[] { -2, -1,  0,  1,  2,  2, 2, 2, 2, 1, 0, -1, -2, -2, -2, -2 };

    private static class Pair {
        private final int i;
        private final int j;
        private final int cost;
        Pair(int i, int j, int cost) {
            this.i = i;
            this.j = j;
            this.cost = cost;
        }
    }
}
