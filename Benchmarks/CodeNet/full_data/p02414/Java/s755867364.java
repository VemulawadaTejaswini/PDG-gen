import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), l = scan.nextInt();
        long[][] a = new long[n][m], b = new long[m][l], c = new long[n][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                long sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                if (j == l -1) {
                    System.out.print(c[i][j]);
                } else {
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}