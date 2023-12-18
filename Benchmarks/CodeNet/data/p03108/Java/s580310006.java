import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextInt();
            int M = in.nextInt();
            int[][] link = new int[M][2];
            for (int i = 0; i < M; i++) {
                link[i][0] = in.nextInt() - 1;
                link[i][1] = in.nextInt() - 1;
            }

            long[] n = new long[M + 1];
            int index = 0;
            n[index++] = (N * N - N) / 2;

            UnionFind uf = new UnionFind();
            uf.init((int) N);
            for (int i = M - 1; i >= 0; i--) {
                if (uf.find(link[i][0]) == uf.find(link[i][1])) {
                    n[index] = n[index - 1];
                    index++;
                    continue;
                }
                long size0 = uf.size(link[i][0]);
                long size1 = uf.size(link[i][1]);
                uf.unite(link[i][0], link[i][1]);
                n[index] = n[index - 1] - (size0 * size1);
                index++;
            }

            for (int i = n.length - 1 - 1; i >= 0; i--) {
                System.out.println(n[i]);
            }

        }
    }
}

class UnionFind {
    private int[] par;
    private int[] rank;
    private int[] size;

    public void init(int n) {
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (par[x] == x) {
            return x;
        } else {
            int find = find(par[x]);
            size[find] = size[par[x]];
            par[x] = find;
            return par[x];
        }
    }

    public int size(int x) {
        return size[find(x)];
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            par[x] = y;
            size[y] += size[x];
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
            size[x] += size[y];
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
