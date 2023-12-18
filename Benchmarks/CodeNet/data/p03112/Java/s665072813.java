
import java.util.*;

public class Main {
    int a, b, q;
    long[] ss , ts;

    void run() {

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        q = sc.nextInt();

        ss = new long[a];
        ts = new long[b];

        for (int i = 0; i < a; i++) {
            ss[i] = (sc.nextLong());
        }

        for (int i = 0; i < b; i++) {
            ts[i] = (sc.nextLong());
        }

        Arrays.sort(ss);
        Arrays.sort(ts);
        debug(ss);
        debug(ts);

        for (int i = 0; i < q; i++) {
            long x = sc.nextLong();
            int sl = Math.max(0, lowerBound(ss, x));
            int tl = Math.max(0, lowerBound(ts, x));
            int su = Math.min(a - 1, sl + 1);
            int tu = Math.min(b - 1, tl + 1);
            long ans = 1L<<60;
            ans = Math.min(ans, dist(x, ss[sl], ts[tl]));
            ans = Math.min(ans, dist(x, ts[tl], ss[sl]));
            ans = Math.min(ans, dist(x, ss[su], ts[tl]));
            ans = Math.min(ans, dist(x, ts[tl], ss[su]));
            ans = Math.min(ans, dist(x, ss[sl], ts[tu]));
            ans = Math.min(ans, dist(x, ts[tu], ss[sl]));
            ans = Math.min(ans, dist(x, ss[su], ts[tu]));
            ans = Math.min(ans, dist(x, ts[tu], ss[su]));
            System.out.println(ans);
        }
    }

    long dist(long a, long b, long c) {
        return Math.abs(a - b) + Math.abs(b - c);
    }

    int lowerBound(long[] arr, long value) {
        int l = 0;
        int h = arr.length; // Not n - 1
        while (l + 1 < h) {
            int mid = (l + h) / 2;
            if (value <= arr[mid]) {
                h = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
