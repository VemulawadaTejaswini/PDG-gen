import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    // 移動4方向のベクトル
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    private static int[][] moves;

    private static char[][] display;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = Integer.parseInt(scanner.next());
        int W = Integer.parseInt(scanner.next());

        char[][] area = new char[H][W];
        display = new char[H][W];
        for (int i = 0; i < H; i++) {
            area[i] = scanner.next().toCharArray();
            display[i] = area[i];
        }

        scanner.close();

        int startY = 0;
        int startX = 0;
        Point start = new Point(startX, startY);
        Point goal = new Point(W - 1, H - 1);

        int whiteCount = 0;
        // 移動数を保持する配列
        moves = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                moves[i][j] = -1;
                if (area[i][j] == '.') {
                    whiteCount++;
                }
            }
        }

        // スタート地点を入れとく
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        // スタート地点の距離を0とする
        moves[startY][startX] = 0;
        display[startY][startX] = '@';

        while (queue.size() > 0) {
            Point p = queue.remove();

            // 移動4方向のループ
            for (int i = 0; i < 4; i++) {
                // 移動後の座標
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                // 移動可能でかつ、訪れたことがない位置か
                if (0 <= nx && nx < W && 0 <= ny && ny < H &&
                        moves[ny][nx] == -1 && area[ny][nx] != '#') {

                    if (new Point(nx, ny).equals(goal)) {
                        int count = moves[p.y][p.x];
                        // 白マスの数 - 最短経路 でスコアを出す
                        System.out.println(whiteCount - (count + 1 + 1));
                        return;
                    }
                    // 移動できるのでキューに入れて、その移動を記録する
                    queue.add(new Point(nx, ny));
                    moves[ny][nx] = moves[p.y][p.x] + 1;
                    display[ny][nx] = '@';
                }
            }

//            printArea(display);
        }
        System.out.println(-1);
    }

    private static void printArea(char[][] area) {
        for (char[] a : display) {
            for (char b : a) {
                System.out.print(b);
            }
            System.out.println("");
        }
        System.out.println("-----------------");
    }
}
