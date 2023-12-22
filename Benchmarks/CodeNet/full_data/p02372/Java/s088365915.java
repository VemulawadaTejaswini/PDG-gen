
/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_5_B
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class Tree {

        List<Integer>[] edges;
        int[][] weight;
        int[][] height;
        int numNodes;

        @SuppressWarnings("unchecked")
        public Tree(int n) {
            numNodes = n;
            edges = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<Integer>();
            }
            weight = new int[n][];
            for (int i = 0; i < n; i++) {
                weight[i] = new int[n];
            }
        }

        public void addEdge(int n1, int n2, int weight) {
            this.weight[n1][n2] = weight;
            this.weight[n2][n1] = weight;
            edges[n1].add(n2);
            edges[n2].add(n1);
        }

        public void compute() {
            height = new int[numNodes][];
            for (int i = 0; i < numNodes; i++) {
                height[i] = new int[edges[i].size()];
            }
            dfsDownTree(0, -1);
            dfsUpTree(0, -1);
        }

        private void dfsDownTree(int nodeIdx, int fromIdx) {
            // compute height[nodeIdx][...] except height[nodeIdx][fromIdx]
            for (int i = 0; i < height[nodeIdx].length; i++) {
                int childIdx = edges[nodeIdx].get(i);
                if (childIdx == fromIdx) {
                    continue;
                }
                dfsDownTree(childIdx, nodeIdx);
                height[nodeIdx][i] = weight[nodeIdx][childIdx] + computeHeight(childIdx, nodeIdx);
            }
        }

        private void dfsUpTree(int nodeIdx, int fromIdx) {
            for (int i = 0; i < height[nodeIdx].length; i++) {
                int childIdx = edges[nodeIdx].get(i);
                if (childIdx != fromIdx) {
                    dfsUpTree(childIdx, nodeIdx);
                }
                if (childIdx == fromIdx && height[nodeIdx][i] == 0) {
                    height[nodeIdx][i] = weight[nodeIdx][fromIdx] + computeHeight(fromIdx, nodeIdx);
                }
            }
        }

        private int computeHeight(int nodeIdx, int fromIdx) {
            int ret = 0;
            for (int i = 0; i < height[nodeIdx].length; i++) {
                int childIdx = edges[nodeIdx].get(i);
                if (childIdx == fromIdx) {
                    continue;
                }
                ret = Math.max(ret, height[nodeIdx][i]);
            }
            return ret;
        }

        public int getHeight(int k) {
            return computeHeight(k, -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Tree tree = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int weight = scanner.nextInt();
            tree.addEdge(s, t, weight);
        }
        tree.compute();
        for (int i = 0; i < n; i++) {
            System.out.println(tree.getHeight(i));
        }
    }
}