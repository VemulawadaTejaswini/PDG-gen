import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] S = new String[H];
        for (int i = 0; i < H; i++) {
            S[i] = sc.next();
        }

        final Solver solver = new Solver();
        solver.solve(H, W, S);
    }
}

class Solver {
    private static final int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {-1, 0}};

    public void solve(int H, int W, String[] S) {
        long max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i].charAt(j) == '#') continue;

                final long r = bfs(H, W, S, i, j);
                max = Math.max(max, r);
            }
        }
        System.out.println(max);
    }

    private long bfs(int H, int W, String[] S, int i, int j) {
        final Position start = new Position(i, j);

        final PriorityQueue<Visit> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.d));
        final Set<Position> visited = new HashSet<>();
        q.add(new Visit(start, 0));
        visited.add(start);

        int max = 0;
        while (!q.isEmpty()) {
            final Visit v = q.poll();
            max = Math.max(v.d, max);

            for (int d = 0; d < 4; d++) {
                final int[] dir = dirs[d];
                final int nextI = v.p.x + dir[0];
                final int nextJ = v.p.y + dir[1];

                final Position next = new Position(nextI, nextJ);
                if (nextI >= 0 && nextI < H && nextJ >= 0 && nextJ < W &&
                        S[nextI].charAt(nextJ) != '#' &&
                        !visited.contains(next)) {

                    q.add(new Visit(next, v.d + 1));
                    visited.add(next);
                }
            }
        }

        return max;
    }

    private static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Position)) {
                return false;
            }
            final Position other = (Position) obj;
            return Objects.equals(this.x, other.x) &&
                    Objects.equals(this.y, other.y);
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }

    private static class Visit {
        Position p;
        int d;

        Visit(Position p, int d) {
            this.p = p;
            this.d = d;
        }

        @Override
        public int hashCode() {
            return Objects.hash(p, d);
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Visit)) {
                return false;
            }
            final Visit other = (Visit) obj;
            return Objects.equals(this.p, other.p) &&
                    Objects.equals(this.d, other.d);
        }

        @Override
        public String toString() {
            return String.format("(%s, %d)", p, d);
        }
    }
}


