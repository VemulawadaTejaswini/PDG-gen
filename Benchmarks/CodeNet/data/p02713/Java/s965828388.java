import java.util.*;
import java.math.*;

public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    // static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int tmp = gcd(i,j);
                for (int k = 1; k <= n; k++) {
                    ans += gcd(tmp,k);
                }
            }
        }
        System.out.println(ans);
    }

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
