import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n+2];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            sum += Math.abs(a[i-1] - a[i]);

        }
        sum += Math.abs(0 - a[n]);

        for (int i = 1; i <= n; i++) {
            int p = check(a[i-1], a[i], a[i-+1]);
            if (p == 1) {
                System.out.println(sum);
            } else {
                int tmp = sum;
                tmp -= (Math.abs(a[i] - a[i-1]) + Math.abs(a[i] - a[i+1]));
                tmp += Math.abs(a[i+1] - a[i-1]);
                System.out.println(tmp);
            }
        }
    }

    private static int check(int prev, int cur, int next) {
        if ((prev <= cur && cur <= next) || (next <= cur && cur <= prev)) {
            return 1;
        }
        if ((cur <= prev && prev <= next) || (next <= prev && prev <= cur)) {
            return 2;
        }
        return 3;
    }
}