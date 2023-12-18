
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int n;
    long ga, sa, ba;
    long gb, sb, bb;
    ArrayList<P> pab = new ArrayList<>();
    ArrayList<P> pba = new ArrayList<>();

    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ga = sc.nextLong();
        sa = sc.nextLong();
        ba = sc.nextLong();
        gb = sc.nextLong();
        sb = sc.nextLong();
        bb = sc.nextLong();

        if (ga < gb) {
            pab.add(new P(ga, gb));
        } else {
            pba.add(new P(ga, gb));
        }

        if (sa < sb) {
            pab.add(new P(sa, sb));
        } else {
            pba.add(new P(sa, sb));
        }

        if (ba < bb) {
            pab.add(new P(ba, bb));
        } else {
            pba.add(new P(ba, bb));
        }

        if (pab.size() == 3) {
            long max = n;
            for (long gcnt = 0; gcnt <= n; gcnt++) for (long scnt = 0; scnt <= n - gcnt; scnt++) {
                long bcnt = n - gcnt - scnt;
                long gd = gcnt  + (gcnt / ga) * (gb - 1);
                long sd = scnt  + (scnt / sa) * (sb - 1);
                long bd = bcnt  + (bcnt / ba) * (bb - 1);
                max = Math.max(max, gd + sd + bd);
            }

            System.out.println(max);
        } else if (pab.size() == 2) {
            long max = n;
            for (long cnt1 = 0; cnt1 <= n; cnt1++) {
                long cnt2 = n - cnt1;
                long d1 = cnt1 + (cnt1 / pab.get(0).a) * (pab.get(0).b - 1);
                long d2 = cnt2 + (cnt2 / pab.get(1).a) * (pab.get(1).b - 1);
                max = Math.max(max, d1 + d2);
            }

            System.out.println(max + (max / pba.get(0).b) * (pba.get(0).a - 1));
        } else if (pab.size() == 1) {
            long max = n + (n / pab.get(0).a) * (pab.get(0).b - 1);
            long ans = max;
            for (long cnt1 = 0; cnt1 <= max; cnt1++) {
                long cnt2 = max - cnt1;
                long d1 = cnt1 + (cnt1 / pba.get(0).b) * (pba.get(0).a - 1);
                long d2 = cnt2 + (cnt2 / pba.get(1).b) * (pba.get(1).a - 1);
                ans = Math.max(ans, d1 + d2);
            }

            System.out.println(ans);
        } else {
            long max = n;
            for (long gcnt = 0; gcnt <= n; gcnt++) for (long scnt = 0; scnt <= n - gcnt; scnt++) {
                long bcnt = n - gcnt - scnt;
                long gd = gcnt  + (gcnt / gb) * (ga - 1);
                long sd = scnt  + (scnt / sb) * (sa - 1);
                long bd = bcnt  + (bcnt / bb) * (ba - 1);
                max = Math.max(max, gd + sd + bd);
            }

            System.out.println(max);
        }
    }

    class P implements Comparable<P> {
        long a, b, d;
        P(long a, long b) {
            this.a = a;
            this.b = b;
            d = b - a;
        }

        @Override
        public int compareTo(P o) {
            return (o.d - d) > 0 ? 1 : -1;
        }

        @Override
        public String toString() {
            return a + " " + b;
        }
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
