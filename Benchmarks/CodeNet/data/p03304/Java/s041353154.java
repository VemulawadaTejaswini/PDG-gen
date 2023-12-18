import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        double ans = (m - 1) * (n - d) * 2;
        if (d == 0) {
            ans = (m - 1) * (n - d);
        }
        System.out.println(ans / Math.pow(n, 2));
    }
}