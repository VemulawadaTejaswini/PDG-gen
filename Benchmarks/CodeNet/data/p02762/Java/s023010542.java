import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        long K;
        K = sc.nextLong();

        Set<Point> friends = new HashSet<>();
        for(int i = 0 ; i < M ; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int smaller = Math.min(a, b);
            int larger = Math.max(a, b);
            Point p = new Point(smaller, larger);
            friends.add(p);
        }
        Set<Point> blocks = new HashSet<>();
        for(int i = 0 ; i < K ; i++){
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;
            int smaller = Math.min(c, d);
            int larger = Math.max(c, d);
            Point p = new Point(smaller, larger);
            blocks.add(p);
        }

        final Solver solver = new Solver();
        solver.solve(N, M, K, friends, blocks);
    }
}

class Point {
    final int x;
    final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        final Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }
}

class Solver {
    public void solve(long N, long M, long K, Set<Point> friends, Set<Point> blocks) {
        long INF = (long) 10e5;

        long d[][] = new long[(int) N][(int) N];
        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < N; j++) {
        //         int smaller = Math.min(i, j);
        //         int larger = Math.max(i, j);
        //         Point p = new Point(smaller, larger);
        //         if (friends.contains(p)) {
        //             d[i][j] = 1;
        //             continue;
        //         }
        //         d[i][j] = INF;
        //     }
        // }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        // List<Long> candidates = new ArrayList<>();
        // for (int i = 0; i < N; i++) {
        //     long candidate = 0;
        //     for (int j = 0; j < N; j++) {
        //         if (i == j) {
        //             continue;
        //         }

        //         int smaller = Math.min(i, j);
        //         int larger = Math.max(i, j);
        //         Point p = new Point(smaller, larger);
        //         if (blocks.contains(p) || friends.contains(p)) {
        //             continue;
        //         }

        //         if (d[i][j] < INF) {
        //             candidate++;
        //         }
        //     }
        //     candidates.add(candidate);
        // }
        System.out.println("");
        // System.out.println(candidates.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

