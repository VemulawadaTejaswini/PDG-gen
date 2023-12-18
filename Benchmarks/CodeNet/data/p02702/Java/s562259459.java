
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

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
        int[] sum_mod = new int[N+1];
        int ten_pow = 1;
        for (int i = 1; i <= N; i++) {
            int temp = d[N - i] * ten_pow;
            temp %= 2019;
            sum_mod[i] = sum_mod[i-1] + temp;
            sum_mod[i] %= 2019;
            ten_pow *= 10;
            ten_pow %= 2019;
        }
        int[] summary = new int[2019];
        for (int i = 0; i <= N; i++) {
            summary[sum_mod[i]] += 1;
        }
        long ans = 0;
        for (int i = 0; i < 2019; i++) {
            if (summary[i] < 2) {
                continue;
            }
            ans += summary[i] * (summary[i] - 1) / 2;
        }
        System.out.println(ans);
    }
}
