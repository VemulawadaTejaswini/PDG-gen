import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] u = new int[n - 1];
        int[] v = new int[n - 1];
        int[] w = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            u[i] = Integer.parseInt(sc.next());
            v[i] = Integer.parseInt(sc.next());
            w[i] = Integer.parseInt(sc.next());
        }
        int q = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        // 無向グラフを作成
        List<HashMap<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new HashMap<>());
        }
        for (int i = 0; i < n - 1; i++) {
            list.get(u[i] - 1).put(v[i] - 1, w[i]);
            list.get(v[i] - 1).put(u[i] - 1, w[i]);
        }

        long[] dist = new long[q];
        for (int i = 0; i < q; i++) {
            int start = x[i] - 1;
            int goal = y[i] - 1;
            dist[i] = getDistance(n, start, k - 1, list) + getDistance(n, k - 1, goal, list);
        }

        // 出力
        for (long result : dist) {
            System.out.println(result);
        }
    }

    public static long getDistance(int n, int start, int goal, List<HashMap<Integer, Integer>> list) {
        // 探索の開始地点を設定
        Deque<Integer> todo = new ArrayDeque<>();
        todo.add(start);

        // 探索距離
        long[] distance = new long[n];
        distance[start]++;

        // 探索を開始
        long dist = 0;
        while (!todo.isEmpty()) {
            int point = todo.poll();
            for (int nextPoint : list.get(point).keySet()) {
                if (distance[nextPoint] == 0) {
                    todo.add(nextPoint);
                    distance[nextPoint] = distance[point] + list.get(point).get(nextPoint);
                    if (nextPoint == goal) {
                        dist = distance[nextPoint] - 1;
                    }
                }
            }
        }
        return dist;
    }
}
