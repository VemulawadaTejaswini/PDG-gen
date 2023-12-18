import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] k = {{1, 1, 1}, {1, 1, -1}, {1, -1, 1}, {-1, 1, 1}, {-1, -1, 1}, {-1, 1, -1}, {1, -1, -1}, {-1, -1, -1}};
        long[][] sum = new long[8][n];

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong(), y = sc.nextLong(), z = sc.nextLong();
            for (int v = 0; v < 8; v++) {
                sum[v][i] = x * k[v][0] + y * k[v][1] + z * k[v][2];
            }
        }

        long ans = 0;
        for (int v = 0; v < 8; v++) {
            Arrays.sort(sum[v]);
            long lower = 0, upper = 0;
            for (int i = 0, c = n - 1; i < m; i++, c--) {
                lower += sum[v][i];
                upper += sum[v][c];
            }
            ans = Math.max(ans, Math.max(Math.abs(lower), Math.abs(upper)));
        }

        System.out.println(ans);
    }
}