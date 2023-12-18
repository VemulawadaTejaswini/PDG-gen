import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int[N];
        long ans = 0;
        long c = INF;
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
            if (c > Math.abs(A - (T - H[i]))) {
                ans = i + 1;
                c = Math.abs(A-(T - H[i]));
            }
        }
        System.out.println(ans);
    }
}