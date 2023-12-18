import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int K = ni();
        long[] A = nlarr(K);

        long over = 2;
        long under = 3;
        for (int i = K - 1; i >= 0; i--) {
            if (over % A[i] != 0) {
                over = (over / A[i] + 1) * A[i];
            }

            if (under % A[i] != 0) {
                under = (under / A[i] + 1) * A[i];
            }

            if (over >= under) {
                out.println("-1");
                return;
            }
        }

        out.println(over + " " + (under - 1));
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