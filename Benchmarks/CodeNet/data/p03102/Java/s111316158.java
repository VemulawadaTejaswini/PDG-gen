import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        int[][] A = new int[N][M];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
                sum += A[i][j] * B[j];
            }
            sum += C;
            if (sum > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
