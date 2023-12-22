import java.util.*;

public class Main {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        long asum[] = new long[n];
        long bsum[] = new long[m];

        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();

            if (i==0) {
                asum[i] = a[i];
            } else {
                asum[i] = asum[i-1] + a[i];
            }
        }
        for (int i = 0; i<m; i++) {
            b[i] = scan.nextInt();

            if (i==0) {
                bsum[i] = b[i];
            } else {
                bsum[i] = bsum[i-1] + b[i];
            }
        }

        int sum = 0;

        for (int i=0; i<n; i++) {

            if (asum[i] >k) {
                continue;
            } else {

                for (int j = 0; j < m; j++) {

                    if (bsum[j] > k) {
                        continue;
                    }

                    if (asum[i] + bsum[j] <= k) {
                        sum = Math.max(sum, i + j + 2);
                    }
                }
            }
        }

        System.out.println(sum);

    }
}
