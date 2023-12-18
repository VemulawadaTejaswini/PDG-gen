import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(combineSlimes(A));
    }

    private static long combineSlimes(int[] A) {
        int len = A.length;
        long[][] cost = new long[len][len];
        long[][] sum = new long[len][len];

        for (int j = 0; j < len; j++)
            for (int i = j; i >= 0; i--) {
                cost[i][j] = i == j ? 0 : Long.MAX_VALUE;
                sum[i][j] = j > 0 ? sum[i][j - 1] + A[j] : A[j];
                for (int start = j, left = j - 1; start > i; start--, left--) {
                    cost[i][j] = Math.min(cost[i][j], cost[i][left] + cost[start][j] + sum[i][j]);
                }
            }
        return cost[0][len - 1];
    }

}