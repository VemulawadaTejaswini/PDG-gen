
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long m = Long.parseLong(scan.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(scan.next());
            a[i] /= 2;
        }
        scan.close();

        long lcm = a[0];
        for (int i = 1; i < n; i++) {
            lcm *= a[i] / gcd(lcm, a[i]);
            if (lcm > m) {
                System.out.println(0);
                return;
            }
        }

        long twoCount = twoCount(a[0]);
        for (int i = 1; i < n; i++) {
            long twoCountI = twoCount(a[i]);
            if (twoCountI != twoCount) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1 + (m - lcm) / (lcm * 2));
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    private static long twoCount(long a) {
        long count = 0;
        while (a % 2 == 0) {
            a /= 2;
            count++;
        }
        return count;
    }

}
