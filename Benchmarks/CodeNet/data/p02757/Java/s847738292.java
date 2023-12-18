import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int P = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        if (10 % P == 0) {
            long ans = 0;
            for (int i = N - 1; 0 <= i; i--) {
                if ((d[i]-'0') % P != 0) {
                    continue;
                }
                ans += (i+1);
            }
            System.out.println(ans);
            return;
        }
        long base = 1;
        int ten_mod = 10 % P;
        long[] data = new long[N];
        for (int i = N-1; 0 <= i; i--) {
            int x = (d[i] - '0') % P;
            long y = (x * base) % P;
            data[i] = y;
            base *= ten_mod;
            base %= P;
        }
        long[] dp = new long[N + 1];
        dp[N] = 0;
        for (int i = N-1; 0 <= i; i--) {
            dp[i] = dp[i+1] + data[i];
            dp[i] %= P;
        }
        HashMap<Long, Long> summary = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            long count = summary.getOrDefault(dp[i], 0L);
            summary.put(dp[i], count+1);
        }
        long ans = 0;
        for (long key : summary.keySet()) {
            long count = summary.get(key);
            ans += count * (count - 1)/2;
        }
        System.out.println(ans);
    }
}
