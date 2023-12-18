import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int sum =0;
        for (int i = 0; i < n + 1; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] <= b[i]) {
                b[i] -= a[i];
                a[i] = 0;
            } else {
                a[i] -= b[i];
                b[i] = 0;
            }

            a[i+1] -= b[i];
            if (a[i+1] < 0) {
                a[i+1] = 0;
            }
        }
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum2 += a[i];
        }
        System.out.println(sum - sum2);
    }
}
