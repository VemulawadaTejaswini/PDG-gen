import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
                        int[][] A = new int[n][m];
                        int[][] B = new int[m][l];
                        for (int i = 0; i < n; i++) {
                                for (int j = 0; j < m; j++) {
                                        A[i][j] = sc.nextInt();
                                }
                        }
                        for (int i = 0; i < m; i++) {
                                for (int j = 0; j < l; j++) {
                                        B[i][j] = sc.nextInt();
                                }
                        }
                        for (int i = 0; i < n; i++) {
                                for (int j = 0; j < l; j++) {
                                        int num = 0;
                                        for (int k = 0; k < m; k++) {
                                                num += A[i][k] * B[k][j];
                                        }
                                        System.out.print(num);
                                        if (j != l - 1) {
                                                System.out.print(" ");
                                        } else {
                                                System.out.print("\n");
                                        }
                                }
                        }
                }
        }
}