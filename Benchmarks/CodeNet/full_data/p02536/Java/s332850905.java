import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for (int i=0; i<m; i++) {
            arr[i][0] = sc.nextInt() - 1;
            arr[i][1] = sc.nextInt() - 1;
        }

        UnionFind uf = new UnionFind(n);
        for (int i=0; i<m; i++) {
            uf.unite1(arr[i][0], arr[i][1]);
        }

        Set<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++) {
//            System.out.println(uf.parent[i]);
            set.add(uf.find(i));
        }

//        System.out.println(set);
        System.out.println(set.size() - 1);

    }

    class UnionFind {

        int[] parent, rank, size;

        void init(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i=0; i<n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i=0; i<n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            if (x==parent[x]) return x;
            return parent[x] = find(parent[x]);
        }

        //    結合して木のサイズを更新
        public void unite1(int x, int y) {
            x = find(x);
            y = find(y);
            if (!same(x, y)) {
                parent[x] = y;
            }        }

        //    結合して木の深さを更新
        public void unite2(int x, int y) {
            x = find(x);
            y = find(y);
            if (x==y) return;
            if (rank[x] < rank[y]) {
                parent[x] = parent[y];
            } else {
                parent[y] = parent[x];
                if (rank[x]==rank[y]) rank[x]++;
            }
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

        public int size(int x) {
            return size[find(x)];
        }


    }


}

