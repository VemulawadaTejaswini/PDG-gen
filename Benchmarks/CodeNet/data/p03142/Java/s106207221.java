

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> fathers = new HashMap<>();
        Map<Integer, Set<Integer>> sons = new HashMap<>();
        Set<Integer> roots = new HashSet<>();
        int [] fatherCounts = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            roots.add(i);
        }
        for (int i = 0; i < n + m - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            Set<Integer> descendants = sons.getOrDefault(u, new HashSet<>());
            descendants.add(v);
            sons.put(u, descendants);
            roots.remove(v);
            ++fatherCounts[v];
            Set<Integer> parents = fathers.getOrDefault(v, new HashSet<>());
            parents.add(u);
            fathers.put(v, parents);
        }
        int root = -1;
        for (final int r : roots) {
            root = r;
        }
        int [] reorder = new int[n];
        int numNode = 0;
        reorder[numNode++] = root;
        Map<Integer, Integer> nodeReorder = new HashMap<>();
        nodeReorder.put(root, 0);
        for (int i = 0; i < numNode; ++i) {
            for (int son : sons.getOrDefault(reorder[i], new HashSet<>())) {
                if (--fatherCounts[son] == 0) {
                    reorder[numNode] = son;
                    nodeReorder.put(son, numNode);
                    ++numNode;
                }
            }
        }

        for (int i = 1; i <= n; ++i) {
            if (!fathers.containsKey(i)) {
                System.out.println(0);
                continue;
            }
            int fatherWithMaxReorder = -1;
            for (int father : fathers.get(i)) {
                if (fatherWithMaxReorder == -1 || nodeReorder.get(father) > nodeReorder.get(fatherWithMaxReorder)) {
                    fatherWithMaxReorder = father;
                }
            }

            System.out.println(fatherWithMaxReorder);
        }

    }
}
