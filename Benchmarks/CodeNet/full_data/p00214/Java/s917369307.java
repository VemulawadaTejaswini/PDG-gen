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
                        if (Rectangle.isTouch(rs[i], rs[j]))
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

class Rectangle {
    double x;// 位置x
    double y;// 位置y
    double w;// 幅x
    double h;// 高さx

    public Rectangle() {
        this.x = 10;
        this.y = 10;
        this.w = 70;
        this.h = 80;
    }

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public String toString() {
        return "X:" + this.x + "  Y:" + this.y + "W:" + this.w + "  H:"
                + this.h;
    }

    static public Boolean isTouch(Rectangle r1, Rectangle r2) {
        if (((r1.x <= r2.x + r2.w) && (r1.y <= r2.y + r2.h))
                && ((r2.x <= r1.x + r1.w) && (r2.y <= r1.y + r1.h))) {
            return true;
        }
        return false;
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