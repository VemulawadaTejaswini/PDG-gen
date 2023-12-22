import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        long[] asum = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (i == 0) {
                asum[i] += a[i];
            } else {
                asum[i] += asum[i - 1] + a[i];
            }
        }
        long[] bsum = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
            if (i == 0) {
                bsum[i] += b[i];
            } else {
                bsum[i] += bsum[i - 1] + b[i];
            }
        }

        int aidx = 0;
        for (int i = 0; i < n; i++) {
            if (asum[i] > k) {
                break;
            }
            aidx = i;
        }
        int bidx = 0;
        for (int i = 0; i < m; i++) {
            if (bsum[i] > k) {
                break;
            }
            bidx = i;
        }
        int ans = 0;
        int j = 0;
        for (int i = aidx; i >= 0; i--) {
            while (j < bidx && asum[i] + bsum[j + 1] <= k) {
                j++;
            }
            if (j >= bidx && asum[i] + bsum[j] > k) {
                break;
            }
            ans = Math.max(i + j + 2, ans);
        }
        System.out.println(ans);
    }

}
