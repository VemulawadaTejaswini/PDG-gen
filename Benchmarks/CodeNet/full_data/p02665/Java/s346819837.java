import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N + 1];
        Arrays.setAll(A, $ -> sc.nextInt());
        if (N == 0) {
            System.out.println(A[0] == 1 ? 1 : -1);
            return;
        }
        if (!possible(A, N)) {
            System.out.println(-1);
            return;
        }
        int lo = 0;
        int up = N;
        while (up - lo > 1) {
            final int x = (lo + up + 1) / 2;
            if (possible(A, x))
                up = x;
            else
                lo = x;
        }
        final int x = (lo + up + 1) / 2;
        System.err.println(x);
        long ans = 0;
        long nodes = 0;
        for (int i = N; i > x; i--) {
            nodes += A[i];
            ans += nodes;
        }
        for (int i = x; i >= 0; i--) {
            nodes = (nodes + 1) / 2;
            nodes += A[i];
            ans += nodes;
        }
        System.out.println(ans);
    }

    static boolean possible(final int[] A, final int p) {
        long lo = 0;
        for (int i = p + 1; i < A.length; i++)
            lo += A[i];
        long up = 1;
        for (int i = 0; i <= p; i++) {
            up -= A[i];
            if (up < 0) {
                return false;
            }
            up *= 2;
        }
        return up >= lo;
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
