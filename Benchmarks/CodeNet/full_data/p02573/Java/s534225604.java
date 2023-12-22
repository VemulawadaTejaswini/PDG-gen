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
        Map<Integer, HashSet<Integer>> graph = createGraph(n, edgeList);
        int max = 0;
        for (int key : graph.keySet()) {
            int friends = graph.get(key).size();
            max = Math.max(max, friends);
        }
        int result = max;

        // 出力
        System.out.println(result);
    }

    public static Map<Integer, HashSet<Integer>> createGraph(int nodeSize, List<Integer[]> edgeList) {
        Map<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= nodeSize; i++) {
            graph.put(i, new HashSet<>());
        }
        for (Integer[] edge : edgeList) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[0]).addAll(graph.get(edge[1]));
            graph.get(edge[1]).add(edge[0]);
            graph.get(edge[1]).addAll(graph.get(edge[0]));
        }
        return graph;
    }
}
