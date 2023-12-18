import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;

class Problem {
    private int N;
    private int M;
    private Integer[] A;
    private final int[] nums = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        A = new Integer[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }
    }

    String solve() {
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            dp[i] = -1;

            for (int j = 0; j < M; j++) {
                int index = i - nums[A[j]];
                if (index >= 0 && dp[index] >= 0) {
                    dp[i] = Math.max(dp[i], dp[index] + 1);
                }
            }
        }

        int ndigits = dp[N];
        StringBuilder builder = new StringBuilder();

        Arrays.sort(A, Comparator.reverseOrder());

        int rest = N;
        for (int i = ndigits; i > 0; i--) {
            for (int m = 0; m < M; m++) {
                if (rest - nums[A[m]] >= 0 && dp[rest - nums[A[m]]] == (i - 1)) {
                    rest -= nums[A[m]];
                    builder.append(A[m]);
                    break;
                }
            }
        }

        return builder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
