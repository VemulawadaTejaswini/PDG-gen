import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i=0; i<Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, Q, a, b, c, d));
    }

    private static int solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        //
        return dfs(N, M, Q, a, b, c, d, 0, 1, new int[N]);
    }

    private static int dfs(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int idx, int last, int[] A) {
        if (idx == N) {
            int total = 0;
            for (int i=0; i<Q; i++) {
                if (A[b[i]-1] - A[a[i]-1] == c[i]) {
                    total += d[i];
                }
            }

            return total;
        }

        int ans = 0;
        for (int i=last; i<M+1; i++) {
            A[idx] = i;
            ans = Math.max(ans, dfs(N, M, Q, a, b, c, d, idx+1, i, A));
        }

        return ans;
    }
}
