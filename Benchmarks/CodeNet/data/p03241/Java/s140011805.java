import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long ans = 0;
        for (long i = 2; i <= N; i++) {
            if (M % i == 0 && M / i >= N) {
                ans = i;
            }
            if (M / i < N) {
                break;
            }
        }
        System.out.println(ans);
    }
}