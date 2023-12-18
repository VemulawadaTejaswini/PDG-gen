
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
            long tmp1 = a[i];
            long tmp2 = a[i + 1];
            a[i] = b[i] >= a[i] ? 0 : a[i] - b[i];
            long remainB = b[i] >= tmp1 ? b[i] - tmp1 : 0;
            a[i + 1] = remainB >= a[i + 1] ? 0 : a[i + 1] - remainB;
            b[i] = tmp1 + tmp2 >= b[i] ? 0 : b[i] - tmp1 - tmp2;
            count += current;
        }
        System.out.println(count);
    }
}
