import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()+1;
        int m = in.nextInt();
        int q = in.nextInt();
        int[] L = new int[200009];
        int[] R = new int[200009];
        int[][] M = new int[n][n];
        for(int i = 0; i < m; i++) {
            L[i] = in.nextInt();
            R[i] = in.nextInt();
            M[L[i]][R[i]] += 1;
        }
        int[] P = new int[1000009];
        int[] Q = new int[1000009];
        for(int i = 0; i < q; i++) {
            P[i] = in.nextInt();
            Q[i] = in.nextInt();
        }

        int[][] S = new int[n][n];
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                S[i][j] = S[i][j-1] + M[i][j];
            }
        }

        for(int i = 0; i < q; i++) {
            int ans = 0;
            for(int j = P[i]; j <= Q[i]; j++) {
                ans += S[j][Q[i]] - S[j][P[i]-1];
            }
            System.out.println(ans);
        }
    }
}