import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(H, N, A) ? YES : NO);
    }

    private static boolean solve(int H, int N, int[] A) {
        int sum = 0;

        for (int i=0; i<N; i++) {
            sum += A[i];
        }

        return sum >= H;
    }
}