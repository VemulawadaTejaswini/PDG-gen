import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int[][] ot = new int[N+1][T];
        int[][] ft = new int[N+1][T];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                int finishTime = ft[i][j];
                if (j >= A[i]) {
                    finishTime = Math.max(finishTime, ft[i][j-A[i]] + B[i]);
                }
                ft[i+1][j] = finishTime;

                ot[i+1][j] = Math.max(ot[i][j], ft[i][j] + B[i]);
            }
        }
        
        System.out.println(ot[N][T-1]);
    }
}
