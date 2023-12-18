
import java.util.Scanner;

public class Main {
    static Sushi[] a;
    static long c;
    static long[] vr;
    static long[] vl;
    static long[] sr;
    static long[] sl;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        c = scan.nextLong();
        a = new Sushi[n];
        vr = new long[n];
        vl = new long[n];
        for (int i = 0; i < n; i++) {
            Sushi sushi = new Sushi(scan.nextLong(), scan.nextInt());
            a[i] = sushi;
        }

        long cv = 0;
        long cx = 0;
        vr[0] = a[0].v;
        for (int i = 1; i < n; i++) {
            Sushi s = a[i];
            vr[i] = vr[i - 1] + s.v;
            cv += s.v + cx - s.x;
            sr[i] = Math.max(sr[i - 1], cv - cx);
            cx = s.x;
        }

        cv = 0;
        cx = c;
        for (int i = 1; i < n; i++) {
            Sushi s = a[n - i - 1];
            vl[i] = vl[i - 1] + s.v;
            cv += s.v - cx + s.x;
            cx = s.x;
            sl[i] = Math.max(sl[i - 1], cv - (c - cx));
        }
//
//        long max = 0;
//        for (int i = 0; i < n; i++) {
//            max = Math.max(max, sr[i]);
//            max = Math.max(max, sl[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            max = Math.max(max, vl[i] + sr[n - i - 1] - a[i].x);
//        }
//        System.out.println(max);
    }

    static class Sushi {
        long x;
        int v;

        public Sushi(long x, int v) {
            this.x = x;
            this.v = v;
        }

        public long getX() {
            return x;
        }

        public int getV() {
            return v;
        }
    }
}
