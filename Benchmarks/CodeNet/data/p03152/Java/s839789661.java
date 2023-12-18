import java.util.*;

public class AssignD {
    public static final int MOD = 1_000_000_007;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++) {
            B[i] = sc.nextInt();
        }

        long ans = solve(N, M, A, B);
        // long ans = solve4004049(N, M, A, B);

        System.out.println(ans);
    }

    /**
     *
     */
    private static long solve(int N, int M, int[] A, int[] B) {
        Arrays.sort(A);
        A = reverse(A);
        Arrays.sort(B);
        B = reverse(B);
        System.err.println("A = " + Arrays.toString(A));
        System.err.println("B = " + Arrays.toString(B));

        int p = 0;
        int q = 0;
        long ans = 1;
        int rest = 0;

        for (int i=N*M-1; i>=1; i--) {
            boolean P = p+1 < N && A[p+1] == i;
            boolean Q = q+1 < M && B[q+1] == i;
            // System.err.println("A[p] = A[" + p + "] = " + A[p]);
            // System.err.println("B[q] = B[" + q + "] = " + B[q]);
            System.err.println("P: " + P + ", Q: " + Q);

            if (P) {
                p++;
                rest += q+1;
            }
            if (Q) {
                q++;
                rest += p+1;
            }

            if (P && Q) {
                // nothing
            } else if (P) {
                ans = ans * (q+1) % MOD;
            } else if (Q) {
                ans = ans * (p+1) % MOD;
            } else {
                ans = ans * rest % MOD;
            }

            rest--;
            if (rest < 0) {
                System.err.println("rest = " + rest);
                return 0;
            }

            System.err.println("ans=" + ans + ", rest=" + rest);
        }

        return ans;
    }
}