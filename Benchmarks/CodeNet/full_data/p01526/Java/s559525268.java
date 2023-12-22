import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = sc.nextDouble();
        Point2D.Double[] ps = new Point2D.Double[n];
        for (int i = 0; i < n; i++) {
            ps[i] = new Point2D.Double(sc.nextDouble(), sc.nextDouble());
        }
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ps[i].x - ps[j].x) * (ps[i].x - ps[j].x)
                        + (ps[i].y - ps[j].y) * (ps[i].y - ps[j].y) <= r * r)
                    uf.unite(i, j);
            }
        }
        int ans = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int m = uf.par[i];
            if (set.contains(m))
                continue;
            set.add(m);
            ans++;
            if (ans == 10)
                break;
        }
        System.out.println(ans);
    }
}

class UnionFind {
    int par[];
    int rank[];

    UnionFind(int n) {
        par = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public int find(int x) {
        if (x == par[x])
            return x;
        else
            return par[x] = find(par[x]);
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y)
            return;
        if (rank[x] > rank[y])
            par[y] = x;
        else {
            par[x] = y;
            if (rank[x] == rank[y])
                rank[y]++;
        }
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}