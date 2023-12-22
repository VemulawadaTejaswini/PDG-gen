import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        sc.close();

        int[] A = new int[N * N];
        A[0] = 1;

        dfs(A, 0, N, M, Q, a, b, c, d);
        System.out.println(ans);
    }

    public static void dfs(int[] A, int roopCount, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {

        if (roopCount == N) {
            int now = 0;
            for (int i = 0; i < Q; i++) {
                if (A[b[i]] - A[a[i]] == c[i]) {
                    now += d[i];
                }
            }
            ans = Math.max(now, ans);
            return;
        } else {
            A[roopCount + 1] = A[roopCount];
            while (A[roopCount + 1] <= M) {
                dfs(A, roopCount + 1, N, M, Q, a, b, c, d);
                A[roopCount + 1] += 1;
            }
        }
    }
}