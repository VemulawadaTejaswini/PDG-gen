import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] s = new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }

        // 全ての座標をスタートとしてゴールまでにかかる移動回数の最大を求める
        int result = 0;
        for (int k = 0; k < h; k++) {
            for (int l = 0; l < w; l++) {
                int maxDistance = getDistance(s, k, l);
                result = Math.max(result, maxDistance);
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }

    private static int getDistance(char[][] map, int startY, int startX) {

        // スタート座標が壁の場合0を返す
        if (map[startY][startX] == '#') {
            return 0;
        }

        // 探索対象を設定
        Deque<int[]> todo = new ArrayDeque<>();
        todo.add(new int[] { startY, startX }); // スタート座標を設定

        // 探索済みの座標を移動回数として保持する
        // スタート座標の初期値を1とし、0を未探索の座標と判定する
        int h = map.length;
        int w = map[0].length;
        int[][] distance = new int[h][w];
        distance[startY][startX] = 1; // スタート座標を設定

        // 探索対象の相対座標を設定（上下左右）
        // 探索をforループで実施するために必要となる
        int[] x = new int[] { 0, 0, -1, 1 };
        int[] y = new int[] { -1, 1, 0, 0 };

        // 探索を開始
        int maxDistance = 0; // スタートからゴールまでの移動回数が格納される
        while (!todo.isEmpty()) {

            // 探索元の位置を設定
            int[] point = todo.poll();
            int pointY = point[0];
            int pointX = point[1];

            // 上下左右を探索する
            for (int i = 0; i < 4; i++) {

                // 探索対象の位置
                int nextPointY = pointY + y[i];
                int nextPointX = pointX + x[i];

                // 場外判定
                boolean isOutside = nextPointX < 0 || w <= nextPointX || nextPointY < 0 || h <= nextPointY;
                if (isOutside) {
                    continue;
                }

                // 探索要否を判定
                boolean wasVisit = 0 < distance[nextPointY][nextPointX]; // 探索済み判定
                boolean isWall = map[nextPointY][nextPointX] == '#'; // 壁判定
                if (wasVisit || isWall) {
                    continue;
                }

                // 探索対象に追加
                todo.add(new int[] { nextPointY, nextPointX });
                distance[nextPointY][nextPointX] = distance[pointY][pointX] + 1;
                maxDistance = distance[nextPointY][nextPointX] - 1; // 初期値の1を引く
            }
        }
        return maxDistance;
    }
}
