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
        int sx = 0;
        int sy = 0;
        for (int i = 0 ; i < h ; i++) {
            maze[i] = sc.next().toCharArray();
        }
        for (int[] dis : distance) {
            Arrays.fill(dis, inf);
        }
        int max = 0;
        for (int i = 0 ; i < h ; i++) {
            for (int j = 0 ; j < w ; j++) {
                Queue<Pair> que = new ArrayDeque<>();
                if (maze[i][j] == '.') {
                    sx = i;
                    sy = j;
                    que.add(new Pair(sx, sy));
                    distance[sx][sy] = 0;
                    //検索の本体。キューの中身を一つ取り、その周り4マスの距離を確定させ、キューに詰める。
                    while (!que.isEmpty()) {
                        Pair p = que.poll();
                        for (int k = 0 ; k < 4 ; k++) {
                            int nx = p.x + dx[k];
                            int ny = p.y + dy[k];
                            if (inRange(nx, ny) && maze[nx][ny] != '#' && distance[nx][ny] == inf) {
                                que.add(new Pair(nx, ny));
                                distance[nx][ny] = distance[p.x][p.y] + 1;
                            }
                        }
                    }
                }

                for (int l = 0 ; l < h ; l++) {
                    for (int k = 0 ; k < w ; k++) {
                        if (distance[l][k] != inf) {
                            max = Math.max(max, distance[l][k]);
                        }
                    }
                }
                for (int[] dis : distance) {
                    Arrays.fill(dis, inf);
                }

            }
        }

        System.out.println(max);

    }

    static boolean inRange(int x, int y) {
        return x >= 0 && x < h && y >= 0 && y < w;
    }



}
