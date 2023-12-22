import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[m][l];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++)
            for (int j = 0; j < l; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                long cij = 0;
                for (int k = 0; k < m; k++)
                    cij += a[i][k] * b[k][j];
                System.out.print((j == 0) ? cij : " " + cij);
            }
            System.out.println();
        }
    }
}
