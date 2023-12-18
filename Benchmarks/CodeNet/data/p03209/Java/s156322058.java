import java.util.*;

public class Main {
    public static void main(String[] arg) {
        long N, X;
        Scanner scan = new Scanner(System.in);
        N = scan.nextLong();
        X = scan.nextLong();
        long[] a = new long[(int)N + 1];
        long[] p = new long[(int)N + 1];
        a[0] = 1;
        p[0] = 1;

        for (int i = 1; i <= N; i++) {
            a[i] = 2 * a[i - 1] + 3;
            p[i] = 2 * p[i - 1] + 1;
        }
        scan.close();
        System.out.println(f(N, X, a, p));
    }

    private static long f(long N, long X, long[] a, long[] p) {
        if (X == 1) {
            return N == 0 ? 1 : 0;
        }
        else if (X <= 1 + a[(int)N - 1]) {
            return f(N - 1, X - 1, a, p);
        }
        else if (X == 2 + a[(int)N - 1]) {
            return p[(int)N - 1] + 1;
        }
        else if (X <= 2 + 2 * a[(int)N - 1]) {
            return p[(int)N - 1] + 1 + f(N - 1, X - 2 - a[(int)N - 1], a, p);
        }
        else {
            return 2 * p[(int)N - 1] + 1;
        }
    }
}