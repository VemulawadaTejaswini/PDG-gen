import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        SegmentTreeRMQ st = new SegmentTreeRMQ(a);

        long sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; i + j <= N; j++) {
                sum += st.min(i, i + j);
            }
        }
        System.out.println(sum);
    }

    // ref http://yukicoder.me/submissions/72184
    private static class SegmentTreeRMQ {

        private int n;
        private long[] mi_seg, ma_seg;

        public SegmentTreeRMQ(int nn) {
            n = 1;
            while (n < nn) n <<= 1;
            mi_seg = new long[(n << 1) - 1];
            ma_seg = new long[(n << 1) - 1];
            Arrays.fill(mi_seg, Long.MAX_VALUE);
            Arrays.fill(ma_seg, Long.MIN_VALUE);
        }

        public SegmentTreeRMQ(int[] a) {
            int nn = a.length;
            n = 1;
            while (n < nn) n <<= 1;
            mi_seg = new long[(n << 1) - 1];
            ma_seg = new long[(n << 1) - 1];
            Arrays.fill(mi_seg, Long.MAX_VALUE);
            Arrays.fill(ma_seg, Long.MIN_VALUE);
            for (int i = 0; i < nn; i++) {
                update(i, (long) a[i]);
            }
        }

        public long min(int a, int b) {
            return _min_query(a, b, 0, 0, n);
        }

        private long _min_query(int a, int b, int k, int l, int r) {
            if (a <= l && r <= b) return mi_seg[k];
            if (r <= a || b <= l) return Long.MAX_VALUE;
            long cl = _min_query(a, b, (k << 1) + 1, l, (l + r) >>> 1);
            long cr = _min_query(a, b, (k << 1) + 2, (l + r) >>> 1, r);
            return Math.min(cl, cr);
        }

        public void min_update(int i, long val) {
            i += n - 1;
            mi_seg[i] = val;
            while (i > 0) {
                i--;
                i >>>= 1;
                mi_seg[i] = Math.min(mi_seg[(i << 1) + 1], mi_seg[(i << 1) + 2]);
            }
        }

        public long max(int a, int b) {
            return _max_query(a, b, 0, 0, n);
        }

        private long _max_query(int a, int b, int k, int l, int r) {
            if (a <= l && r <= b) return ma_seg[k];
            if (r <= a || b <= l) return Long.MIN_VALUE;
            long cl = _max_query(a, b, (k << 1) + 1, l, (l + r) >>> 1);
            long cr = _max_query(a, b, (k << 1) + 2, (l + r) >>> 1, r);
            return Math.max(cl, cr);
        }

        public void max_update(int i, long val) {
            i += n - 1;
            ma_seg[i] = val;
            while (i > 0) {
                i--;
                i >>>= 1;
                ma_seg[i] = Math.max(ma_seg[(i << 1) + 1], ma_seg[(i << 1) + 2]);
            }
        }

        public void update(int i, long val) {
            min_update(i, val);
            max_update(i, val);
        }
    }
}
