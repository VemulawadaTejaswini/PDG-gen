import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mod = (int)1e9 + 7;

        if (Math.abs(m-n) > 1) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
            ans %= mod;
        }
        for (int i = 2; i <= m; i++) {
            ans *= i;
            ans %= mod;
        }
        System.out.println(n == m ? 2 * ans % mod: ans);
    }

}