import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            sum[i + 1] = sum[i] + nums[i];
        }
        long ans = 0;
        int mod = 1000000007;
        for (int i = 0; i < n - 1; i++) {
            int cur = nums[i];
            ans += ((cur % mod) * ((sum[n] - sum[i + 1]) % mod)) % mod;
            ans %= mod;
        }
        System.out.println(ans);
    }
}