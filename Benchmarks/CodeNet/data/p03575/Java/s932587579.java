import java.util.*;

public class Main {

    static class UnionFind {
        int[] size;
        int[] id;

        public UnionFind(int n) {
            size = new int[n];
            id = new int[n];

            for (int i = 0; i < n; ++i) {
                size[i] = 1;
                id[i] = i;
            }
        }

        void unify(int p, int q) {
            int root1 = find(p);
            int root2 = find(q);

            if (size[root1] > size[root2]) {
                size[root1] += size[root2];
                id[root2] = root1;
            } else {
                size[root2] += size[root1];
                id[root1] = root2;
            }
        }

        int find(int p) {
            int root = p;
            while (root != id[root]) root = id[root];
            while (p != root) {
                int next = id[p];
                id[p] = root;
                p = next;
            }
            return root;
        }

        boolean connected(int p, int q) {
            return find(p) == find(q);
        }
    }

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; ++i) {
            int x = Integer.parseInt(sc.next()) - 1;
            int y = Integer.parseInt(sc.next()) - 1;
            edges.add(new Edge(x, y));
        }

        int res = 0;
        for (int i = 0; i < M; ++i) {
            UnionFind uf = new UnionFind(N);
            for (int j = 0; j < M; ++j) {
                if (i == j) continue;
                Edge edge = edges.get(j);
                uf.unify(edge.from, edge.to);
            }
            Edge edge = edges.get(i);
            if (!uf.connected(edge.from, edge.to)) ++res;
        }

        System.out.println(res);
    }
}