
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class Node {
        int index;
        int father = -1;
        int currentHeight = 0;
        Set<Integer> connected = new HashSet<>();
        public Node() {
        }
        public Node(int index) {
            this.index = index;
        }
        public void setFather(int father) {
            this.father = father;
        }
        public void setCurrentHeight(int currentHeight) {
            this.currentHeight = currentHeight;
        }
        public void addConnected(int connect) {
            connected.add(connect);
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        Node[] tree = new Node[n + 1];
        for (int i = 1; i <= n; ++i) {
            tree[i] = new Node(i);
        }
        for (int i = 1; i <= n - 1; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree[u].addConnected(v);
            tree[v].addConnected(u);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n + 1];
        queue.add(a);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            visited[current] = 1;
            for (int connected : tree[current].connected) {
                if (visited[connected] == 1) {
                    continue;
                }
                tree[connected].setFather(current);
                queue.add(connected);
            }
        }
        calculateMaxSonHeight(tree, a, a);
        int diffHeight = tree[a].currentHeight - tree[t].currentHeight;
      //  System.out.println("a height: " + tree[a].currentHeight);
      //  System.out.println(" t height: "  +tree[t].currentHeight);
        if (diffHeight == 1) {
            System.out.println(0);
            return;
        }
        if (diffHeight == 2) {
            System.out.println(1);
            return;
        }
        int ans = 0;
        int father = t;
        for (int i = 1; i <= (diffHeight - 1) / 2; ++i) {
            father = tree[father].father;
         //   System.out.println("father: " + father);
            int currentSum = Math.max(
                    tree[a].currentHeight - tree[father].currentHeight,
                    tree[father].currentHeight - tree[t].currentHeight
            ) + (tree[father].currentHeight - 1);
         //   System.out.println("currentSum: " + currentSum);
            ans = Math.max(ans, currentSum);
        }
        System.out.println(ans);
    }

    public static int calculateMaxSonHeight(Node[] tree, int current, int a) {
        if (tree[current].connected.size() == 1 && current != a) {
            tree[current].setCurrentHeight(0);
            return 0;
        }
        int height = 0;
        for (int connected : tree[current].connected) {
            if (connected == tree[current].father) {
                continue;
            }
            int currentHeight = calculateMaxSonHeight(tree, connected, a);
            height = Math.max(height, currentHeight);
        }
        tree[current].setCurrentHeight(height + 1);
        return height + 1;
    }
}
