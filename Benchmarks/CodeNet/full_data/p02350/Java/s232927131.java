import java.util.*;

public class Main {

    static int n;
    static int[] lazy;
    static int[] node;
    static int INF = (1<<31)-1;

    static void eval(int k, int l, int r) {
        if (lazy[k]!=INF) {
            node[k] = lazy[k];
            if (r-l>1) {
                lazy[2*k+1] = lazy[k];
                lazy[2*k+2] = lazy[k];
            }
            lazy[k] = INF;
        }
    }

    static void update(int a, int b, int x, int k, int l, int r) {
        eval(k, l, r);
        if (a<=l && r<=b) {
            lazy[k] = x;
            node[k] = x;
            eval(k, l, r);
        } else if (b<=l || r<=a) {
        } else {
            update(a, b, x, 2*k+1, l, (l+r)/2);
            update(a, b, x, 2*k+2, (l+r)/2, r);
            node[k] = Math.min(node[2*k+1], node[2*k+2]);
        }
    }

    static int query(int a, int b, int k, int l, int r) {
        eval(k, l, r);
        if (a<=l && r<=b) {
            return node[k];
        } else if (b<=l || r<=a) {
            return INF;
        } else {
            int vl = query(a, b, 2*k+1, l, (l+r)/2);
            int vr = query(a, b, 2*k+2, (l+r)/2, r);
            return Math.min(vl, vr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n_ = sc.nextInt();
        n = 1;
        while (n<n_) n*=2;
        lazy = new int[2*n-1];
        node = new int[2*n-1];
        Arrays.fill(lazy, INF);
        Arrays.fill(node, INF);

        int q = sc.nextInt();
        for (int i=0;i<q;i++) {
            int com = sc.nextInt();
            if (com==0) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                int x = sc.nextInt();
                update(s, t+1, x, 0, 0, n);
            } else { // com==1
                int s = sc.nextInt();
                int t = sc.nextInt();
                System.out.println(query(s, t+1, 0, 0, n));
            }
        }
        // System.out.println(Arrays.toString(lazy));
        // System.out.println(Arrays.toString(node));
    }
}
