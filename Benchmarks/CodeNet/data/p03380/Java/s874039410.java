import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        Arrays.sort(a);
        long ans = Long.MAX_VALUE;
        for (int i = n-2; i >=0; i--) {
            long r = combi(max, a[i]);
            if (ans >r) {
                ans = r;
                continue;
            } else {
                System.out.println(max + " " + a[i]);
                return;
            }
        }
    }

    long combi(long n, long r) {
        int i;
        long p = 1;
        for (i = 1; i <= r; i++) {
            p = p * (n - i + 1) / i;
        }
        return p;
    }
}