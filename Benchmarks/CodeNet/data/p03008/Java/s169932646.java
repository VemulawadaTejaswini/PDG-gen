
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int n;
    long ga, sa, ba;
    long gb, sb, bb;
    P[] ps;


    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ga = sc.nextLong();
        sa = sc.nextLong();
        ba = sc.nextLong();
        gb = sc.nextLong();
        sb = sc.nextLong();
        bb = sc.nextLong();

        ps = new P[3];
        ps[0] = new P(ga, gb);
        ps[1] = new P(sa, sb);
        ps[2] = new P(ba, bb);
        Arrays.sort(ps);

        debug(ps);

        int[] cs = new int[3];
        for (int i = 0; i < 3; i++) {
            if (ps[i].a < ps[i].b) {
                cs[i] += (n / ps[i].a) * ps[i].a;
                n -= cs[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            n += cs[i] * ps[i].b;
            cs[i] = 0;
        }

        for (int i = 2; i >= 0; i--) {
            if (ps[i].a > ps[i].b) {
                cs[i] += (n / ps[i].b) * ps[i].b;
                n -= cs[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            n += cs[i] * ps[i].a;
            cs[i] = 0;
        }
        System.out.println(n);
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
