import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, A) ? "APPROVED" : "DENIED");
    }

    private static boolean solve(int N, int[] A) {
        for (int i=0; i<N; i++) {
            if (A[i] % 2 != 0) continue;

            if (A[i] % 3 != 0 && A[i] % 5 != 0) {
                return false;
            }
        }

        return true;
    }
}