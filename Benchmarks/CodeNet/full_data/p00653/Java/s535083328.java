import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            for (;;) {
                int r = in.nextInt(), c = in.nextInt(), q = in.nextInt();
                if (r == 0 && c == 0 && q == 0) {
                    break;
                }
                SegmentTree2D st2d = new SegmentTree2D(r, c);
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        st2d.update(i, j, in.nextInt());
                    }
                }
                while (q-- > 0) {
                    int r1 = in.nextInt(), c1 = in.nextInt(), r2 = in.nextInt(), c2 = in.nextInt();
                    int ans = st2d.query(r1, r2 + 1, c1, c2 + 1);
                    System.out.println(ans);
                }
            }
        }
    }

    static class SegmentTree2D {

        private final int m, n;

        private final SegmentTree[] dat;

        public SegmentTree2D(int _m, int _n) {
            m = SegmentTree.getSize(_m);
            n = SegmentTree.getSize(_n);
            dat = new SegmentTree[(m - 1) + m];
            for (int i = 0; i < dat.length; i++) {
                dat[i] = new SegmentTree(n);
            }
        }

        /** 0-indexed mk (vertical), nk (horizontal), a (value) */
        public void update(int mk, int nk, int a) {
            mk += m - 1;
            dat[mk].update(nk, a);
            while (mk > 0) {
                mk = (mk - 1) / 2;
                if (dat[mk].dat[nk + n - 1] > a) {
                    dat[mk].update(nk, a);
                } else {
                    break;
                }
            }
        }

        /** 2D range-query for [ma, mb) (vertical) [na, nb) (horizontal) */
        public int query(int ma, int mb, int na, int nb) {
            return query(ma, mb, na, nb, 0, 0, m);
        }

        private int query(int ma, int mb, int na, int nb, int mk, int ml, int mr) {
            if (mr <= ma || mb <= ml) {
                return Integer.MAX_VALUE;
            }
            if (ma <= ml && mr <= mb) {
                return dat[mk].query(na, nb);
            }
            int vl = query(ma, mb, na, nb, mk * 2 + 1, ml, (ml + mr) / 2);
            int vr = query(ma, mb, na, nb, mk * 2 + 2, (ml + mr) / 2, mr);
            return Math.min(vl, vr);
        }

        /** 1D implementation */
        static class SegmentTree {

            private static int getSize(int _n) {
                int n = 1;
                while (n < _n) {
                    n *= 2;
                }
                return n;
            }

            private final int n;

            private final int[] dat;

            public SegmentTree(int _n) {
                n = getSize(_n);
                dat = new int[(n - 1) + n];// tree(n - 1) + raw (n)
                Arrays.fill(dat, Integer.MAX_VALUE);
            }

            public void update(int k, int a) {
                k += n - 1;
                dat[k] = a;
                while (k > 0) {
                    k = (k - 1) / 2;
                    dat[k] = Math.min(dat[k * 2 + 1], dat[k * 2 + 2]);
                }
            }

            public int query(int a, int b) {
                return query(a, b, 0, 0, n);
            }

            private int query(int a, int b, int k, int l, int r) {
                if (r <= a || b <= l) {
                    return Integer.MAX_VALUE;
                }
                if (a <= l && r <= b) {
                    return dat[k];
                }
                int vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
                int vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
                return Math.min(vl, vr);
            }
        }
    }
}