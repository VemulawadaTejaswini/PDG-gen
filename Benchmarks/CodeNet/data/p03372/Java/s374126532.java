import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long c = sc.nextLong();
        long x[] = new long[n + 2];
        long v[] = new long[n + 2];
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        x[n + 1] = c;

        long left[] = new long[n + 1];
        long right[] = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            left[i] = left[i - 1] + v[i] - x[i] + x[i - 1];
            right[i] = right[i - 1] + v[n - i + 1] - x[n - i + 2] + x[n - i + 1];
        }

        long maxLeft[] = new long[n + 1];
        long maxRight[] = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], left[i]);
            maxRight[i] = Math.max(maxRight[i - 1], right[i]);
        }

        long max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, left[i]);
            max = Math.max(max, left[i] - x[i] + maxRight[n - i]);
            max = Math.max(max, right[i]);
            max = Math.max(max, right[i] - c + x[n - i + 1] + maxLeft[n - i]);
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
