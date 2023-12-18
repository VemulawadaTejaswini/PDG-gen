
import java.util.*;
import java.math.*;

public class Main{

    final static int maxn = (int) 1e5 + 7;

    static int[] a = new int[maxn];

    static int[] tree = new int[maxn << 2];

    static int n;

    static void build(int l, int r, int node) {
        if(l == r) {
            tree[node] = a[l];
            return;
        }
        int mid = (l + r) >> 1;
        build(l, mid, node<<1);
        build(mid + 1, r, node << 1 | 1);
        tree[node] = Math.max(tree[node<<1], tree[node<<1|1]);
    }

    static int query(int l, int r, int node, int ql, int qr) {
        if(ql <= l && qr >= r) return tree[node];
        int mid = (l + r) >> 1;
        int res = 0;
        if(ql <= mid) res = Math.max(res, query(l, mid, node<<1, ql, qr));
        if(qr > mid)  res = Math.max(res, query(mid+1, r, node<<1|1, ql, qr));
        return res;
    }

    static long get_left(int k, int l, int r) {
        long ans = -1;
        while(l <= r){
            int mid = (l + r) >> 1;
            if(query(1, n, 1, mid, r) > a[k]) {
                ans = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return ans;
    }

    static long get_right(int k, int l, int r) {
        long ans = -1;
        while(l <= r){
            int mid = (l + r) >> 1;
            if(query(1, n, 1, l, mid) > a[k]) {
                ans = mid;
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            n = cin.nextInt();
            for(int i=1; i<=n; i++) a[i] = cin.nextInt();
            build(1, n, 1);
            long ans = 0;
            for(int i=1; i<=n; i++) {
                long pl1 = get_left(i, 1, i-1);
                long pl2 = pl1 == -1 ? -1 : get_left(i, 1, (int)pl1 - 1);
                long pr1 = get_right(i, i+1, n);
                long pr2 = pr1 == -1 ? -1 : get_right(i, (int)pr1 + 1, n);
                if(pl1 != -1 && pl2 != -1 && pr1 != -1 && pr2 != -1) ans += a[i] * ((pl1 - pl2) * (pr1 - i) + (i - pl1) * (pr2 - pr1));
                if(pl1 != -1 && pl2 != -1 && pr1 != -1 && pr2 == -1) ans += a[i] * ((pl1 - pl2) * (pr1 - i) + (i - pl1) * (n - pr1 + 1));
                if(pl1 != -1 && pl2 != -1 && pr1 == -1 && pr2 == -1) ans += a[i] * ((pl1 - pl2) * (n - i + 1));

                if(pl1 != -1 && pl2 == -1 && pr1 != -1 && pr2 != -1)  ans += a[i] * (pl1 * (pr1 - i) + (i - pl1) * (pr2 - pr1));
                if(pl1 != -1 && pl2 == -1 && pr1 != -1 && pr2 == -1) ans += a[i] * (pl1 * (pr1 - i) + (i - pl1) * (n - pr1 + 1));
                if(pl1 != -1 && pl2 == -1 && pr1 == -1 && pr2 == -1) ans += a[i] * (pl1 * (n - i + 1));

                if(pl1 == -1 && pl2 == -1 && pr1 != -1 && pr2 != -1) ans += a[i] * (i * (pr2 - pr1));
                if(pl1 == -1 && pl2 == -1 && pr1 != -1 && pr2 == -1) ans += a[i] * (i * (n - pr1 + 1));
            }
            System.out.println(ans);
        }
    }

}

















