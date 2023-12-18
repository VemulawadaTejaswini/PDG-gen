import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.util.*;

public class Main {
    private static final int MOD = (int) Math.pow(10, 9);
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] map = new char[m][n];

        for (int i = 0; i < m; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != '.') {
                    continue;
                }

                Queue<Point> queue = new LinkedList<>();
                boolean[][] visited = new boolean[m][n];
                int step = 0;

                queue.offer(new Point(i, j));
                visited[i][j] = true;

                while (!queue.isEmpty()) {
                    int size = queue.size();

                    for (int k = 0; k < size; k++) {
                        Point p = queue.poll();
                        int x = p.x;
                        int y = p.y;
                        visited[x][y] = true;
                        res = Math.max(res, step);

                        for (int[] DIR: DIRS) {
                            int dx = x + DIR[0];
                            int dy = y + DIR[1];

                            if (dx >= 0 && dx < m && dy >= 0 && dy < n && !visited[dx][dy] && map[dx][dy] == '.') {
                                queue.offer(new Point(dx, dy));
                            }
                        }
                    }
                    step++;
                }
            }
        }

        System.out.println(res);

        System.exit(0);
    }
    static private class Point {
        public int x;
        public int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static private long gcd(long m, long n) {
        if (m < n) { return gcd(n, m); }
        if (m % n == 0) { return n; }
        return gcd(n, m%n);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
