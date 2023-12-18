import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[] p = new int[D];
        int[] c = new int[D];

        for (int i = 0; i < D; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[][] DP = new int[10010][10];
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 100; j++) {
                int n = (i + 1) * 100 * j;
                if (p[i] <= j) {
                    n = (i + 1) * 100 * p[i] + c[i];
                    if (i != 0 && p[i] < j) {
                        n += DP[i - 1][j - p[i]];
                    }
                }
                if (i == 0) {
                    DP[i][j] = n;
                } else {
                    DP[i][j] = Math.max(n, DP[i - 1][j]);

                }
            }
        }

        /*
        for (int i = 0; i < D; i++) {
            for (int j = 1; j <= 100; j++) {
                System.out.print(DP[i][j] + " ");
            }
            System.out.println();
        }
        */

        for (int i = 1; i <= 100001; i++) {
            if (DP[D - 1][i] >= G) {
                System.out.println(i);
                break;
            }
        }
    }
}
