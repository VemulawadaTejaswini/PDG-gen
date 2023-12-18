import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

// E - Knapsack 2 / atcoder.jp
// 문제 링크 : https://atcoder.jp/contests/dp/tasks/dp_e
// 문제 해설 : https://jinpyo.kim/EducationalDP-solution
// Submission : https://atcoder.jp/contests/dp/submissions/9204970

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
        // Java 8에서 새로 추가된 Stream을 사용해서, 합을 구해봅니다.
        int V = IntStream.of(vs).sum();
        // 문제의 'Constraints'에서 주어진것 처럼 Wi의 값이 매우 크기 때문에,
        // int를 사용해서 풀면, overflow 되는 문제가 발생합니다.
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

        return value;
    }
}
