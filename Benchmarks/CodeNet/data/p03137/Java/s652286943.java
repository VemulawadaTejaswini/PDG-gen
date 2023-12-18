import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static long solve(int N, int M, int[] Xs) {
        if (N >= M) {
            return 0;
        }

        Arrays.sort(Xs);

        int[] diffs = new int[M-1];
        for(int i = 1; i < M; i++) {
            diffs[i-1] = Xs[i] - Xs[i-1];
        }

        Arrays.sort(diffs);
        long ans = 0;
        for(int i = 0; i < M - 1 - (N - 1); i++) {
            ans += diffs[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int[] Xs = new int[M];
        for(int i = 0; i < M; i++) {
            Xs[i] = sc.nextInt();
        }

        long ans = solve(N, M, Xs);
        System.out.println(ans);
    }
}
