import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void solve() {
        int n = sc.nextInt();
        int[] data = new int[n];
        Arrays.fill(data, Integer.MAX_VALUE);
        RMQ_RUQ ruq = new RMQ_RUQ(data);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                int x = sc.nextInt();
                ruq.update(s, t + 1, x);
            }
            else if (cmd == 1) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                System.out.println(ruq.query(s, t + 1));

            }
        }
    }
    static class RMQ_RUQ {
        int[] stUpdate;
        int[] stMin;
        int n;
        final static int NULL = -1;
        final static int INF = Integer.MAX_VALUE;
        public RMQ_RUQ(int[] data) {
            n = 1;
            while (n < data.length) {
                n *= 2;
            }
            stUpdate = new int[2 * n - 1];
            Arrays.fill(stUpdate, NULL);
            stMin = new int[2 * n - 1];
            for (int i = 0, size = data.length; i < size; i++) {
                stMin[n - 1 + i] = data[i];
            }
            for (int i = data.length; i < n; i++) {
                stMin[n - 1 + i] = INF;
            }
            for (int i = n - 2; i >= 0; i--) {
                stMin[i] = Math.min(stMin[2 * i + 1], stMin[2 * i + 2]);
            }
        }

        void update(int l, int r, int x) {
            update(l, r, x, 0, 0, n);
        }
        void update(int l, int r, int x, int k, int ll, int rr) {
            if (ll >= l && rr <= r) {
                stUpdate[k] = x;
                stMin[k] = x;
            }
            else if (ll >= r || rr <= l) {
            }
            else {
                if (stUpdate[k] != NULL) {
                    stUpdate[2 * k + 1] = stUpdate[k];
                    stUpdate[2 * k + 2] = stUpdate[k];
                    stMin[2 * k + 1] = stUpdate[k];
                    stMin[2 * k + 2] = stUpdate[k];
                    stUpdate[k] = NULL;
                }
                int mm = (ll + rr) / 2;
                update(l, r, x, 2 * k + 1, ll, mm);
                update(l, r, x, 2 * k + 2, mm, rr);
                stMin[k] = Math.min(stMin[2 * k + 1], stMin[2 * k + 2]);
            }
        }
        int query(int l, int r) {
            return query(l, r, 0, 0, n);
        }
        int query(int l, int r, int k, int ll, int rr) {
            int ret;
            if (ll >= l && rr <= r) {
                ret = stMin[k];
            }
            else if (ll >= r || rr <= l) {
                ret = INF;
            }
            else {
                if (stUpdate[k] != NULL) {
                    ret = stMin[k];
                }
                else {
                    int mm = (ll + rr) / 2;
                    ret = Math.min(query(l, r, 2 * k + 1, ll, mm), query(l, r, 2 * k + 2, mm, rr));
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
