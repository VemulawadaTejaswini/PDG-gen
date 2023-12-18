import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        long[] cnt = new long[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
            cnt[d[i]]++;
        }

        long MOD = 998244353;
        if (cnt[0] != 1) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                ans *= cnt[i - 1];
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }

}
