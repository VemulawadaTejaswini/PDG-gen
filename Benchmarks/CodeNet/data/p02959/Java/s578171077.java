
import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n + 1];
        long [] b = new long[n];
        for (int i = 0; i < n + 1; ++i) {
            a[i] = scanner.nextLong();
        }
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextLong();
        }
        long count = 0;
        for (int i = 0; i < n; ++i) {
            long current = Math.min(a[i] + a[i + 1], b[i]);
            long tmp = a[i];
            a[i] = b[i] >= a[i] ? 0 : a[i] - b[i];
            b[i] = b[i] >= tmp ? b[i] - tmp : 0;
            count += current;
        }
        System.out.println(count);
    }
}
