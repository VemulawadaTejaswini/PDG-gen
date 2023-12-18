import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < x.length; i++) {

            int[] row1;
            int[] row2;
            if (i + 1 >= x.length) {
                row1 = x[i];
                row2 = x[0];
            } else {
                row1 = x[i];
                row2 = x[i + 1];
            }

            double dist = 0;
            for (int j = 0; j < d; j++) {
                dist += calc(row1[j], row2[j]);
            }

            // 整数？
            for (int j = 0; j <= dist; j++) {
                if (j * j == dist) {
                    ans++;
                    break;
                }
            }
        }

        // 一次元の場合は異なる解になる模様
        if (d == 1) {
            ans = 0;
            int def = 1;
            for (int i = 1; i < n; i++) {
                ans += def;
                def++;
            }
        }
        System.out.println(ans);
    }

    private static double calc(int i, int j) {
        return Math.pow(Math.abs(i - j), 2);
    }
}
