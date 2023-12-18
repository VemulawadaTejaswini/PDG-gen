import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {

    long[] dp = new long[100001];
    int N;
    long A;
    long B;
    long[] x;
    private void solve() throws IOException {

        N = nextInt();
        A = nextLong();
        B = nextLong();
        x = new long[N];
        for(int i = 0; i < N; ++i) {
            x[i] = nextLong();
        }
        Arrays.fill(dp, -1L);
        long best = go(0,x[0]);
        writer.println(best);

    }

    private long go(int id,long cur) {
        if(id == N - 1) return 0L;
        if(dp[id] != -1) return dp[id];

        long best = Long.MAX_VALUE;
        // walk by A
        best = Math.min(best,go(id + 1, x[id + 1]) + (A * Math.abs(x[id+1] - cur)));
        best = Math.min(best,go(id + 1,x[id + 1]) + B);
        return dp[id] =best;
    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("highcard.in"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("highcard.out");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}