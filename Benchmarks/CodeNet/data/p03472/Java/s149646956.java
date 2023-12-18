import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long h = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        long amax = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            amax = Math.max(amax, a[i]);
        }
        Arrays.sort(b);
        int bcnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (amax > b[i]) {
                break;
            }
            bcnt++;
        }
        long ans = 0;
        int i = bcnt;
        while (h > 0 && i > 0) {
            h -= b[n - bcnt + i - 1];
            i--;
            ans++;
        }
        while (h > 0) {
            h -= amax;
            ans++;
        }
        System.out.println(ans);
    }

}
