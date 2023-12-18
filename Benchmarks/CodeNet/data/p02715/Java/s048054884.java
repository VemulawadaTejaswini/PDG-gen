import java.util.*;

public class Main{
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] counts = new long[k + 1];
        long total = 0;
        for (int i = k; i >= 1; i--) {
            long value = pow(k / i, n);
            for (int j = 2; j * i <= k; j++) {
                value -= counts[j * i];
                value += MOD;
                value %= MOD;
            }
            counts[i] = value;
            total += value * i;
            total %= MOD;
        }
        System.out.println(total);
    }
    
    static long pow(long base, int p) {
        if (p == 0) {
            return 1;
        }
        long ans = pow(base, p / 2);
        ans *= ans;
        ans %= MOD;
        if (p % 2 == 1) {
            ans *= base;
            ans %= MOD;
        }
        return ans;
    }
}