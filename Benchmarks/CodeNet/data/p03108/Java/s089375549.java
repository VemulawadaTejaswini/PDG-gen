import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
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
            uf.init(N);
            for (int i = M - 1; i >= 0; i--) {
                long bsize = Math.max(uf.size(link[i][0]), uf.size(link[i][1]));
//                bsize = bsize * (bsize - 1) / 2;
                uf.unite(link[i][0], link[i][1]);
                long size = uf.size(link[i][0]);
                size = size * (size - 1) / 2;
                if (bsize == 1) {
                    n[index] = n[index - 1] - 1;
                } else {
                    n[index] = (N * N - N) / 2 - size;
                }
//                Utils.debug(index, n[index], size, bsize);
                index++;
            }

//            Utils.debug(n);
            for (int i = n.length - 1 - 1; i >= 0; i--) {
                System.out.println(n[i]);
            }

        }
    }
}

class UnionFind {
    private int[] par;
    private int[] rank;
    private long[] size;

    public void init(int n) {
        par = new int[n];
        rank = new int[n];
        size = new long[n];
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
            size[par[x]] = Math.max(size[par[x]], size[find(par[x])]);
            par[x] = find(par[x]);
            return par[x];
        }
    }

    public long size(int x) {
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
            size[x] += size[y];
            size[y] = size[x];
        } else {
            par[y] = x;
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
            size[y] += size[x];
            size[x] = size[y];
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
