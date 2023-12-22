class UnionFind {
    private final int N;
    int[] parent;
    int[] rank;
    int[] size;

    UnionFind(int n) {
        N = n;
        parent = new int[N];
        Arrays.setAll(parent, i -> i);
        size = new int[N];
        Arrays.fill(size, 1);
        rank = new int[N];
    }

    boolean isRoot(int x) {
        return x == parent[x];
    }

    int root(int x) {
        return isRoot(x) ? x : (parent[x] = root(parent[x]));
    }

    boolean same(int x, int y){
        return root(x) == root(y);
    }

    int size(int x) {
        return size[root(x)];
    }

    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                parent[x] = y;
                size[y] += size[x];
            } else {
                parent[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
        }
    }
}
