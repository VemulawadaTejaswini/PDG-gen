
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int range = 2 * 100000;

        // -rangeが起点
        int[] diff = new int[range * 2 + 5];
        int[] sum = new int[range * 2 + 5];
        for (int i = 1; i <= n; i++) {
            if (a[i] > 2 * 100000) {
                continue;
            }
            diff[i - a[i] + range]++;
            sum[i + a[i] + range]++;
        }

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += sum[i - a[i] + range];
            ans += diff[i + a[i] + range];
        }

        System.out.println(ans / 2);
    }
}
