import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        Reader sc = new Reader();
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] ws = new int[N+1];
        int[] vs = new int[N+1];
        PrintWriter pw = new PrintWriter(System.out);

        for(int i=1; i<=N; ++i) {
            ws[i] = sc.nextInt();
            vs[i] = sc.nextInt();
        }

        long r = Knapsack2(N, W, ws, vs);

        pw.println(r);
        pw.close();
    }

    public static long Knapsack2(int N, int W, int[] ws, int[] vs) {
        int[][] dp = new int[N+1][W+1];

        for(int i=1; i<=N; ++i) {
            for(int w=1; w<=W; ++w) {
                dp[i][w] = Math.max(dp[i-1][w], (w-ws[i]>=0)? dp[i-1][w-ws[i]] + vs[i]: 0);
            }
        }

//        d0(dp);

        return dp[N][W];
    }

    public static void d0(int[][] dp) {
        System.out.print("    ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%3d ", j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i){
            System.out.printf("%3d|", i);
            for(int j=0; j<dp[0].length; ++j){
                System.out.printf("%3d ", dp[i][j]);
            }
            System.out.println();
        }
    }
}
