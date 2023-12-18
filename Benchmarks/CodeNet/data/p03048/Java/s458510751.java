//package TaskB;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int R,G,B,N;
    void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt(); G = sc.nextInt(); B=sc.nextInt(); N = sc.nextInt();
        int[][] dp = new int[4][N+1];
        for(int i=0; i<4; i++){
            for(int j=0; j<N+1; j++){
                dp[i][j] = 0;
            }
        }

        dp[0][0] = 1;
        for(int i=0; i*R<=N; i++){
            dp[0][i*R] = 1;
        }

        dp[1][0] = 1;
        for(int i=1; i<=N; i++){
            for(int j=0; j*G<=i; j++){
                dp[1][i] += dp[0][i-j*G];
            }
        }

        dp[2][0] = 1;
        for(int i=1; i<=N; i++){
            for(int j=0; j*B<=i; j++){
                dp[2][i] += dp[1][i - j*B];
            }
        }

        System.out.println(dp[2][N]);


    }

    public static void main(String[] args) throws Exception{
        //System.setIn(new FileInputStream("inputs/b.in"));
        Main s = new Main();
        s.solve();
    }
}
