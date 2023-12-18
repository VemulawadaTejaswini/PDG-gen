import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long A = nl();
        long B = nl();
        long C = nl();

        long diff = Long.MAX_VALUE;

        diff = Math.min(diff, (long) (Math.ceil(A / 2.0) - Math.floor(A / 2.0)) * B * C);
        diff = Math.min(diff, (long) (Math.ceil(B / 2.0) - Math.floor(B / 2.0)) * A * C);
        diff = Math.min(diff, (long) (Math.ceil(C / 2.0) - Math.floor(C / 2.0)) * B * A);

        out.println(diff);
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}