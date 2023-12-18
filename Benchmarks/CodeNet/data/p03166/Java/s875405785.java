import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Longest Path
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<List<Integer>> g = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                g.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;

                g.get(y).add(x);
            }

            int[] dp = new int[N];

            for (int i = 0; i < N; i++) {
                solve(i, dp, g);
            }

            int max = Arrays.stream(dp).max().getAsInt();

            System.out.println(max);
        }
    }

    static int solve(int x, int[] dp, List<List<Integer>> g) {
        if (dp[x] != 0) {
            return dp[x];
        }

        for (Integer e : g.get(x)) {
            dp[x] = Math.max(dp[x], solve(e, dp, g) + 1);
        }

        return dp[x];
    }

}
