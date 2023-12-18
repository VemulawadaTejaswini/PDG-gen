import java.util.Scanner;

public class Main {
    private static long[] add(long[] a, long add) {
        long[] res = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        res[0] += add;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            boolean isZero = (a[0] == 0);
            long ans = Long.MAX_VALUE;

            if ( isZero ) {
                long[] ta = add(a, 1);
                ans = Math.min(ans, solve(ta));

                ta = add(a, -1);
                ans = Math.min(ans, solve(ta));
            } else {
                ans = Math.min(ans, solve(a));

                long[] ta = add(a, -a[0] + (a[0] < 0 ? 1 : -1));
                ans = Math.min(ans, solve(ta));
            }

            System.out.println(ans);
        }
    }

    private static long solve(long[] a) {
        long res = 0;
        long sum = a[0];
        boolean isPositive = sum > 0;

        for (int i = 1; i < a.length; i++) {
            isPositive = !isPositive;
            sum += a[i];
            if ( isPositive && sum <= 0 ) {
                res += Math.abs(sum) + 1;
                sum = 1;
            } else if ( !isPositive && sum >= 0 ) {
                res += Math.abs(sum) + 1;
                sum = -1;
            }
        }

        return res;
    }
}
