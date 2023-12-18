import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = Long.MAX_VALUE;
        long n, k;
        long[] x = new long[100005];

        n = sc.nextLong();
        k = sc.nextLong();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }

        for (int i = 0; i < n - k + 1; i++) {
            int l = i;
            int r = i + (int)k - 1;
            long tmp = x[r] - x[l];

            if (x[l] < 0 && x[r] > 0) {
                tmp += Math.min(x[r], Math.abs(x[l]));
            }
            else if (x[l] > 0) {
                tmp += x[l];
            }
            else if (x[r] < 0) {
                tmp += Math.abs(x[r]);
            }

            ans = Math.min(ans, tmp);
        }

        System.out.println(ans);
    }
}
