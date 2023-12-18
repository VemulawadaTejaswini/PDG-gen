import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GoodGrid solver = new GoodGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class GoodGrid {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int c = in.nextInt();
            int[][] d = new int[c + 1][c + 1];
            for (int i = 1; i <= c; i++) {
                for (int j = 1; j <= c; j++) {
                    d[i][j] = in.nextInt();
                }
            }

            int[][] cc = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    cc[i][j] = in.nextInt();
                }
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>(n, (Comparator.comparingLong(o -> o.cost)));
            boolean[] list = new boolean[c + 1];
            for (int to = 1; to <= c; to++) {
                long t0 = 0;
                long t1 = 0;
                long t2 = 0;

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        int cfrom = cc[i][j];
                        if ((i + j) % 3 == 0) {
                            t0 += d[cfrom][to];
                        }
                        if ((i + j) % 3 == 1) {
                            t1 += d[cfrom][to];
                        }
                        if ((i + j) % 3 == 2) {
                            t2 += d[cfrom][to];
                        }
                    }
                }
                pq.add(new Pair(to, t0));
                pq.add(new Pair(to, t1));
                pq.add(new Pair(to, t2));
            }
            int count = 0;
            long result = 0;
            while (count < 3) {
                Pair e = pq.poll();
                if (!list[e.color] && 0 < e.cost) {
                    result += e.cost;
                    list[e.color] = true;
                    count++;
                }
            }

            out.println(result);
        }

        class Pair {
            int color;
            long cost;

            public Pair(int color, long cost) {
                this.color = color;
                this.cost = cost;
            }

        }

    }
}

