import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        long[] ans = new long[m];   // 答え
        // 一番最後は最悪の場合
        ans[m - 1] = (long) n * (n - 1) / 2;

        UnionFind uni = new UnionFind(n);
        // 全て破壊された場合から残ってる数を引くことでポイントを計算
        for (int i = m - 1; i >= 1; i--) {
            if (uni.root(a[i]) != uni.root(b[i])) {
                ans[i - 1] = (long) ans[i] - uni.size(a[i]) * uni.size(b[i]);
                uni.unite(a[i], b[i]);
            } else {
                ans[i - 1] = ans[i];
            }
        }

        // 出力
        for (long i : ans){
            System.out.println(i);
        }
    }

    static class UnionFind {
        // Parents[i]:iの親の番号 or 根だった場合、ついているノードの数N(-N)
        static List<Integer> Parents = new ArrayList<>();

        // 最初はすべてが根であるとして初期化
        public UnionFind(int N) {
            for (int i = 0; i < N; i++) {
                Parents.add(-1);
            }
        }

        // データが属する木の根を再帰で得る
        public int root(int x) {
            if (Parents.get(x) < 0)
                return x;
            Parents.set(x, root(Parents.get(x)));
            return Parents.get(x);
        }

        // xとyの木を併合
        public void unite(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            if (rx == ry)
                return;

            // yの方が大きい場合は入れ替える
            if (size(rx) < size(ry)) {
                int tmp = rx;
                rx = ry;
                ry = tmp;
            }

            Parents.set(rx, Parents.get(rx) + Parents.get(ry));
            Parents.set(ry, rx);
        }

        // 2つのデータx, yが属する木が同じならtrueを返す
        public boolean same(int x, int y) {
            int rx = root(x);
            int ry = root(y);
            return rx == ry;
        }

        // 頂点の数を返す
        public int size(int x) {
            if (x >= 0)
                x = root(x);
            return Parents.get(x);
        }
    }
}
