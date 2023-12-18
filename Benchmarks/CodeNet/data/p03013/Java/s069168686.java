import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 階段の段数
        int M = sc.nextInt(); // 壊れている床番号

        //
        Integer[] brokenStairs = new Integer[M];
        for (int i = 0; i < M; i++) {
            brokenStairs[i] = sc.nextInt();
        }

        long[] count = new long[N + 1];
        count[0] = 1;

        if (!Arrays.asList(brokenStairs).contains(1)) {
            count[1] = 1;
        }
        for (int stair = 2; stair <= N; stair++) {
            if (!Arrays.asList(brokenStairs).contains(stair)) {
                count[stair] = count[stair - 1] + count[stair - 2];
            }
        }
        long ans = count[N] % 1000000007;
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
