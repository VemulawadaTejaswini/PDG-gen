import java.util.*;
import java.io.*;

public class Main {

    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = in.nextInt();
        String s = in.next();
        int[][] dp = new int[n][n];
        dp[0][0] = 1;

        int[] prefixSum = new int[n + 1];

        for (int i = 1; i < n; i++) {
            boolean lastGreater = s.charAt(i - 1) == '>';

            prefixSum = new int[n + 1];
            for (int j = 0; j < n; j++) {
                prefixSum[j + 1] = add_self(prefixSum[j], dp[i - 1][j]);
            }

            for (int j = 0; j <= i; j++) {

                int L;
                int R;

                // if the last is greater, than we can use

                // if we are looking at the last value: dp[]

                if (lastGreater) {
                    L = 0;
                    R = j;

                }

                else {
                    L = j;
                    R = n - 1;
                }

                //System.out.println(L);
                //System.out.println(R);

                // j is the last value used

                dp[i][j] = prefixSum[R] - prefixSum[L];

                /*for (int k = L; k <= R; k++) {
                    dp[i][j] = add_self(dp[i][j], dp[i-1][k]);
                }*/

                /*for (int k = 0; k <= i; k++) {
                    if ((lastGreater && k < j) || (!lastGreater && k > j)) continue;
                    if (j == k && !lastGreater) continue;
                    dp[i][j] = add_self(dp[i][j], dp[i-1][k]);
                }*/
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = add_self(result, dp[n-1][i]);
        }

        out.println(result);
        out.close();
    }

    static int add_self(int a, int b) {
        a += b;
        if (a >= mod) a -= mod;
        return a;
    }
}