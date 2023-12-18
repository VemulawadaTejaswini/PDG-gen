import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] b = new long[n + 1];
        long[] w = new long[n + 1];
        long sum = 0;
        long m = Long.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            if (a < 0) {
                b[i] = b[i - 1] - a;
            } else {
                w[i] = w[i -  1] + a;
                sum += a;
            }
            if (i >= k) {
                m = Math.min(m, Math.min(b[i] - b[i - k], w[i] - w[i - k]));
            }
        }
        System.out.println(sum - m);
    }
}