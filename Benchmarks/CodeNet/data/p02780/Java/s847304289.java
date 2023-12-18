import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
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
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = scan.nextInt();
        }
        int [] e = new int[N];
        for (int i = 0; i < N; i++) {
            e[i] = p[i] + 1;
        }
        int[] sum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i-1] + e[i-1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = K; i <= N; i++) {
            max = Math.max(max, sum[i] - sum[i - K]);
        }
        double ans = (double) max / 2;
        System.out.printf("%.9f\n", ans);
    }
}
