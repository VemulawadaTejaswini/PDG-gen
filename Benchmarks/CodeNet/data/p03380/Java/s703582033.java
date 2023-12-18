import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(9);
        int a[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long r = combi(max, a[i]);
            if (ans < r) {
                ans = r;
                continue;
            } else {
                System.out.println(max + " " + a[i - 1]);
                return;
            }
        }
    }

    long combi(int n, int r) {
        int i;
        long p = 1;
        for (i = 1; i <= r; i++) {
            p = p * (n - i + 1) / i;
        }
        return p;
    }
}