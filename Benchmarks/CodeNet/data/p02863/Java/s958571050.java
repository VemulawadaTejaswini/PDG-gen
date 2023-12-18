import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.StringTokenizer;

public class Main {
    static int max(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    static int max_2(int a, int b, int c) {
        if (a>=b && a>=c) {
            return a;
        } else if (b>=a && b>=c){
            return b;
        } else {
            return c;
        }
    }
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
        // long[][][] dp = new long[N+1][T+1][2];
        int[][][] dp = new int[N+1][T+1][2];
        for (int i=1;i<=N;i++) {
            for (int j=1;j<=T-1;j++) {
                if (j-A[i-1]>=0) {
                    int b = B[i-1];
                    int a = A[i-1];
                    // dp[i][j][0]=max(dp[i-1][j][0],dp[i-1][j-A[i-1]][0]+B[i-1]);
                    // dp[i][j][1]=max(dp[i-1][j][1], dp[i-1][j][0]+B[i-1]);
                    // dp[i][j][1]=max(dp[i][j][1], dp[i-1][j-A[i-1]][1]+B[i-1]);
                    dp[i][j][0]=max(dp[i-1][j][0],dp[i-1][j-a][0]+b);
                    dp[i][j][1]=max_2(dp[i-1][j][1], dp[i-1][j][0]+b, dp[i-1][j-a][1]+b);
                    // dp[i][j][1]=max(dp[i-1][j][1], dp[i-1][j][0]+b);
                    // dp[i][j][1]=max(dp[i][j][1], dp[i-1][j-a][1]+b);
                } else {
                    dp[i][j][0]=dp[i-1][j][0];
                    dp[i][j][1]=max(dp[i-1][j][1], dp[i-1][j][0]+B[i-1]);
                }
            }
        }
        out.println(dp[N][T-1][1]);
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
