import java.util.Scanner;

// https://atcoder.jp/contests/abc141/submissions/7542028がjavaだとTLEせず通るのかテスト
// 結合なしで普通に出力する場合
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long K = Long.parseLong(sc.next());
        int Q = Integer.parseInt(sc.next());

        int[] A = new int[Q];
        for (int i = 0; i < Q; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        solve(N, Q, K, A);
    }

    public static String solve(int n, int q, long k, int[] a) {
        long[] dp = new long[n];
        for (int i = 0; i < q; i++) {
            int winner = a[i];
            dp[winner - 1] = dp[winner - 1] + 1;
        }

        for (long element : dp) {
            System.out.println(q - k >= element ? "No" : "Yes");
        }
        return null;
    }
}

