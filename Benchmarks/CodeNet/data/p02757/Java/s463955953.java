import java.util.Scanner;

/**
 * Divisible Substring
 * 
 * https://atcoder.jp/contests/abc158/tasks/abc158_e
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int P = sc.nextInt();
        String S = sc.next();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S.charAt(i) - '0';
        }

        if (P < 10) {
            for (int i = 0; i < N; i++) {
                A[i] = A[i] % P;
            }
        }

        int[][] B = new int[P][10];
        for (int i = 0; i < P; i++) {
            for (int j = 0; j < 10; j++) {
                B[i][j] = (i * 10 + j) % P;
            }
        }

        Integer[] C = new Integer[N];

        for (int i = 0; i < N; i++) {
            dfs(A, i, B, C);
        }

        long ans = 0;
        for (Integer c : C) {
            ans += c;
        }

        System.out.println(ans);
    }

    static int dfs(int[] A, int index, int[][] B, Integer[] C) {
        if (index >= A.length) {
            return 0;
        }

        if (C[index] != null) {
            return C[index];
        }

        int m = 0;
        for (int i = index; i < A.length; i++) {
            m = B[m][A[i]];

            if (m == 0) {
                C[index] = dfs(A, i + 1, B, C) + 1;
                break;
            }
        }

        if (C[index] == null) {
            C[index] = 0;
        }

        return C[index];
    }

}
