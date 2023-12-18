import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int p = power(2, N);
        int[] dp = new int[p];
        for (int i=0; i < p; i++) {
            dp[i] = 1_000_000_000;
        }
        dp[0] = 0;

        for (int i=0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int[] c_list = new int[b];
            for (int j=0;  j < b; j++) {
                c_list[j] = scan.nextInt();
            }
            int c=0;
            for (int item : c_list) {
                c += power(2, item-1);
            }
            for (int k=0; k < p; k++) {
                if (dp[k|c] > dp[k] + a) {
                    dp[k|c] = dp[k] + a;
                }
            }
        }
        if (dp[dp.length - 1] == 1_000_000_000) {
            System.out.println(-1); 
        } else {
            System.out.println(dp[dp.length - 1]); 
        }
    }

    public static int power(int n, int m) {
        int res = 1;
        if (m == 0) {
            return 1;
        } else {
            if (n == 0) {
                return 0;
            } else {
                for (int i=0; i < m; i++) {
                    res = res*n;
                }
                return res;
            }
        }
    }
}
