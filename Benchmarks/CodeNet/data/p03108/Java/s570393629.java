import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        long[] ans = new long[m];
        ans[m - 1] = (long) n * (n - 1) / 2;

        UnionFindTree uf = new UnionFindTree(n);

        for (int i = m - 1; i >= 1; i--) {
            ans[i - 1] = ans[i];
            if (uf.find(a[i]) != uf.find(b[i])) {
                ans[i - 1] -= (long) uf.size(a[i]) * uf.size(b[i]);
                uf.union(a[i], b[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(ans[i]);
        }
    }

}

class UnionFindTree {
    int[] parent;
    int[] rank;

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = -1;
        }
    }

    public boolean union(int x, int y) {

        if (same(x, y)) {
            return false;
        }

        if (size(x) < size(y)) {
            int temp = x;
            x = y;
            y = temp;
        }

        parent[x] += parent[y];

        parent[y] = x;
        return true;
    }

    //引数の属する木のrootのidを返す。
    public int find(int i) {
        if (parent[i] < 0) {
            return i;
        } else {
            return parent[i] = find(parent[i]);
        }
    }

    //同じ木に属しているか判定
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public int size(int x) {
        return -parent[find(x)];
    }
}