import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int k2 = k * 2;
        int[][] a = new int[k2 + 1][k2 + 1];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt() % k2;
            int y = scanner.nextInt() % k2;
            if (scanner.next().equals("W")) {
                y = (y + k) % k2;
            }
            a[x + 1][y + 1]++;
        }

        for (int x = 1; x <= k2; x++) {
            for (int y = 1; y <= k2; y++) {
                a[x][y] += a[x - 1][y] + a[x][y - 1] - a[x - 1][y - 1];
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                int s1 = a[i][j] + a[0][0] - a[0][j] - a[i][0] +
                         a[k2][j] + a[i + k][0] - a[i + k][j] - a[k2][0] +
                         a[i + k][j + k] + a[i][j] - a[i][j + k] - a[i + k][j] +
                         a[i][k2] + a[0][j + k] - a[0][k2] - a[i][j + k] +
                         a[k2][k2] + a[i + k][j + k] - a[i + k][k2] - a[k2][j + k];
                int s2 = a[i][j + k] + a[0][j] - a[0][j + k] - a[i][j] +
                         a[i + k][j] + a[i][0] - a[i][j] - a[i + k][0] +
                         a[i + k][k2] + a[i][j + k] - a[i][k2] - a[i + k][j + k] +
                         a[k2][j + k] + a[i + k][j] - a[i + k][j + k] - a[k2][j];
                ans = Math.max(ans, Math.max(s1, s2));
            }
        }
        System.out.println(ans);
    }
}