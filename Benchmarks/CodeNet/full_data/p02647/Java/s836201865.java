import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve2(N, K, A);
        for (int i=0; i<N; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    private static int[] solve2(int N, int K, int[] A) {
        int[] ans = A.clone();
        int[] next = null;

        for (int i=0; i<Math.min(K, 200); i++) {
            next = new int[N];
            int[] up = new int[N];
            int[] down = new int[N];

            for (int j=0; j<N; j++) {
                up[Math.max(0, j-ans[j])]++;
                down[Math.min(N-1, j+ans[j])]++;
            }

            int on = 0;
            for (int j=0; j<N; j++) {
                on += up[j];
                next[j] = on;
                on -= down[j];
            }

            ans = next;

            // System.err.println(Arrays.toString(next));
        }

        return next;

    }
}