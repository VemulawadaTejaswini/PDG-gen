import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int Q = sc.nextInt();
            int[] a = new int[Q];
            int[] b = new int[Q];
            int[] c = new int[Q];
            int[] d = new int[Q];
            for (int i = 0; i < Q; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
                d[i] = sc.nextInt();
            }
            int[] A = new int[N + 1];
            A[0] = 1;

            int max = dfs(1, N + 1, M, Q, a, b, c, d, A);

            System.out.println(max);
        }
    }

    private static int dfs(int index, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d, int[] A) {
        if (index >= N) {
            return calculateScore(Q, a, b, c, d, A);
        }

        int max = 0;
        for (int j = A[index - 1]; j <= M; j++) {
            A[index] = j;
            max = Math.max(max, dfs(index + 1, N, M, Q, a, b, c, d, A));
        }
        return max;
    }

    private static int calculateScore(int Q, int[] a, int[] b, int[] c, int[] d, int[] A) {
        int sum = 0;
        for (int i = 0; i < Q; i++) {
            if (A[b[i]] - A[a[i]] == c[i]) {
                sum += d[i];
            }
        }
        return sum;
    }
}
