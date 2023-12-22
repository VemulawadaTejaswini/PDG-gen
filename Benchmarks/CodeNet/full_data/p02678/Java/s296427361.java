import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<Integer[]> edgeList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            edgeList.add(new Integer[] { a, b });
        }
        sc.close();

        // 主処理
        // グラフ
        Map<Integer, HashSet<Integer>> graph = createGraph(n, edgeList);

        // 探索
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);

        int[] distance = new int[n + 1];
        distance[1]++;

        while (!deque.isEmpty()) {
            int point = deque.poll();
            for (int nextPoint : graph.get(point)) {
                if (distance[nextPoint] == 0) {
                    deque.add(nextPoint);
                    distance[nextPoint] = point;
                }
            }
        }

        List<String> list = new ArrayList<>();
        boolean judge = true;

        for (int i = 2; i <= n; i++) {
            int dist = distance[i];
            if (dist == 0) {
                judge = false;
                break;
            } else {
                String s = Integer.toString(distance[i]);
                list.add(s);
            }
        }

        String result;
        if (judge) {
            result = "Yes\n" + String.join("\n", list);
        } else {
            result = "No";
        }

        // 出力
        System.out.println(result);
    }

    // グラフを作成
    public static Map<Integer, HashSet<Integer>> createGraph(int nodeSize, List<Integer[]> edgeList) {
        Map<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= nodeSize; i++) {
            graph.put(i, new HashSet<>());
        }
        for (Integer[] edge : edgeList) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

}
