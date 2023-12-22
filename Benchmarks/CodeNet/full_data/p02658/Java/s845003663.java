
import java.util.Scanner;

public class Main {

    static long inf = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(scan.next());
        }
        scan.close();

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        long ans = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] > inf / ans) {
                System.out.println(-1);
                return;
            }

            ans *= a[i];
            if (ans > 1000000000000000000L) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }

}
