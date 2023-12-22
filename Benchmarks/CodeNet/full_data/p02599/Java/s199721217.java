import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] c = new int[n];
        for (int i=0; i<n; i++) c[i] = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        SegTree st = new SegTree(n);
        for (int i=0; i<n; i++) st.update(i, c[i]);

        for (int i=0; i<q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int u = st.query(l, r+1);
            sb.append(Integer.bitCount(u) + "\n");
        }

        System.out.println(sb.toString());

    }

    public class SegTree {

        int n = 1;
        int[] val;

        public SegTree(int n) {
            while (this.n < n) this.n *= 2;
            val = new int[2*this.n-1];
        }

        void update(int k, int a) {
            k += n - 1;
            val[k] = (1 << a);
            while (k > 0) {
                k = (k - 1) / 2;
                val[k] = val[2*k+1] | val[2*k+2];
            }
        }

        int query(int a, int b) {
//            for (int i=0; i<val.length; i++) {
//                System.out.println(val[i]);
//            }
            return query(0, n, a, b, 0);
        }

        int query(int l, int r, int a, int b, int k) {
            if (r<=a || b<=l) return 0;
            if (a<=l && r<=b) return val[k];
            else {
                int vl = query(l, (l+r)/2, a, b, 2*k+1);
                int vr = query((l+r)/2, r, a, b, 2*k+2);
                return vl | vr;
            }
        }
    }


}

