import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] ans = solve(N, M);
        for (int i=0; i<M; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }

    private static int[][] solve(int N, int M) {
        int[][] ans = new int[M][2];

        if (N%2 == 1) {
            for (int i=0; i<M; i++) {
                ans[i][0] = i+1;
                ans[i][1] = N-(i+1);
            }
        } else {
            for (int i=0; i<M; i++) {
                ans[i][0] = (i+1)*2;
                ans[i][1] = (i+1)*2+1;
            }
        }

        return ans;
    }
}