import java.util.Scanner;

/**
 * Created by AMK on 8/27/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][3];
        int dp[] = new int[3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            arr[i][2] = scanner.nextInt();
            int xx[] = new int[3];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        xx[j] = Math.max(xx[j], dp[k] + arr[i][k]);
                    }
                }
            }
            dp = xx;
        }
        System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));
    }
}
