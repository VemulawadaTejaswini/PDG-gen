import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong()/2;
        }
        long lcm = lcm(a);
        int count_l = 0;
        long l = lcm;
        while (l % 2 == 0) {
            l /= 2;
            count_l += 1;
        }
        for (int i = 0; i < N; i++) {
            int count_t = 0;
            while (a[i] % 2 == 0) {
                a[i] /= 2;
                count_t += 1;
            }
            if (count_l != count_t) {
                System.out.println(0);
                return;
            }
        }
        long ans = (M / lcm + 1) / 2;
        System.out.println(ans);
    }
    private long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    private long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    private long lcm(long[] a) {
        long x = a[0];
        for (int i = 0; i < a.length; i++) {
            x = lcm(a[i], x);
        }
        return x;
    }
}
