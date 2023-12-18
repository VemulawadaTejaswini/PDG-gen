import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int Q = scanner.nextInt();

        int[][] a = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            a[scanner.nextInt()][scanner.nextInt()]++;
        }
        for (int[] b : a) {
            Arrays.parallelPrefix(b, Integer::sum);
        }
        for (int i = 0; i < Q; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int sum = 0;
            for (int j = p; j <= q; j++) {
                sum += a[j][q] - a[j][p - 1];
            }
            System.out.println(sum);
        }
    }
}