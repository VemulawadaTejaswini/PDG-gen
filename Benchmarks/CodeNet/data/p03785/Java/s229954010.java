
import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long K = sc.nextLong();
        long[] T = new long[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextLong();
        }
        Arrays.sort(T);
        long ans = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = i + 1; j < N; j++) {
                if (count + 1 <= C && T[j] <= T[i] + K) {
                    count++;
                } else {
                    i = j - 1;
                    ans++;
                    break;
                }
            }
        }
        if (count >= 0) {
            ans++;
        }
        System.out.println("\n" + ans);
    }
}
