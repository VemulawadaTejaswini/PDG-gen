import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] s = null;
    static int h = 0, w = 0, gy = 0, gx = 0;
    static ArrayList<Integer> ry = new ArrayList<>();
    static ArrayList<Integer> rx = new ArrayList<>();
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] dist = null;
    static boolean[][] visited = null;

    public static void main(String[] args) {
        h = sc.nextInt();
        w = sc.nextInt();
        s = new String[h];
        for(int y = 0; y < h; ++y) {
            s[y] = sc.next();
            for(int x = 0; x < w; ++x) {
                if(s[y].charAt(x) == '.') {
                    ry.add(y);
                    rx.add(x);
                }
            }
        }

        int ans = 0;
        for(int i = 0, f = ry.size(); i < f; ++i) {
            for(int j = 0; j < f; ++j) {
                if(i == j) continue;
                int sy = ry.get(i);
                int sx = rx.get(i);
                gy = ry.get(j);
                gx = rx.get(j);
                dist = new int[h][w];
                visited = new boolean[h][w];
                bfs(sy, sx);
                ans = Math.max(ans, dist[gy][gx]);
            }
        }
        System.out.println(ans);
    }

    static void bfs(int sy, int sx) {
        ArrayDeque<Integer> destY = new ArrayDeque<>();
        destY.add(sy);
        ArrayDeque<Integer> destX = new ArrayDeque<>();
        destX.add(sx);

        while(destY.size() > 0) {
            // System.out.println(destY.toString());
            // System.out.println(destX.toString());
            int fy = destY.remove();
            int fx = destX.remove();
            visited[fy][fx] = true;
            for(int i = 0; i < 4; ++i) {
                int ny = fy + dy[i];
                int nx = fx + dx[i];
                if(isOutOfMaze(ny, nx) || s[ny].charAt(nx) != '.' || visited[ny][nx]) continue;
                dist[ny][nx] = dist[fy][fx] + 1;
                destY.add(ny);
                destX.add(nx);
            }
        }
    }

    static boolean isOutOfMaze(int y, int x) {
        return y < 0 || h <= y || x < 0 || w <= x;
    }
}