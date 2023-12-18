
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long m = Long.parseLong(scan.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(scan.next());
        }
        scan.close();

        long lcm = a[0];
        for (int i = 1; i < n; i++) {
            lcm *= a[i] / gcd(lcm, a[i]);
            if (lcm / 2 > m) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1 + (m - lcm / 2) / lcm);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

}
