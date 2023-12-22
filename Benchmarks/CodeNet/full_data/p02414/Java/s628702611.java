import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        long[][] A = new long[N][M];
        long[][] B = new long[M][L];
        long[][] C = new long[N][L];
        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                A[n][m] = sc.nextInt();
            }
        }
        for (int m = 0; m < M; m++) {
            for (int l = 0; l < L; l++) {
                B[m][l] = sc.nextInt();
            }
        }
        for (int n = 0; n < N; n++) {
            StringBuilder sb = new StringBuilder();
            for (int l = 0; l < L; l++) {
                for (int m = 0; m < M; m++) {
                    C[n][l] += A[n][m] * B[m][l];
                }
                sb.append(C[n][l]);
                if (l < L - 1) sb.append(' ');
                else System.out.println(sb);
            }
        }
    }
}

