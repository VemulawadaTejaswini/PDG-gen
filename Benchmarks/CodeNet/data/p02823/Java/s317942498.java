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
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long diff = B - A;
        long ans = Long.MAX_VALUE;
        if (diff % 2 == 0) {
            ans = Math.min(ans, diff / 2);
            ans = Math.min(N - A, ans);
            ans = Math.min(B - 1, ans);
        } else {
            ans = Math.min(N - A, ans);
            ans = Math.min(B - 1, ans);
            long x = Math.min(A - 1, N - B) + 1 + (B - A - 1) / 2;
            ans = Math.min(x, ans);
        }
        System.out.println(ans);
    }
}
