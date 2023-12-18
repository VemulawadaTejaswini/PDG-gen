import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt(), capacity = nextInt();

        int[] values = new int[N];
        int[] weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = nextInt();
            values[i] = nextInt();
        }

        long[][] dp = new long[capacity + 1][values.length + 1];

        for (int j = 0; j < dp[0].length; j++) {
            for (int k = 0; k < dp.length; k++) {
                if (j - 1 < 0) dp[k][j] = 0;
                else if (weights[j - 1] > k) dp[k][j] = dp[k][j - 1];
                else dp[k][j] = Math.max(dp[k][j - 1], values[j - 1] + dp[k - weights[j - 1]][j - 1]);
            }
        }

        System.out.println(dp[capacity][values.length]);
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