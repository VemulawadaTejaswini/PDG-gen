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

        double[] aruiseki = new double[n];
        double[] bruiseki = new double[m];
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
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            bruiseki[i] = b[i] + (i == 0 ? 0 : bruiseki[i - 1]);
            if (bruiseki[i] <= k) {
                bMaxIndex = i;
            }
        }
        if (aMaxIndex >= 0) {
            int ans = 0;
            for (int i = 0; i <= aMaxIndex; i++) {
                double t = k - aruiseki[i];
                int lowerBound = -(Arrays.binarySearch(bruiseki, t - 0.1)) - 1;
                if (lowerBound == m) {
                    lowerBound--;
                }
                while (bruiseki[lowerBound] > t) {
                    lowerBound--;
                    if (lowerBound == - 1) {
                        break;
                    }
                }
                if (lowerBound >=0 && bruiseki[lowerBound] <= t) {
                    ans = Math.max(ans, i + lowerBound + 2);
                }
            }
            System.out.println(ans);
        } else {
            System.out.println(bMaxIndex == - 1 ? 0 : bMaxIndex + 1);
        }
    }
}