import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] T = new long[N];
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            T[i] = scan.nextLong();
        }
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long[][] range = new long[N][2];
        for (int i = 0; i < N; i++) {
            range[i][0] = 0;
            range[i][1] = Long.MAX_VALUE;
        }
        range[0][0] = T[0];
        range[0][1] = T[0];
        if (A[0] < T[0]) {
            System.out.println(0);
            return;
        }
        range[N-1][0] = A[N-1];
        range[N-1][1] = A[N-1];
        if (T[N-1] < A[N-1]) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < N; i++) {
            if (T[i - 1] >= T[i]) {
                continue;
            }
            if (A[i] < T[i]) {
                System.out.println(0);
                return;
            }
            range[i][0] = T[i];
            range[i][1] = T[i];
        }
        for (int i = N-2; 0 <= i; i--) {
            if (A[i] <= A[i + 1]) {
                continue;
            }
            if (T[i] < A[i]) {
                System.out.println(0);
                return;
            }
            if (range[i][0] == range[i][1] && range[i][0] != A[i]) {
                System.out.println(0);
                return;
            }
            range[i][0] = A[i];
            range[i][1] = A[i];
        }
        for (int i = 0; i < N; i++) {
            if (range[i][0] == range[i][1]) {
                continue;
            }
            range[i][1] = Math.min(T[i], A[i]);
        }
        long ans = 1;
        for (int i = 0; i < N; i++) {
            if (range[i][0] == range[i][1]) {
                continue;
            }
            ans *= (range[i][1]-range[i][0]);
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
