import java.util.*;

public class Main {

    private static int N;
    private static int K;

    public static void main(String[] args) {
        load();
        solve();
    }

    private static void load() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
    }

    private static void solve() {
        if (K > (N - 1) * (N - 2) / 2) {
            System.out.println("-1");
            return;
        }

        for (int i = 2; i <= N; i += 1) {
            System.out.println(String.format("%d %d", 1, i));
        }

        int cnt = (N - 1) * (N - 2) / 2;
        int from = 2;
        while (cnt != K) {
            System.out.println(String.format("%d %d", from, from + 1));
            from += 1;
            cnt -= 1;
        }
    }

}
