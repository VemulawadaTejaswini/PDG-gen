import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[m+1];
        long[] aSum = new long[n+1];
        long[] bSum = new long[m+1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            aSum[i] = a[i] + aSum[i-1];
        }

        for (int i = 1; i <= m; i++) {
            b[i] = sc.nextInt();
            bSum[i] += b[i] + bSum[i-1];
        }

        int ans = 0;
        int bCount = m;
        // Aをi冊読むとき
        for (int aCount = 0; aCount <= n; aCount++) {
            if (aSum[aCount] > k) {
                continue;
            }

            for (; bCount >= 0; bCount--) {
                if (aSum[aCount] + bSum[bCount] <= k) {
                    ans = max(ans, aCount + bCount);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
