
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        int[][] cs = new int[3][q];
        for (int i = 0; i < q; i++) {
            cs[0][i] = sc.nextInt();
            cs[1][i] = sc.nextInt();
            cs[2][i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            if (cs[0][i] == 0)
                uf.unite(cs[1][i], cs[2][i]);
            else {
                int ans = uf.hasSameRoot(cs[1][i], cs[2][i]) ? 1 : 0;
                System.out.println(ans);
            }

        }
    }

    static class UnionFind {
        int[] root;
        UnionFind(int n) {
            root = new int[n];
            for (int i = 0; i < n; i++)
                root[i] = i;
        }

        int getRoot(int x) {
            if (root[x] == x)
                return x;
            else
                return root[x] = getRoot(root[x]);
        }

        boolean hasSameRoot(int x, int y) {
            return getRoot(x) == getRoot(y);
        }

        void unite(int x, int y) {
            x = getRoot(x);
            y = getRoot(y);
            if (x == y)
                return;
            root[x] = y;
        }
    }
}