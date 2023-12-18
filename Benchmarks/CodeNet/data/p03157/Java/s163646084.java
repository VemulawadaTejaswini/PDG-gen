import java.util.Arrays;
import java.util.Scanner;

class C {
    static class UnionFind {
        final int[] tree;

        public UnionFind(int size) {
            tree = new int[size];
            Arrays.fill(tree, -1);
        }

        int root(int x) {
            return tree[x] < 0 ? x : (tree[x] = root(tree[x]));
        }

        void union(int x, int y) {
            if (tree[x] > tree[y])
                union(y, x);
            else {
                tree[x] += tree[y];
                tree[y] = x;
            }
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final char[][] S = new char[H][];
        for (int i = 0; i < H; i++)
            S[i] = sc.next().toCharArray();
        final UnionFind uf = new UnionFind(H * W);
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++) {
                if (i > 0 && S[i - 1][j] != S[i][j])
                    uf.union(i * W + j, (i - 1) * W + j);
                if (j > 0 && S[i][j - 1] != S[i][j])
                    uf.union(i * W + j, i * W + j - 1);
            }
        final int[][] b = new int[H][W];
        final int[][] w = new int[H][W];
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++) {
                final int r = uf.root(i * W + j);
                if (S[i][j] == '.')
                    w[r / W][r % W]++;
                else
                    b[r / W][r % W]++;
            }
        long ans = 0;
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++)
                ans += (long) w[i][j] * b[i][j];
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
