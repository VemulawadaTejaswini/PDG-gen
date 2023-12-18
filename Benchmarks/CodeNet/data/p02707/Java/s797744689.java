import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N-1; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve(N, A);
        for (int i=0; i<N; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] solve(int N, int[] A) {
        int[] ans = new int[N];

        for (int i=0; i<N-1; i++) {
            ans[A[i]-1]++;
        }

        return ans;
    }
}