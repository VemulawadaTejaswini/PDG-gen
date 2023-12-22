import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, q;
    int[] as;
    Query[] qs;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        as = new int[n];
        Arrays.fill(as, (2 << 30) - 1);
        qs = new Query[q];
        for (int i = 0; i < q; i++) {
            int num = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            qs[i] = new Query(num, x, y);
        }
    }

    void solve() {
        SegmentTree tree = new SegmentTree(n);
        tree.initialize(as);
        for (Query query: qs) {
            if (query.num == 0) {
                as[query.x] = query.y;
                tree.update(query.x, query.y);
            } else {
                int ans = tree.query(query.x, query.y+1,
                            0, 0, tree.n);
                System.out.println(ans);
            }
        }
    }

    private class Query {
        int num, x, y;
        Query(int n, int x, int y) {
            num = n;
            this.x = x;
            this.y = y;
        }
    }

    private class SegmentTree {
        int n;
        int[] tree;
        SegmentTree (int k) {
            for (n = 1; n < k; n *= 2) {}
            tree = new int[2*n - 1];
            Arrays.fill(tree, Integer.MAX_VALUE);
        }

        void initialize(int[] as) {
            for (int i = 0; i < as.length; i++) {
                update(i, as[i]);
            }
        }

        void update(int i, int x) {
            i += n  - 1;
            tree[i] = x;
            while (i > 0) {
                i = (i - 1) / 2;
                tree[i] = Math.min(tree[i * 2 + 1], tree[i * 2 + 2]);
            }
        }

        int query(int x, int y, int k, int l, int r) {
            if (r <= x || y <= l) return Integer.MAX_VALUE;
            if (x <= l && r <= y) return tree[k];
            else {
                int vl = query(x, y, k * 2 + 1, l, (l + r) / 2);
                int vr = query(x, y, k * 2 + 2, (l + r) / 2, r);
                return Math.min(vl, vr);
            }
        }
    }
}