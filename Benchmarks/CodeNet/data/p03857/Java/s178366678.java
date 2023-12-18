

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class UnionFindTree {
        int nodeNum;
        int [] parent;
        int [] height;

        public UnionFindTree(int nodeNum) {
            this.nodeNum = nodeNum;
            parent = new int[nodeNum + 1];
            height = new int[nodeNum + 1];
            for (int i = 1; i <= nodeNum; ++i) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                return parent[x] = find(parent[x]);
            }
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            if (height[rootX] < height[rootY]) {
                parent[rootX] = rootY;
            } else {
                if (height[rootX] == height[rootY]) {
                    height[rootX]++;
                }
                parent[rootY] = rootX;
            }
        }

    }
    public static class Edge {
        public int a;
        public int b;

        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }

    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long l = scanner.nextLong();
        final Set<Edge> roads = new HashSet<>();
        final Set<Edge> railways = new HashSet<>();
        for (int i = 0; i < k; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Edge edge = new Edge(a, b);
            roads.add(edge);
        }

        for (int i = 0; i < l; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Edge edge = new Edge(a, b);
            railways.add(edge);
        }
        final UnionFindTree roadTree = new UnionFindTree(n);
        for (Edge road : roads) {
            int a = road.a;
            int b = road.b;
            roadTree.union(a, b);
        }

        final Map<Integer, Integer> unionSizes = new HashMap<>();
        final UnionFindTree bothTree = new UnionFindTree(n);
        for (Edge railway : railways) {
            int a = railway.a;
            int b = railway.b;
            int rootAInRoadTree = roadTree.find(a);
            int rootBInRoadTree = roadTree.find(b);
            if (rootAInRoadTree == rootBInRoadTree) {
                bothTree.union(a, b);
            }
        }

        for (int i = 1; i <= n; ++i) {
            int root = bothTree.find(i);
            int unionSize = unionSizes.getOrDefault(root, 0);
            unionSizes.put(root, unionSize + 1);
        }

        for (int i = 1; i <= n; ++i) {
            int root = bothTree.find(i);
            System.out.print(unionSizes.getOrDefault(root, 0) + " ");
        }


    }
}
