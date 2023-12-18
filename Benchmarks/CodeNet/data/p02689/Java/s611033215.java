import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
        Peaks solver = new Peaks();
        solver.solve(1, in, out);
        out.close();
    }

    static class Peaks {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] h = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                h[i] = in.nextInt();
            }

            int[][] loads = new int[n + 1][n + 1];

            List<List<Pair>> list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 1; i <= m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();

                (list.get(a)).add(new Pair(h[b], b));
                (list.get(b)).add(new Pair(h[a], a));
            }

            boolean[] result = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                List<Pair> directions = list.get(i);
                if (directions.isEmpty()) {
                    result[i] = true;
                    continue;
                }
                directions.sort(Comparator.reverseOrder());
                Pair top = directions.get(0);
                if (h[top.dist] > h[i]) {
                    result[top.dist] = true;
                } else if (h[top.dist] < h[i]) {
                    result[i] = true;
                }

            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (result[i]) {
                    count++;
                }
            }
            out.append(String.valueOf(count));
        }

        public class Pair implements Comparable<Peaks.Pair> {
            public final Integer cost;
            public final Integer dist;

            public Pair(Integer cost, Integer dist) {
                this.cost = cost;
                this.dist = dist;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return cost.equals(pair.cost) &&
                        dist.equals(pair.dist);
            }

            public int hashCode() {
                return Objects.hash(cost, dist);
            }

            public int compareTo(Pair o) {
                return Integer.compare(cost, o.cost);
            }

        }

    }
}

