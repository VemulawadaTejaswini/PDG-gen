import java.util.Scanner;

public class Main {
    static long mod = 1000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;

        for(int i = k; i <= n+1; i++) {
            long l = sum(0, i-1), r = sum(n-i+1, n);
            ans += (r-l+1) % mod;
        }
        System.out.println(ans % mod);
    }

    static long sum(long l, long r) {
        return ((l + r) * (r - l + 1) / 2) % mod;
    }
}
