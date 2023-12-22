import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 机Aの本の数
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        long[] asum = new long[n + 1];

        // 机Bの本の数
        int m = sc.nextInt();
        int[] b = new int[m + 1];
        long[] bsum = new long[m + 1];

        // 許容時間
        long k = sc.nextLong();
        int ans = 0;

        int aMaxIndex = 0;
        long tmp = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            tmp += a[i];
            asum[i] = tmp;

            if (asum[i] <= k) {
                aMaxIndex = i + 1;
                ans = i + 1;
            }
        }

        int bMaxIndex = 0;
        tmp = 0;
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            tmp += b[i];
            bsum[i] = tmp;

            if (tmp <= k) {
                bMaxIndex = i + 1;
                ans = Math.max(ans, i + 1);
            }
        }

        if ((asum[n - 1] + bsum[m - 1]) > k) {
            for (int i = 0; i < aMaxIndex; i++) {
                for (int j = 0; j < bMaxIndex; j++) {
                    if (asum[i] + bsum[j] <= k) {
                        ans = Math.max(ans, (i + 1) + (j + 1));
                    } else {
                        break;
                    }
                }
            }
        } else {
            ans = n + m;
        }

        System.out.println(ans);
    }
}
