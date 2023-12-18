import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int A = ni();
        int B = ni();

        int ans = 0;
        if (A > B) {
            ans = 2 * A - 1;
        } else if (A == B) {
            ans = A + B;
        } else {
            ans = 2 * B - 1;
        }

        out.print(ans);
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
