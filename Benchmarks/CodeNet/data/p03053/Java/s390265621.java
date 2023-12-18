import java.util.*;

public class Main {
    static int h;
    static int w;
    static int dp[][];
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        sc.nextLine();
        dp = new int[h][w];
        ArrayDeque<Point> p = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            String tmp = sc.nextLine();
            for (int j = 0; j < w; j++) {
                char s = tmp.charAt(j);
                if(s == '#') {
                    dp[i][j] = 0;
                    p.add(new Point(i, j));
                }
                else {
                    dp[i][j] = -1;
                }
            }
        }
        while(!p.isEmpty()) {
            Point n = p.poll();
            if(n.x != 0) {
                if(dp[n.x-1][n.y] == -1) {
                    p.add(new Point(n.x-1, n.y));
                    dp[n.x-1][n.y] = dp[n.x][n.y] + 1;
                }
            }
            if(n.x < h-1) {
                if(dp[n.x+1][n.y] == -1) {
                    p.add(new Point(n.x+1, n.y));
                    dp[n.x+1][n.y] = dp[n.x][n.y] + 1;
                }
            }
            if(n.y != 0) {
                if(dp[n.x][n.y-1] == -1) {
                    p.add(new Point(n.x, n.y-1));
                    dp[n.x][n.y-1] = dp[n.x][n.y] + 1;
                }
            }
            if(n.y < w-1) {
                if(dp[n.x][n.y+1] == -1) {
                    p.add(new Point(n.x, n.y+1));
                    dp[n.x][n.y+1] = dp[n.x][n.y] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans = Math.max(ans, dp[i][j]);
            }
        }
        System.out.println(ans);

    }
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

