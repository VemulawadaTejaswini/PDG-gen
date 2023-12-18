import java.util.*;

public class Main {

    static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges.add(new Edge(a, b));
        }

        int res = 0;
        for (int i = 0; i < M; ++i) {
            UnionFind uf = new UnionFind(N);
            for (int j = 0; j < M; ++j) {
                if (i == j) continue;
                uf.unify(edges.get(j).from, edges.get(j).to);
            }
            if (!uf.connected(edges.get(i).from, edges.get(i).to)) ++res;
        }

        System.out.println(res);
    }
}