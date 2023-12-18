import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for (int i=0; i<M; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, A));
    }

    private static long solve(int N, int M, int[] A) {
        long sum = N;

        for (int i=0; i<M; i++) {
            sum -= A[i];
        }

        return sum;
    }
}