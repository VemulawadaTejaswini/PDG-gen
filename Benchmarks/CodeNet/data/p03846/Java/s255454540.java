import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final long MOD = 1000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        if (n % 2 == 1 && a[0] != 0) {
            System.out.println(0);
            return;
        }

        int now = n % 2 + 1;
        int i = n % 2;
        while (i < n) {
            if (a[i] == a[i + 1] && a[i] == now) {
                i += 2;
                now += 2;
                continue;
            } else {
                System.out.println(0);
                return;
            }
        }

        long ans = 1;
        for (int j = 0; j < n / 2; j++) {
            ans = modmul(ans, 2, MOD);
        }

        System.out.println(ans);
    }

    static long modmul(long a, long b, long mod) {
        return (a * b) % mod;
    }
}