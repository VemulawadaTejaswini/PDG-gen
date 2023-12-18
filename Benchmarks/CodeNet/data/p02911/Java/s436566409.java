import java.io.PrintWriter;
import java.util.Scanner;

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

    public static void solve(int n, int q, long k, int[] a) {
        long[] dp = new long[n];
        for (int i = 0; i < q; i++) {
            int winner = a[i];
            dp[winner - 1] = dp[winner - 1] + 1;
        }

        PrintWriter out = new PrintWriter(System.out);
        for (long element : dp) {
            if (q - k >= element)
                out.println("No");
            else
                out.println("Yes");
        }
        out.flush();
    }
}