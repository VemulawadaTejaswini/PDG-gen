import java.util.*;

public class Main {

    static int INF = (1<<31)-1;
    static int n;
    static int[] dat;

    static void update(int x, int y) {
        dat[x+n-1] = y;
        int tmp = x+n-1;
        while (tmp>0) {
            tmp = (tmp-1)/2;
            dat[tmp] = Math.min(dat[tmp*2+1], dat[tmp*2+2]);
        }
    }

    static int query(int a, int b, int k, int l, int r) {
        if (a<=l && r<=b) return dat[k];
        if (b<=l || r<=a) return INF;
        int lv = query(a, b, 2*k+1, l, (l+r)/2);
        int rv = query(a, b, 2*k+2, (l+r)/2, r);
        return Math.min(lv, rv);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_ = sc.nextInt();
        n = 1;
        while (n<n_) n*=2;
        dat = new int[2*n-1];
        Arrays.fill(dat, INF);
        int q = sc.nextInt();
        for (int i=0;i<q;i++) {
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (com==0) {
                update(x, y);
            } else { // com==1
                System.out.println(query(x, y+1, 0, 0, n));
            }
        }
    }
}
