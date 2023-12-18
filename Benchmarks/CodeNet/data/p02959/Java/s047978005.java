import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        for (int i=0; i<N+1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            B[i] = sc.nextInt();
        }

        System.out.println(solve(N, A, B));
    }

    private static long solve(int N, int[] A, int[] B) {
        long count = 0;

        int remain = 0;
        for (int i=0; i<N; i++) {
            int a = A[i];
            int b = remain + B[i];

            count += Math.min(a, b);
            remain = a <= remain ? B[i] : Math.max(b-a, 0);
        }
        count += Math.min(A[N], remain);

        return count;
    }
}