import java.util.Scanner;

public class Main {
    static int n;
    static int[] a;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        dp = new int[n+1];
        boolean ok = true;
        double ans = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a[i] = num;
            dp[num]++;
        }
        if (n % 2 == 1) {
            //奇数の場合、0は１つ、偶数は２つ、奇数は０つ
            if (dp[0] != 1) ok = false;
            for (int i = 1; i < n; i++) {
                if (i%2==0) {
                    ok = dp[i] == 2;
                } else {
                    ok = dp[i] == 0;
                }
            }
            ans = Math.pow(2, (n-1)/2);
        } else {
            if (dp[0] != 0) ok = false;
            for (int i = 1; i < n; i++) {
                if (i%2==0) {
                    ok = dp[i] == 0;

                } else {
                    ok = dp[i] == 2;
                }
            }
            ans = Math.pow(2, n/2);
        }
        System.out.println(ok?(int)ans:0);
    }
}
