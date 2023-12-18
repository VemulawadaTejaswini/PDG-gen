import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

class Main{

    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    static int get(String s) {
        return Integer.parseInt(s);
    }

    static int max(int a, int b) {
        return Integer.max(a, b);
    }

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static long kn2(int N, int W, int[] ws, int[] vs) {
        int V = IntStream.of(vs).sum();
        OptionalInt W_MAX = IntStream.of(ws).max();
      long[][] dp = new long[N + 1][V + 1];

        for (int n = 0; n <= N; ++n) {
            for (int v = 0; v <= V; ++v) {
                dp[n][v] = Long.MAX_VALUE - W_MAX.getAsInt();
            }
        }

        long value = 0;
        dp[0][0] = 0;
        for (int i = 1; i <= N; ++i) {
            for (int v = 0; v <= V; ++v) {
                dp[i][v] = Math.min(dp[i - 1][v], dp[i][v]);
                if (v - vs[i] >= 0)
                    dp[i][v] = Math.min(dp[i][v], dp[i - 1][v - vs[i]] + ws[i]);
                if (dp[i][v] <= W) {
                    value = Math.max(value, v);
                }
            }
        }

        return value;
    }

    public static void main(String[] args) throws Exception

    {
        PrintWriter p = new PrintWriter(System.out);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] nw = bf.readLine().split(" ");//.map(Integer::parseInt).toArray();
        int n =  Integer.parseInt(nw[0]);
        int w = get( nw[1]);
        // int n = Integer.parseInt(bf.readLine());
        int[] val = new int[110], wt = new int[110];
        // p.printf("%d %d \n",n,w);
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split(" ");
            wt[i] = get(temp[0]);
            val[i] = get(temp[1]);
            // c[i] = get(temp[2]);

        }

        long ans = kn2(n, w, wt, val);
        p.println(ans);
        p.flush();
    }
}