
import java.util.*;

public class Main {

    static class Edge {
        int from, to;
        boolean tree;

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

        for (int i = 0; i < M; i++) {
            Edge e = new Edge(sc.nextInt() - 1, sc.nextInt() - 1);
            edges.get(e.from).add(e);
            edges.get(e.to).add(e);
        }

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.addFirst(0);
        Edge[] pred = new Edge[N];
        int[] children = new int[N];
        LinkedList<Integer> leaves = new LinkedList<>();

        while (!queue.isEmpty()) {
            int u = queue.pollLast();
            for (Edge e : edges.get(u)) {
                int v = e.other(u);
                if (v == 0 || pred[v] != null) continue;
                e.tree = true;
                pred[v] = e;
                queue.addFirst(v);
                children[u]++;
            }
            if (children[u] == 0) leaves.add(u);
        }

        boolean[] odd = new boolean[N];
        for (int u = 0; u < N; u++) {
            for (Edge e : edges.get(u)) {
                if (!e.tree && u == e.from) odd[u] = !odd[u];
            }
        }

        while (!leaves.isEmpty()) {
            int u = leaves.pollLast();
            if (u == 0) break;
            Edge e = pred[u];
            int p = e.other(u);
            if (odd[u]) {
                if (e.from != u) e.reverse();
                odd[u] = false;
            } else {
                if (e.from == u) e.reverse();
                odd[p] = !odd[p];
            }
            children[p]--;
            if (children[p] == 0) leaves.addLast(p);
        }

        for (int u = 0; u < N; u++) {
            for (Edge e : edges.get(u)) {
                if (u == e.from) {
                    System.out.println((u + 1) + " " + (e.to + 1));
                }
            }
        }
    }
}
