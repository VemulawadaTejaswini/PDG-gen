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
        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            sum += A[i];
        }
        long[] s = new long[N+1];
        for (int i = 0; i < N; i++) {
            s[i+1] = s[i] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, Math.abs(sum-s[i]-s[i]));
        }
        System.out.println(ans);
    }
}
