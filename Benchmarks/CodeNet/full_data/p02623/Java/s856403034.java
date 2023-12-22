import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[m];

        long[] aruiseki = new long[n];
        long[] bruiseki = new long[m];
        int aMaxIndex = - 1;
        int bMaxIndex = - 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            aruiseki[i] = a[i];
            if (i > 0) {
                aruiseki[i] += aruiseki[i - 1];
            }
            if (aruiseki[i] <= k) {
                aMaxIndex = i;
            }
        }
        long aMaxAmari = aMaxIndex == - 1 ? k : k - aruiseki[aMaxIndex];
        int bStart = -1;
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            bruiseki[i] = b[i];
            if (i > 0) {
                bruiseki[i] += bruiseki[i - 1];
            }
            if (bruiseki[i] <= k) {
                bMaxIndex = i;
            }
            if (bruiseki[i] <= aMaxAmari) {
                bStart = i;
            }
        }

        if (aMaxIndex >= 0) {
            int ans = aMaxIndex + 1;
            if (bStart >= 0) {
                ans += bStart + 1;
            } else {
                bStart = 0;
            }
            for (int i = aMaxIndex - 1; i >= 0; i--) {
                long v = k - aruiseki[i];
                while (bStart < m && bruiseki[bStart] <= v) {
                    bStart++;
                }
                bStart--;
                ans = Math.max(bStart + i + 2, ans);
            }
            System.out.println(ans);
        } else {
            System.out.println(bMaxIndex == - 1 ? 0 : bMaxIndex + 1);
        }
    }
}