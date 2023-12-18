import java.util.Scanner;

public class Main {
    static int n;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[8]; //0:灰色～7:赤
        int over = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 3200) {
                over++;
            } else {
                dp[num/400]++;
            }
        }
        for (int i = 0; i < 8; i++) {
            if (dp[i] != 0) {
                ans++;
            }
        }
        System.out.println(Math.max(1, ans));
        System.out.println(Math.min(8, ans + over));
    }
}
