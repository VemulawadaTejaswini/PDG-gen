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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < q; ++i) {
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (com == 0) uf.unify(x, y);
            else {
                if (uf.connected(x, y))
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}
