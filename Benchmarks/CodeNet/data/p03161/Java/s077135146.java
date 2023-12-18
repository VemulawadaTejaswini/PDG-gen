import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int [] hi = new int[N];

        for (int i = 0; i < N; i++) {

            hi[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int[] dp = new int[100000+1];

        dp[0] = 0;
        dp[1] = Math.abs(hi[1] - hi[0]);

        for (int i = 2; i < N; i ++) {

            int min = Integer.MAX_VALUE;

            for (int j = 1; j <= K; j++) {

                if (i >= j) {

                    min = Math.min(min, (dp[i-j] + Math.abs(hi[i] - hi[i-j])));
                }
            }
            dp[i] = min;
        }

        System.out.println(dp[N-1]);

    }

}
