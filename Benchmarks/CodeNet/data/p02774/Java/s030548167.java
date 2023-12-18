import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        long INF = 1000_000_001L * 1000_000_001L;
        long l = -INF;
        long r = INF;
        while (r - l > 1) {
            long c = (l + r) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                int L = -1;
                int R = n;
                if (a[i] < 0) {
                    while (R - L > 1) {
                        int C = (L + R) / 2;
                        if ((long)a[i] * a[C] < c) R = C;
                        else L = C;
                    }
                    cnt += n - R;
                } else {
                    while (R - L > 1) {
                        int C = (L + R) / 2;
                        if ((long)a[i] * a[C] < c) L = C;
                        else R = C;
                    }
                    cnt += L + 1;
                }
                if ((long)a[i] * a[i] < c) cnt--;
            }
            cnt /= 2;
            if (cnt < k) l = c;
            else r = c;
        }
        System.out.println(l);
    }
}