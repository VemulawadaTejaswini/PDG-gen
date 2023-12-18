import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int inf = 10000000;
    static Scanner sc = new Scanner(System.in);
    static final int h = sc.nextInt();
    static final int w = sc.nextInt();
    static char[][] maze = new char[h][w];
    static int[][] distance = new int[h][w];
    static final int[] dx = {1, 0, -1, 0};
    static final int[] dy = {0, 1, 0, -1};
    static class Pair {
        public int x;
        public int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        for (int i = 0 ; i < h ; i++) {
            maze[i] = sc.next().toCharArray();
        }
        for (int[] dis : distance) Arrays.fill(dis, inf);

        Queue<Pair> que = new ArrayDeque<>();

        que.add(new Pair(0, 0));
        distance[0][0] = 0;

        while (!que.isEmpty()) {
            Pair p = que.poll();

            if (p.x == h - 1 && p.y == w - 1) break;
            for (int i = 0 ; i < 4 ; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (inRange(nx, ny) && maze[nx][ny] != '#' && distance[nx][ny] == inf) {
                    que.add(new Pair(nx, ny));
                    distance[nx][ny] = distance[p.x][p.y] + 1;
                }
            }
        }

        int wCount = 0;
        for (int i = 0 ; i < h ; i++) {
            for (int j = 0 ; j < w ; j++) {
                if (maze[i][j] == '.') wCount++;
            }
        }

        if (distance[h - 1][w- 1] == inf) {
            System.out.println(-1);
        } else {
            System.out.println(wCount - distance[h - 1][w- 1] - 1);
        }
    }
    static boolean inRange(int x, int y) {
        return x >= 0 && x < h && y >= 0 && y < w;
    }
}