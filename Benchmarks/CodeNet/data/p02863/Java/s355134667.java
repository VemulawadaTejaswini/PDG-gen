import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int T = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        long[][] dp = new long[N+1][T+1];
        int[][] prev_w = new int[N+1][T+1];
        for (int i=1;i<=N;i++) {
            for (int j=1;j<=T-1;j++) {
                if (j-A[i-1]>=0) {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-A[i-1]]+B[i-1]);
                    if (dp[i-1][j-A[i-1]]+B[i-1]>dp[i-1][j]) {
                        prev_w[i][j] = j-A[i-1];
                    } else {
                        prev_w[i][j] = j;
                    }
                } else {
                    dp[i][j]=dp[i-1][j];
                    prev_w[i][j] = j;
                }
            }
        }
    int cur_w = T-1;
    int[] visited = new int[N];
    for (int i = N-1; i >= 0; --i) {
        if (prev_w[i+1][cur_w] == cur_w - A[i]) {
            // out.println(i+" th item (weight = "+A[i]+", value = "+B[i]+")");
            visited[i]=1;
        }
        cur_w = prev_w[i+1][cur_w];
    }

    int max = 0;
    for (int i=0;i<N;i++) {
        if (visited[i]==0) {
            max=Math.max(max, B[i]);
        }
    }
    out.println(dp[N][T-1]+max);
    // out.println(Arrays.toString(visited));
        // out.println(N);

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
