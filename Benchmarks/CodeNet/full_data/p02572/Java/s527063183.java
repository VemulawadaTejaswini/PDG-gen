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
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long mod = 1000000007;
        long[] sum = new long[N+1];
        for (int i = 0; i < N; i++) {
            sum[i + 1] = sum[i] + A[i];
            sum[i + 1] %= mod;
        }
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            long t1 = sum[N] - sum[i+1];
            t1 = (t1 + mod) % mod;
            long t2 = A[i] * t1;
            t2 %= mod;
            ans += t2;
            ans %= mod;
        }
        System.out.println(ans);
    }
}
