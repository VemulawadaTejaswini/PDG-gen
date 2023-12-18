import java.util.*;

/**
 * created by naumov on 12/14/19
 */
public class Main {

// FROG 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] heights = new int[n];
//        for (int i = 0; i < n; i++) {
//            heights[i] = sc.nextInt();
//        }
//
//        int[] dp = new int[n];
//        for (int i = 0; i < n; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }
//
//        dp[0] = 0;
//
//        for (int i = 1; i < n; i++) {
//            for (int j=Math.max(i - k, 0); j < i; j++) {
//                dp[i] = Math.min(dp[i], dp[j] + Math.abs(heights[i] - heights[j]));
//            }
//        }
//        System.out.println(dp[n - 1]);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] cost = new int[n][3];
        int[][] res = new int[n][3];

        for (int d=0; d<n;d++) {
            for(int a = 0; a< 3; a++) {
                cost[d][a] = sc.nextInt();
            }
        }

        System.arraycopy(cost[0], 0, res[0], 0, 3);

        for(int d=1; d<n; d++) {
            for (int a = 0; a < 3; a++) {
                res[d][a] = cost[d][a];

                for (int pa=0; pa<3;pa++) {
                    if (pa == a)
                        continue;

                    res[d][a] = Math.max(res[d][a], res[d-1][pa]+cost[d][a]);
                }
            }

        }

        int totalMax = Integer.MIN_VALUE;

        for(int a =0; a<3;a++) {
            totalMax = Math.max(res[n-1][a], totalMax);
        }
        System.out.println(totalMax);
    }

}
