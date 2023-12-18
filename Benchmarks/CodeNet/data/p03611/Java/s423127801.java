import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test main = new test();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] X = new int[1_000_00];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
            X[a[i]]++;
        }
        int res = 0;
        for (int i = 0; i < 1_000_00; i++) {
            if (i != 0 && i != 1_000_00 - 1) {
                res = Math.max(res, X[i - 1] + X[i] + X[i + 1]);
            }
            if (i == 0) {
                res = Math.max(res, X[0] + X[1]);
            }
            if (i == 1_000_00 - 1) {
                res = Math.max(res, X[1_000_00 - 1] + X[1_000_00 - 1 - 1]);
            }
        }
        System.out.println(res);

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
