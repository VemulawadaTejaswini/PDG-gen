import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt(), W = nextInt();

        int[] weights = new int[N];
        int[] values = new int[N];

        int maxValue = 0;
        for (int i = 0; i < N; i++) {
            weights[i] = nextInt();
            values[i] = nextInt();
            maxValue += values[i];
        }

        // Since the weight/capacity is huge, for this problem, we shall consider values as the dimensions and find minimum weight for each value.
        long[][] dp = new long[maxValue + 1][N + 1];
        for (long[] longs : dp) Arrays.fill(longs, (long) (Math.pow(10, 18)));
        dp[0][0] = 0;
        
        for (int i = 0; i < dp[0].length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if (i - 1 < 0) break;
                else if (values[i - 1] > j) dp[j][i] = dp[j][i - 1];
                else dp[j][i] = Math.min(dp[j][i - 1], weights[i - 1] + dp[j - values[i - 1]][i - 1]);
            }
        }

        long ans = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (dp[i][j] <= W) ans = Math.max(ans, i);
            }
        }

        System.out.println(ans);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}