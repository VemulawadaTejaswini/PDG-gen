import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Main main = new Main();
	    main.solve();
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] as = new long[N+1];

        for(int i=1; i<=N; ++i) {
            as[i] = sc.nextLong();
        }

        long[][] dp = new long[N+1][N+1];

        // d_{i,j} i와 j가 서로 같은 경우
        // d_{2,2}는 as_2와 같음
        for(int i=0; i<dp.length; ++i) {
            dp[i][i] = as[i];
        }

        for(int d_ij=1; d_ij<N; ++d_ij) {
            for(int k=1; k<=N; ++k) {
                int i = k;
                int j = i+d_ij;
                if(j<=N) {
//                    System.out.printf("%dx%d ", i, j);
                    dp[i][j] = Math.max(as[i] - dp[i+1][j], as[j] - dp[i][j-1]);
                }
            }
//            System.out.printf("\n");
        }

        System.out.println(dp[1][N]);
    }
}
