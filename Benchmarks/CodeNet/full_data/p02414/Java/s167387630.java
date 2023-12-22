import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> A = new ArrayList<Integer>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][l];
        long[][] C = new long[n][l];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<l; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<l; j++) {
                for (int k=0; k<m ; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j]);
                if (j != l-1)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }



    }
}
