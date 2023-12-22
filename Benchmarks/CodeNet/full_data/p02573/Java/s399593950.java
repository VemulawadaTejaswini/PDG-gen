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

        PriorityQueue<Integer> countQueue = new PriorityQueue<>(Collections.reverseOrder());
        boolean[] used = new boolean[n + 1];
        for (int i = 1; i < n; i++) {
            if (!used[i]) {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(i);

                int count = 0;
                while (!pq.isEmpty()) {
                    int num = pq.poll();
                    if (!used[num]) {
                        count++;
                        pq.addAll(graph.get(num));
                        used[num] = true;
                    }
                }
                countQueue.add(count);
                used[i] = true;
            }
        }
        int result = countQueue.peek();

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
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
}
