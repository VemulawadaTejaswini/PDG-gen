import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] t = S.toCharArray();
        int N = t.length;
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = t[i] - '0';
        }
        long[] sum = new long[N+1];
        long[] sum_mod = new long[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1] + d[i-1];
            sum_mod[i] = sum_mod[i-1]*10 + d[i-1];
            sum_mod[i] %= 2019;
        }
        long[] inv = new long[N+1];
        inv[0] = 1;
        for (int i = 1; i <= N; i++) {
            inv[i] = inv[i-1] * 10;
            inv[i] %= 2019;
        }

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                if ((sum[j]-sum[i-1]) % 3 != 0) {
                    continue;
                }
                if ((sum_mod[j] + 2019 - (sum_mod[i-1] * inv[j-i+1] % 2019)) % 2019 == 0) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
