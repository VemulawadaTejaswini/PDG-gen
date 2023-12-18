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
        int M = sc.nextInt();
        long[] cnt = new long[N];
        Arrays.fill(cnt, 0L);
        for (int i = 0; i < M; i++) {
            cnt[sc.nextInt() - 1]++;
            cnt[sc.nextInt() - 1]++;
        }
        boolean check = true;
        for (int i = 0; i < N; i++) {
            if (cnt[i] % 2 == 1)
                check = false;
        }
        if (check) System.out.println("YES");
        else System.out.println("NO");
    }
}