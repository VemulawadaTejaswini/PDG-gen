import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] p = new int[N];
            for (int i = 0; i < p.length; i++) {
                p[i] = in.nextInt() - 1;
            }
            int[] x = new int[M];
            int[] y = new int[M];
            for (int i = 0; i < M; i++) {
                x[i] = in.nextInt() - 1;
                y[i] = in.nextInt() - 1;
            }

            UnionFind uf = new UnionFind();
            uf.init(N);
            for (int i = 0; i < M; i++) {
                uf.unite(x[i], y[i]);
            }

            HashMap<Integer, HashSet<Integer>> indexMap = new HashMap<>();
            HashMap<Integer, HashSet<Integer>> pMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int root = uf.getRoot(i);
                // Utils.debug(i, root);
                if (indexMap.get(root) == null) {
                    indexMap.put(root, new HashSet<>());
                    pMap.put(root, new HashSet<>());
                }
                indexMap.get(root).add(i);
                pMap.get(root).add(p[i]);
            }

            int count = 0;
            for (Integer root : indexMap.keySet()) {
                HashSet<Integer> indexSet = indexMap.get(root);
                // Utils.debug(root, indexSet);
                for (Integer index : indexSet) {
                    if (pMap.get(root).contains(index)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}

class UnionFind {
    private int[] par;
    private int[] rank;

    public void init(int n) {
        par = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    // @Override
    public int getRoot(int x) {
        if (par[x] == x) {
            return x;
        } else {
            par[x] = getRoot(par[x]);
            return par[x];
        }
    }

    // @Override
    public void unite(int x, int y) {
        x = getRoot(x);
        y = getRoot(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            par[x] = y;
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    // @Override
    public boolean isSame(int x, int y) {
        return getRoot(x) == getRoot(y);
    }
}