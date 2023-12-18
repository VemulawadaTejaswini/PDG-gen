

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class UnionFindTree {
        // nodeNum 个数，下标 [1, nodeNum]
        int nodeNum;
        int [] parent;
        int [] height;

        public UnionFindTree(int nodeNum) {
            this.nodeNum = nodeNum;
            parent = new int[nodeNum + 1];
            height = new int[nodeNum + 1];
            for (int i = 1; i <= nodeNum; ++i) {
                parent[i] = i;
                height[i] = 0;
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
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] graph = new char[h][w];
        for (int i = 0; i < h; ++i) {
            String s = scanner.next();
            for (int j = 0; j < w; ++j) {
                graph[i][j] = s.charAt(j);
            }
        }
        UnionFindTree unionFindTree = new UnionFindTree(h * w);
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                if (i + 1 < h) {
                    if (graph[i][j] != graph[i + 1][j]) {
                        unionFindTree.union(
                                i * w + j,
                                (i + 1) * w + j
                        );
                    }
                }
                if (i - 1 >= 0) {
                    if (graph[i][j] != graph[i - 1][j]) {
                        unionFindTree.union(
                                i * w + j,
                                (i - 1) * w + j
                        );
                    }
                }
                if (j + 1 < w) {
                    if (graph[i][j] != graph[i][j + 1]) {
                        unionFindTree.union(
                                i * w + j,
                                i * w + j + 1
                        );
                    }
                }

                if (j - 1 >= 0) {
                    if (graph[i][j] != graph[i][j - 1]) {
                        unionFindTree.union(
                                i * w + j,
                                i * w + j - 1
                        );
                    }
                }

            }
        }
        Map<Integer, Set<Integer>> blacks = new HashMap<>();
        Map<Integer, Set<Integer>> whites = new HashMap<>();
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                int root = unionFindTree.find(i * w + j);

                if (graph[i][j] == '#') {
                    Set<Integer> node = blacks.getOrDefault(root, new HashSet<>());
                    node.add(i * w + j);
                    blacks.put(root, node);
                } else {
                    Set<Integer> node = whites.getOrDefault(root, new HashSet<>());
                    node.add(i * w + j);
                    whites.put(root, node);
                }
            }
        }
        long result = 0;
        for (Map.Entry<Integer, Set<Integer>> rootAndSize : whites.entrySet()) {
            int blackNum = blacks.getOrDefault(rootAndSize.getKey(), new HashSet<>()).size();
            int whiteNum = rootAndSize.getValue().size();
            result += blackNum * whiteNum;
        }
        System.out.println(result);


    }
}
