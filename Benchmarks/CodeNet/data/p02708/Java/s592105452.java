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
        int N = scan.nextInt();
        int K = scan.nextInt();
        long mod = 1000000007;
        long ans = 0;
        int[] d = new int[N+1];
        for (int i = 0; i <= N; i++) {
            d[i] = i;
        }
        long[] s = new long[N+2];
        for (int i = 1; i <= N+1; i++) {
            s[i] += s[i-1] + d[i-1];
            s[i] %= mod;
        }
        for (int i = K; i <= N+1; i++) {
            ans += count(N, i, s, mod);
            ans %= mod;
        }
        System.out.println(ans);
    }
    long count(int N, int K, long[] s, long mod) {
        long min = s[K]+mod-s[0];
        min %= mod;
        long max = s[N+1]+mod-s[N+1-K];
        max %= mod;
        long t = max + mod - min;
        t %= mod;
        t += 1;
        t %= mod;
        return t;
    }
}
