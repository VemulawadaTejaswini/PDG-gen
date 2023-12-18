import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt(), Q = scanner.nextInt();
        scanner.nextLine();
        int[][] cSum = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int[] p = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cSum[p[0]][p[1]]++;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                cSum[i][j] += cSum[i][j - 1];
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                cSum[i][j] += cSum[i - 1][j];
            }
        }
        for (int i = cSum.length - 1; i >= 0; i--)
            System.out.println(Arrays.toString(cSum[i]));
        for (int i = 0; i < Q; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = cSum[q[1]][q[1]] - cSum[q[1]][q[0] - 1] - cSum[q[0] - 1][q[1]] + cSum[q[0] - 1][q[0] - 1];
            System.out.println(ans);
        }
    }

}