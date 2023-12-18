import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long X = scan.nextInt();
        long Y = scan.nextInt();
        long lcm = X * Y / gcd(X, Y);
        if (lcm == X || lcm == Y) {
            System.out.println(-1);
            return;
        }
        for (int i = 1; true; i++) {
            long ans = X * i;
            if (ans % lcm == 0) {
                continue;
            }
            if (ans % Y == 0) {
                continue;
            }
            System.out.println(ans);
            return;
        }
    }
    private long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
