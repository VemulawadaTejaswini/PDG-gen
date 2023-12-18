import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int m = sc.nextInt();

        final long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }

        final boolean[] good = new boolean[n];
        for (int i = 0; i < n; i++) {
            good[i] = true;
        }

        for (int i = 0; i < m; i++) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            if (h[a-1] <= h[b-1]) {
                good[a-1] = false;
            }
            if (h[b-1] <= h[a-1]) {
                good[b-1] = false;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (good[i]) ans++;
        }
        System.out.println(ans);
    }
}
