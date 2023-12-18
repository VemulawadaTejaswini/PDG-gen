import java.util.Scanner;

public class Main {
    static int n;
    static long l = 10000000007L;
    static long[] a;
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new long[n];
        dp = new long[n+1];
        boolean ok = true;
        double ans = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            dp[num]++;
        }
        if (n % 2 == 1) {
            //奇数の場合、0は１つ、偶数は２つ、奇数はない
            if (dp[0] != 1) {
                ok = false;
            } else {
                for (int i = 1; i < n; i++) {
                    if (i%2==0) {
                        ok = dp[i] == 2;
                    } else {
                        ok = dp[i] == 0;
                    }
                }
            }
            ans = Math.pow(2, (n-1)/2%l);
        } else {
            //偶数の場合、0はない、偶数はない、奇数は２つ
            if (dp[0] != 0) {
                ok = false;
            } else {
                for (int i = 1; i < n; i++) {
                    if (i%2==0) {
                        ok = dp[i] == 0;
                    } else {
                        ok = dp[i] == 2;
                    }
                }
            }
            ans = Math.pow(2, n/2%l);
        }
        System.out.println(ok?(int)ans%l:0);
    }
}
