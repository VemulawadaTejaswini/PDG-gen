import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[N];
        int[] x = new int[N + 1];
        int All = Integer.MAX_VALUE;
        int s = 0;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            if (x[s] <= 0 && Math.abs(x[s]) > Math.abs(x[i])) {
                s = i;
            }
        }
        if (s == 0) {
            System.out.println(x[s + (K - 1)]);
            return;
        }
        if (s == N - 1) {
            System.out.println(Math.abs(x[s - (K - 1)]));
            return;
        }
        int g;
        if (s + 1 - K > 0) {
            g = s + 1 - K;
        } else {
            g = 0;
        }
        for (int i = g; x[i] <= 0; i++) {
            if (N - i < K) {
                break;
            }
            int c = Math.abs(x[i]);
            int n = K - (s + 1 - i);
            if (n != 0) {
                c += 2 * x[s + n];
            }
            All = Math.min(All, c);
        }
        if (N - 1 - s > K) {
            g = N - 1 - s;
        } else {
            g = N - 1;
        }
        for (int i = g; x[i] >= 0; i--) {
            if (i < K - 1) {
                break;
            }
            int c = x[i];
            int n = K - (i - s);
            if (n != 0) {
                c += 2 * Math.abs(x[s - (n - 1)]);
            }
            All = Math.min(All, c);
        }
        System.out.println(All);
    }
}
