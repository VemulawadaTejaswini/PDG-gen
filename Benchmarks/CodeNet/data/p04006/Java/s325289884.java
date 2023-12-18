import java.util.*;

public class Main {
    static long INF = (1L<<60);
    static int n;
    static long[] dat;

    static void update(int x, int y) {
        int tmp = x+n-1;
        dat[tmp] = y;
        while (tmp>0) {
            tmp=(tmp-1)/2;
            dat[tmp] = Math.min(dat[tmp*2+1], dat[tmp*2+2]);
        }
    }

    static long query(int a, int b, int k, int l, int r) {
        if (b<=l || r<=a) return INF;
        if (a<=l && r<=b) return dat[k];
        else {
            long lv = query(a, b, 2*k+1, l, (l+r)/2);
            long rv = query(a, b, 2*k+2, (l+r)/2, r);
            return Math.min(lv, rv);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        n = 1;
        while(n<2*N) n*=2;
        dat = new long[2*n-1];
        Arrays.fill(dat, INF);
        int x = sc.nextInt();
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++) {
            update(i, a[i]);
            update(i+N, a[i]);
        }

        long min = INF;
        for (int i=0;i<N;i++) { // magic cnt
            long tmp = 0L;
            for (int j=0;j<N;j++) {
                tmp+=query(N+j-i, N+j+1, 0, 0, n);
            }
            min = Math.min(min, tmp+(long)x*i);
        }
        // System.out.println(Arrays.toString(dat));
        System.out.println(min);
    }
}