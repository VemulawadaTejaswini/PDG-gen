import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[m][l];

        int c[][] = new int[n][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < l; k++) {
                    c[i][k] += a[i][j]*b[j][k];
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<l-1; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println(c[i][l-1]);
        }

    }
}