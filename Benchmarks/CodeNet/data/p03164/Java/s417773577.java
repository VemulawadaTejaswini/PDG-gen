import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        int V = IntStream.of(vs).sum();
        long[][] dp = new long[N+1][V+1];

        for(int n=0; n<=N; ++n) {
            for(int v=0; v<=V; ++v) {
                dp[n][v] = Integer.MAX_VALUE - V;
            }
        }

        long value = 0;
        dp[0][0] = 0;
        for(int i=1; i<=N; ++i) {
            for(int v=0; v<=V; ++v) {
                dp[i][v] = Math.min(dp[i-1][v], dp[i][v]);
                if(v-vs[i]>=0)
                    dp[i][v] = Math.min(dp[i][v], dp[i-1][v-vs[i]] + ws[i]);
                if(dp[i][v] <= W) {
                    value = Math.max(value, v);
                }
            }
        }

//        d0(dp);

        return value;
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
