import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }

    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        int max = A[N-1];
        boolean[] dp = new boolean[max+1];
        Arrays.fill(dp, true);
        for (int i = 0; i < N; i++) {
            if (dp[A[i]] == false) {
                continue;
            }
            for (int j = 2; A[i] * j <= max; j++) {
                dp[A[i]*j] = false;
            }
        }
        for (int i = 1; i < N; i++) {
            if (A[i-1] == A[i]) {
                dp[A[i]] = false;
            }
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (dp[A[i]]) {
                a += 1;
            }
        }
        System.out.println(a);
    }
}
