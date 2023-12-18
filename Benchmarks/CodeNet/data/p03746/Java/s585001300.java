import java.util.*;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < M; i ++) {
            int from = sc.nextInt();
            int end = sc.nextInt();
            adderNode(graph, from, end);
            adderNode(graph, end, from);
        }
        int begin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int k : graph.keySet()) {
            int tmp = graph.get(k).size();
            if (tmp < min) {
                min = tmp;
                begin = k;
            }
        }
        List<Integer> l = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set.add(begin);
        DFS(graph, begin, l, set);
        System.out.println(l.size());
        System.out.print(begin);
        for (int k : l) {
            System.out.print("\t" + k);
        }
    }

    private static boolean DFS(Map<Integer, Set<Integer>> graph, int begin, List<Integer> res, Set<Integer> set) {
        for (Integer child : graph.get(begin)) {
            if (set.contains(child)) {
                continue;
            }
            res.add(child);
            set.add(child);
            if ( DFS(graph, child, res, set)) {
                return true;
            }
            set.remove(child);
            res.remove(res.size() - 1);
        }
        return true;
    }

    private static void adderNode(Map<Integer, Set<Integer>> graph, int from, int end) {
        if (graph.containsKey(from)) {
            graph.get(from).add(end);
        }else {
            Set<Integer> set = new HashSet<>();
            set.add(end);
            graph.put(from, set);
        }
    }
}
