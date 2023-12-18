import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long K = scan.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long sum = Arrays.stream(A).sum();
        long[][] diff = new long[40][2];
        for (int i = 39; 0 <= i; i--) {
            long mask = 1L << i;
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (0 < (A[j] & mask)) {
                    count += 1;
                }
            }
            diff[i][0] = 0;
            diff[i][1] = (N - 2 * count) * pow(i);
        }
        boolean found = false;
        long max_diff = 0;
        long current_diff = 0;
        for (int i = 39; 0 <= i; i--) {
            long mask = 1L << i;
            if (0 < (K & mask)) {
                found = true;
            }
            if (!found) {
                continue;
            }
            // i桁目を0にする場合
            long t = 0;
            for (int j = i - 1; 0 <= j; j--) {
                t += Math.max(t, diff[j][1]);
            }
            max_diff = Math.max(max_diff, current_diff + t);
            // i桁目を1にする場合
            if (0 < (K & mask)) {
                current_diff += diff[i][1];
            }
        }
        System.out.println(sum + Math.max(current_diff, max_diff));
    }
    private long pow(int N) {
        if (N == 0) {
            return 1;
        }
        if (N % 2 == 1) {
            return 2 * pow(N-1);
        }
        long x = pow(N / 2);
        return x * x;
    }
}
