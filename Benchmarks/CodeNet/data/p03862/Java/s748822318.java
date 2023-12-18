import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long x = in.nextLong();

        long[] a = new long[n+1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextLong();
        }

        long count = 0;
        for (int i = 1; i <= n; i++) {
            long sum = a[i] + a[i - 1];

            if (sum > x) {
                long t = sum - x;
                count += t;
                a[i] -= t;
            }
        }
        System.out.println(count);
    }
}
