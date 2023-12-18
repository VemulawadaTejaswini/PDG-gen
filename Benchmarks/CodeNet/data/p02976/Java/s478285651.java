import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int other(int u) {
            return u == to ? from : to;
        }

        public void reverse() {
            int tmp = from;
            from = to;
            to = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Edge>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) edges.add(new ArrayList<>());

        boolean odd[] = new boolean[N];
        for (int i = 0; i < M; i++) {
            Edge e = new Edge(sc.nextInt() - 1, sc.nextInt() - 1);
            odd[e.from] = !odd[e.from];
            edges.get(e.from).add(e);
            edges.get(e.to).add(e);
        }

        List<Integer> todo = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (odd[i]) todo.add(i);
        }

        if (todo.size() % 2 != 0) {
            System.out.println(-1);
            return;
        }

        for (int u : todo) {
            if (odd[u]) bfs(u, edges, odd);
        }

        for (int i = 0; i < N; i++) {
            for (Edge e : edges.get(i)) {
                if (i == e.from) {
                    System.out.println((e.from + 1) + " " + (e.to + 1));
                }
            }
        }
    }

    static void bfs(int s, List<List<Edge>> edges, boolean[] odd) {
        LinkedList<Integer> queue = new LinkedList<>();
        Edge[] pred = new Edge[odd.length];
        queue.add(s);

        while (!queue.isEmpty()) {
            int u = queue.pollLast();

            for (Edge e : edges.get(u)) {
                int v = e.other(u);
                if (pred[v] != null) continue;
                if (odd[v]) {
                    odd[v] = false;
                    e.reverse();
                    while (pred[u] != null) {
                        pred[u].reverse();
                        u = pred[u].other(u);
                    }
                    odd[u] = false;
                    return;
                }
                queue.addFirst(v);
                pred[v] = e;
            }
        }
    }
}