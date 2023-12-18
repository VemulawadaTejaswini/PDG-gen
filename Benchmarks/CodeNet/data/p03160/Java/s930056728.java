
import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;
    int[] h;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        System.out.println(flog(N - 1));
    }

    int flog(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1) {
            return flog(i - 1) + Math.abs(h[i - 1] - h[i]);
        }
        return Math.min(flog(i - 1) + Math.abs(h[i - 1] - h[i]), flog(i - 2) + Math.abs(h[i - 2] - h[i]));
    }
}