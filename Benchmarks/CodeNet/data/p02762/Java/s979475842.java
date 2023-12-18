import javafx.geometry.Pos;

import java.io.*;
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
            Point p = new Point(sc.nextInt() - 1, sc.nextInt() - 1);
            friends.add(p);
        }
        Set<Point> blocks = new HashSet<>();
        for(int i = 0 ; i < K ; i++){
            Point p = new Point(sc.nextInt() - 1, sc.nextInt() - 1);
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
        int INF = (int) 10e5;

        int d[][] = new int[(int) N][(int) N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Point p1 = new Point(i, j);
                Point p2 = new Point(j, i);
                if (friends.contains(p1) || friends.contains(p2)) {
                    d[i][j] = 1;
                    continue;
                }
                d[i][j] = INF;
            }
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        List<Integer> candidates = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int candidate = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }

                Point p1 = new Point(i, j);
                Point p2 = new Point(j, i);
                if (blocks.contains(p1) || blocks.contains(p2)) {
                    continue;
                }
                if (friends.contains(p1) || friends.contains(p2)) {
                    continue;
                }

                if (d[i][j] < INF) {
                    candidate++;
                }
            }
            candidates.add(candidate);
        }
        System.out.println(candidates.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

