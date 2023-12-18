import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        long K = sc.nextInt();
        long[] a = new long[N];
        a[0] = sc.nextLong();
        for (int i = 1; i < N; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int len = 0; len < N - i; len++) {
                if (i == 0) {
                    if (a[i + len] / (len + 1) >= K)
                        ans++;
                }
                else if (a[i + len] - a[i - 1] / (len + 1) >= K) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}