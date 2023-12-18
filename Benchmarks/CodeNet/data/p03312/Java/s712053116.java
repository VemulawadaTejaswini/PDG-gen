import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long a[] = new long[n];
        long sum[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum[i + 1] = sum[i] + a[i];
        }
        long sum_n = sum[n];

        long min = Long.MAX_VALUE;
        int lp = 0;
        int rp = 2;
        for (int i = 1; i < n - 2; i++) {
            long sum_i = sum[i + 1];
            for (; lp < i; lp++) {
                if (Math.abs(sum_i - 2 * sum[lp + 1]) < Math.abs(sum_i - 2 * sum[lp + 2])) {
                    break;
                }
            }
            for (rp = ((rp == i) ? i + 1 : rp); rp < n - 1; rp++) {
                if (Math.abs(sum_n - 2 * sum[rp + 1] + sum_i) < Math.abs(sum_n - 2 * sum[rp + 2]
                    + sum_i)) {
                    break;
                }
            }

            min = Math.min(min, calc(lp, i, rp, n, sum));
        }

        System.out.println(min);
    }

    private long calc(int l, int c, int r, int n, long sum[]) {
        long s1 = sum[l + 1];
        long s2 = sum[c + 1] - sum[l + 1];
        long s3 = sum[r + 1] - sum[c + 1];
        long s4 = sum[n] - sum[r + 1];

        long min = Math.min(s1, Math.min(s2, Math.min(s3, s4)));
        long max = Math.max(s1, Math.max(s2, Math.max(s3, s4)));

        return Math.abs(max - min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
