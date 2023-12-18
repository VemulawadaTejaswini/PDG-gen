

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> father = new HashMap<>();
        Set<Integer> roots = new HashSet<>();
        for (int i = 1; i <= n; ++i) {
            roots.add(i);
        }
        for (int i = 0; i < n + m - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            Set<Integer> descendants = graph.getOrDefault(u, new HashSet<>());
            descendants.add(v);
            graph.put(u, descendants);
            roots.remove(v);
        }
        int root = -1;
        for (final int r : roots) {
            root = r;
        }
        Queue<Integer> travel = new LinkedBlockingDeque<>();
        travel.add(root);
        while (!travel.isEmpty()) {
            int current = travel.poll();
            if (!graph.containsKey(current)) {
                continue;
            }
            for (int son : graph.get(current)) {
                travel.add(son);
                father.put(son, current);
            }
        }
        father.put(root, 0);
        for (int i = 1; i <= n; ++i) {
            System.out.println(father.get(i));
        }

    }
}
