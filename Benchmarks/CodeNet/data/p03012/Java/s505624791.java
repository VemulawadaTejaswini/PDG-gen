import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scan.nextInt();
            sum += val[i];
        }
        int output = Integer.MAX_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += val[i];
            output = Math.min(output, Math.abs(currSum - (sum - currSum)));
        }
        System.out.println(output);
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int sum = 0;
//        int[] val = new int[n];
//        for (int i = 0; i < n; i++) {
//            val[i] = scan.nextInt();
//            sum += val[i];
//        }
//        int output = Integer.MAX_VALUE;
//        boolean[][] dp = new boolean[n + 1][sum + 1];
//        dp[0][0] = true;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j <= sum; j++) {
//                dp[i][j] = dp[i - 1][j];
//                if (j - val[i - 1] >= 0) {
//                    dp[i][j] |= dp[i - 1][j - val[i - 1]];
//                }
//                if (dp[i][j]) {
//                    output = Math.min(output, Math.abs(j - (sum - j)));
//                }
//            }
//        }
//        System.out.println(output);
//    }
}