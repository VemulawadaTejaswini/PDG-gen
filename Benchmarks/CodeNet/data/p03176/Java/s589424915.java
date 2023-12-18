import java.util.*;

public class Main {

    static int MAX_N = 1 << 24;
    static int INT_MAX = 2147483647;
    static int INT_MIN = 0;

    static int n;
    static long[] dat = new long[2*MAX_N-1];

    public static void init(int n_) {
        n = 1;
        while (n < n_) {
            n*=2;
        }
        for (int i=0;i<2*n-1;i++) {
            dat[i] = INT_MIN;
        }
    }

    public static void update(int k, long a) {
        k+=n-1;
        dat[k]=a;
        while (k>0) {
            k = (k-1)/2;
            dat[k] = Math.max(dat[k*2+1], dat[k*2+2]);
        }
    }

    public static long query(int a, int b, int k, int l, int r) {
        if (r<=a || b<=l) {
            return INT_MIN;
        }
        if (a<=l && r<=b) {
            return dat[k];
        } else {
            long vl = query(a, b, k*2+1, l, (l+r)/2);
            long vr = query(a, b, k*2+2, (l+r)/2, r);
            return Math.max(vl, vr);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] h = new int[N];
        int[] a = new int[N];
        init(N);
        for (int i=0;i<N;i++) {
            h[i] = Integer.parseInt(sc.next())-1;
        }
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        long[] dp = new long[N];
        for (int i=0;i<N;i++) {
            dp[h[i]] = a[i]+query(0, h[i], 0, 0, n);
            update(h[i], dp[h[i]]);
        }

        long ans = 0;
        for (int i=0;i<N;i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}