import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.addPath(a, b);
        }
        ArrayList<Integer> ar = g.serchPath(0, n - 1);
        int len = ar.size();
        int Snuke = ar.get((len - 1) / 2);
        int Fennec = ar.get((len - 1) / 2 + 1);
        g.removePath(Snuke, Fennec);
        Snuke = g.countGroup(Snuke);
        Fennec = g.countGroup(Fennec);
        if (Snuke < Fennec) {
            System.out.println("Fennec");
        } else {
            System.out.println("Snuke");
        }
        sc.close();
    }
}

class Graph {

    int n;// node数

    Node[] nodes;

    /**
     * @param n:ノード数
     */
    Graph(int n) {
        this.n = n;
        nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
    }

    // 双方向pathの追加
    public void addPath(int v, int u) {
        this.nodes[u].addPath(nodes[v]);
        this.nodes[v].addPath(nodes[u]);
    }

    // pathの削除
    public void removePath(int u, int v) {
        this.nodes[u].removePath(nodes[v]);
        this.nodes[v].removePath(nodes[u]);
    }

    /**
     * @param v : node
     * @return count of this group7s node
     */
    public int countGroup(int v) {
        int cnt = 0;
        boolean[] visited = new boolean[n];
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(v);
        cnt++;
        visited[v] = true;
        while (!stack.isEmpty()) {
            int pos = stack.poll();
            for (Node node : nodes[pos].edges) {
                if (!visited[node.id]) {
                    visited[node.id] = true;
                    cnt++;
                    stack.push(node.id);
                }
            }
        }
        return cnt;
    }

    public ArrayList<Integer> serchPath(int from, int to) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        stack.push(from);
        visited[from] = true;
        S: while (!stack.isEmpty()) {
            int currentPosition = stack.peekFirst();
            if (currentPosition == to) {
                break S;
            }
            for (Node n : nodes[currentPosition].edges) {
                if (!visited[n.id]) {
                    stack.push(n.id);
                    visited[n.id] = true;
                    continue S;
                }
            }
            stack.pollFirst();
        }
        ArrayList<Integer> path = new ArrayList<>(stack);
        return path;
    }

    class Node {
        int id;

        ArrayList<Node> edges;

        Node(int id) {
            this.id = id;
            this.edges = new ArrayList<>();
        }

        void addPath(Node next) {
            this.edges.add(next);
        }

        void removePath(Node other) {
            this.edges.remove(other);
        }
    }
}
