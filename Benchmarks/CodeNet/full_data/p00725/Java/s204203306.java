import java.util.*;
import java.lang.*;

/**
 * Curling2
 */

class MyMap {
    int map[][];

    MyMap(int[][] lastmap, int h, int w) {
        map = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                map[i][j] = lastmap[i][j];
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            boolean flg = false;

            int y[] = { 0, 0, 1, -1 };
            int x[] = { 1, -1, 0, 0 };

            int array[][] = new int[h][w];
            int map[][] = new int[h][w];

            Queue<Integer> queue = new ArrayDeque<Integer>(); // 縦、横の順で入れる
            Queue<MyMap> mapQueue = new ArrayDeque<MyMap>();
            int ans = 1;

            if (w == 0 && h == 0)
                break;

            // 入力
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    array[i][j] = sc.nextInt();
                    if (array[i][j] != 0) {
                        if (array[i][j] == 2) { // スタート地点
                            // map[i][j] = 1;
                            queue.add(i);
                            queue.add(j);
                        } else {
                            map[i][j] = array[i][j];
                        }
                    }
                }
            }

            MyMap firstmap = new MyMap(map, h, w);
            mapQueue.add(firstmap);

            loop: while (!queue.isEmpty()) {
                int queueSize = queue.size() / 2;
                int height[] = new int[queueSize];
                int width[] = new int[queueSize];
                MyMap maps[] = new MyMap[queueSize];

                // キュー取り出し
                for (int i = 0; i < queueSize; i++) {
                    height[i] = queue.poll();
                    width[i] = queue.poll();
                    maps[i] = new MyMap(mapQueue.poll().map, h, w);

                    // System.out.println("w=" + (width[i] + 1) + " h=" + (height[i] + 1) + "ans=" +
                    // ans);
                }

                // 四方向見ていく
                for (int i = 0; i < queueSize; i++) {
                    for (int j = 0; j < 4; j++) {
                        int k = 1;
                        MyMap newmap = new MyMap(maps[i].map, h, w);

                        loop2: while (true) {
                            try {
                                switch (newmap.map[height[i] + k * y[j]][width[i] + k * x[j]]) {
                                case 3: // ゴール
                                    flg = true;
                                    break loop;
                                case 1: // 障害物
                                    if (k == 1)
                                        break loop2;

                                    newmap.map[height[i] + k * y[j]][width[i] + k * x[j]] = 0;
                                    newmap.map[height[i] + (k - 1) * y[j]][width[i] + (k - 1) * x[j]] = 9;
                                    queue.add(height[i] + (k - 1) * y[j]);
                                    queue.add(width[i] + (k - 1) * x[j]);
                                    mapQueue.add(newmap);
                                    // Printmap(h, w, newmap.map);

                                    break loop2;
                                }
                            } catch (Exception e) {
                                break loop2;
                            }
                            k++;
                        }
                    }
                }

                ans++;

                if (ans > 10)
                    break;
            }

            if (flg)
                System.out.println(ans);
            else
                System.out.println(-1);

        }
    }

    private static void Printmap(int h, int w, int map[][]) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

    }
}
