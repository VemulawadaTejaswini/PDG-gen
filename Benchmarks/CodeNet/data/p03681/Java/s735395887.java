import java.util.Scanner;

public class Main {

    public static final int MOD = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        if (Math.abs(n - m) >= 2) {
            System.out.println(0);
        } else if (n == m) {
            long ans = factorial(n) * factorial(m) * 2 % MOD;
            System.out.println(ans);
        } else {
            long ans = factorial(n) * factorial(m) % MOD;
            System.out.println(ans);
        }
    }

    private static long factorial(long n) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i % MOD;
        }
        return ans;
    }
}