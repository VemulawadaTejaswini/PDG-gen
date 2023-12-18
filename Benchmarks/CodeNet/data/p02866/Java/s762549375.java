import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        long[] cnt = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            d[i] = sc.nextInt();
            cnt[d[i]]++;
        }

        if (d[1] != 0) {
            System.out.println(0);
            return;
        }
        long MOD = 998244353;
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            long j = 0;
            while (j < cnt[i]) {
                ans *= cnt[i - 1];
                ans %= MOD;
                j++;
            }
        }
        System.out.println(ans);
    }

}
