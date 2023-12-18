
import java.util.Scanner;

public class Main {
    static int[] c;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        c = new int[n];
        dp = new int[21][n + 1];
        for (int i = 0; i < n; i++) {
            c[i] = scan.nextInt();
        }

        long ret = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i][j - 1] + ((c[j - 1] & (1 << i)) == 0 ? 0 : 1);
            }
        }
        for (int i = 0; i < n; i++) {
            int length = 0;
            for (int j = i + 1; j < n && j < i + 2; j++) {
                boolean flag = true;
                for (int k = 0; k < 21; k++) {
                    int lft = i != 0 ? dp[k][i] : 0;
                    if(dp[k][j+1] - dp[k][i] > 1&& (c[i+1] & (1 << i)) != 0) {
//                    if ((c[j] & (1 << i)) != 0 && (c[i] & (1 << i)) != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    length++;
                }
            }
            ret += 1 + length;
        }

        for (int i = 1; i < n; i++) {

        }
        System.out.println(ret);
    }
}
