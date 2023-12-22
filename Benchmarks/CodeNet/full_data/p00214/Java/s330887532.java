import java.awt.Rectangle;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    final double pi = (1 << 2)
            * (Math.cbrt(1. / 0.015625) * Math.atan(0.2) - Math.atan(1. / 239));
    final double EPS = 1.0e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            while (n != 0) {
                int m = sc.nextInt();
                Rectangle[] rs = new Rectangle[m];
                for (int i = 0; i < m; i++) {
                    int xa = sc.nextInt();
                    int ya = sc.nextInt();
                    int xb = sc.nextInt();
                    int yb = sc.nextInt();
                    int xc = sc.nextInt();
                    int yc = sc.nextInt();
                    int xd = sc.nextInt();
                    int yd = sc.nextInt();
                    rs[i] = new Rectangle(xa, ya, xd - xa, yb - ya);
                }
                UnionFind uf = new UnionFind(m);
                for (int i = 0; i < m; i++) {
                    for (int j = i; j < m; j++) {
                        if (rs[i].intersects(rs[j]))
                            uf.unite(i, j);
                    }
                }
                Set<Integer> set = new HashSet<Integer>();
                for (int i = 0; i < m; i++) {
                    set.add(uf.par[i]);
                }
                System.out.println(set.size());
                n--;
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

class UnionFind {
    int par[];

    UnionFind(int n) {
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    int find(int x) {
        if (x == par[x])
            return x;
        else
            return par[x] = find(par[x]);
    }

    void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y)
            return;
        par[x] = y;
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }
}