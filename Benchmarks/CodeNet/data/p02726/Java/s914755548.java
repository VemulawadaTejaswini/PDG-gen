import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        // 主処理
        // 空のグラフを作成
        List<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new HashSet<>());
        }

        // 無向グラフを設定
        for (int i = 0; i < n - 1; i++) {
            list.get(i).add(i + 1);
            list.get(i + 1).add(i);
        }
        list.get(x - 1).add(y - 1);
        list.get(y - 1).add(x - 1);

        // 全てのスタート地点から全ての移動距離を求める
        int[][] distanceArray = new int[n][n];
        for (int i = 0; i < n; i++) {

            // 探索の開始地点を設定
            Deque<Integer> deque = new ArrayDeque<>();
            int start = i;
            deque.add(start);

            // 探索距離を保持
            int[] distance = new int[n];
            distance[start]++;

            // 探索を開始
            while (!deque.isEmpty()) {
                int point = deque.poll();

                for (int nextPoint : list.get(point)) {
                    if (distance[nextPoint] == 0) {
                        deque.add(nextPoint);
                        distance[nextPoint] = distance[point] + 1;
                        distanceArray[i][nextPoint] = distance[nextPoint] - 1;
                    }

                }
            }
        }

        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[distanceArray[i][j]]++;
            }
        }

        // 出力
        for (int i = 1; i < count.length; i++) {
            System.out.println(count[i] / 2);
        }
        sc.close();
    }
}
