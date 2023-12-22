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
        int Q = sc.nextInt();
        int[] B = new int[Q];
        int[] C = new int[Q];
        for (int i=0; i<Q; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        long[] ans = solve(N, A, Q, B, C);
        for (int i=1; i<Q+1; i++) {
            System.out.println(ans[i]);
        }
    }

    private static long[] solve(int N, int[] A, int Q, int[] B, int[] C) {
        long[] ans = new long[Q+1];

        int[] count = new int[100000 + 1];
        for (int i=0; i<N; i++) {
            count[A[i]]++;
            ans[0] += A[i];
        }

        for (int i=0; i<Q; i++) {
            ans[i+1] = ans[i];
            ans[i+1] += (C[i] - B[i]) * count[B[i]];
            count[C[i]] += count[B[i]];
            count[B[i]] = 0;
        }

        return ans;
    }
}