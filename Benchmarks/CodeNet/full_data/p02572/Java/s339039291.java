
import java.util.Scanner;

public class Main {

    private static int mod = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(scan.next());
        }
        scan.close();

        long[] s = new long[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + a[i];
            s[i] %= mod;
        }

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            long cumsum = s[n] - s[i + 1];
            if (cumsum < 0) {
                cumsum += mod;
            }
            long add = a[i] * cumsum;
            add %= mod;
            ans += add;
            ans %= mod;
        }

        System.out.println(ans);
    }
}
