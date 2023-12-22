import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i=0; i<N; i++) {
            H[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, H, A, B));
    }

    private static int solve(int N, int M, int[] H, int[] A, int[] B) {
        boolean[] hit = new boolean[N];
        Arrays.fill(hit, true);

        for (int j=0; j<M; j++) {
            int a = H[A[j]-1];
            int b = H[B[j]-1];

            if (a < b) {
                hit[A[j]-1] = false;
            } else if (a > b) {
                hit[B[j]-1] = false;
            } else {
                hit[A[j]-1] = false;
                hit[B[j]-1] = false;
            }
        }

        int count = 0;
        for (int i=0; i<N; i++) {
            if (hit[i]) {
                // System.err.println("hit " + i);
                count++;
            }
        }

        return count;
    }
}