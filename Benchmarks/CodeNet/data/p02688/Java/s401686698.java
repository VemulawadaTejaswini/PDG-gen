import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] d = new int[K];
        int[][] A = new int[K][N];
        for (int i=0; i<K; i++) {
            d[i] = sc.nextInt();
            for (int j=0; j<d[i]; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(N, K, d, A));
    }

    private static int solve(int N, int K, int[] d, int[][] A) {
        boolean[] hit = new boolean[N];
        for (int k=0; k<K; k++) {
            for (int i=0; i<d[k]; i++) {
                hit[A[k][i]-1] = true;
            }
        }


        int count = 0;
        for (int i=0; i<N; i++) {
            if (!hit[i]) count++;
        }

        return count;
    }
}