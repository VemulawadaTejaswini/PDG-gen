
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int [] weight = new int[n + 1];
        int[] value = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        long [][] result = new long[n + 1][100005];
        for (int v = 0; v < 100005; ++v) {
            result[1][v] = Long.MAX_VALUE;
        }
        result[1][0] = 0;
        result[1][value[1]] = weight[1];
        for (int i = 2; i <= n; ++i) {
            for (int v = 0; v < 100005; ++v) {
                result[i][v] = result[i - 1][v];
                if (v >= value[i] && result[i - 1][v - value[i]] != Long.MAX_VALUE) {
                    result[i][v] = Math.min(
                            result[i][v],
                            result[i - 1][v - value[i]] + weight[i]
                    );
                }
            }
        }
        for (int v = 100004; v >= 0; --v) {
            if (result[n][v] >= 0 && result[n][v] <= w) {
                System.out.println(v);
                return;
            }
        }
    }
}
