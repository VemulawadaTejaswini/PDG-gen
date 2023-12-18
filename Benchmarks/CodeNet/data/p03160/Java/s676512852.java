import java.io.*;
import java.util.StringTokenizer;

public class A {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt();

        int[] h = new int[N];

        for (int i = 0; i < h.length; i++) h[i] = nextInt();

        int[] dp = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            if (i == N - 1) dp[i] = 0;
            if (i + 1 < dp.length) dp[i] = dp[i + 1] + Math.abs(h[i + 1] - h[i]);
            if (i + 2 < dp.length) dp[i] = Math.min(dp[i], dp[i + 2] + Math.abs(h[i + 2] - h[i]));
        }

        System.out.println(dp[0]);
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