import java.util.Arrays;
import java.util.Scanner;

public class Main{

    static class UnionFind {
        int[] d;
        UnionFind(int n) {
            d = new int[n];
            Arrays.fill(d, -1);
        }

        int find(int x) {
            if(d[x] < 0) return x;
            return d[x] = find(d[x]);
        }

        boolean unite(int x, int y) {
            x = find(x); y = find(y);
            if(x == y) return false;
            if(d[x] > d[y]) {
                int tmp = x; x = y; y = x;
            }
            d[x] += d[y];
            d[y] = x;
            return true;
        }

        boolean same(int x, int y) { return find(x) == find(y); }
        int size(int x) { return -d[find(x)]; }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();
        UnionFind uf = new UnionFind(n);
        int[] deg = new int[n];
        for(int i = 0; i < m; i++) {
            int a, b;
            a = Integer.parseInt(sc.next()); b = Integer.parseInt(sc.next());
            --a; --b;
            deg[a]++; deg[b]++;
            uf.unite(a, b);
        }
        int[][] to = new int[k][2];
        for(int i = 0; i < k; i++) {
            to[i][0] = Integer.parseInt(sc.next()) -1;
            to[i][1] = Integer.parseInt(sc.next()) -1;
        }
        int[] ans = new int[n];
        for(int i = 0; i < n ; i++) {
            ans[i] = uf.size(i) - 1 - deg[i];
        }
        for(int i = 0; i < k; i++) {
            if(uf.same(to[i][0], to[i][1])) {
                ans[to[i][0]]--;
                ans[to[i][1]]--;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("%d%c", ans[i], i==n-1?'\n':' ');
        }
    }
}