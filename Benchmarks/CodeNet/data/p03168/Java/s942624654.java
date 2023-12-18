import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt();

        double[] probability = new double[N];

        for (int i = 0; i < probability.length; i++) probability[i] = nextDouble();

        double[][] coinProbabilities = new double[N + 1][N + 1];

        coinProbabilities[0][0] = 1;

        for (int i = 0; i < coinProbabilities.length; i++) {
            for (int j = 0; i + j <= N; j++) {
                int numOfCoins;
                if (i > 0) {
                    numOfCoins = j + i - 1;
                    coinProbabilities[i][j] += coinProbabilities[i - 1][j] * probability[numOfCoins];
                }

                if (j > 0) {
                    numOfCoins = i + j - 1;
                    coinProbabilities[i][j] += coinProbabilities[i][j - 1] * (1 - probability[numOfCoins]);
                }
            }
        }

        double ans = 0.0;
        for (int i = 0; i < coinProbabilities.length; i++) {
            for (int j = 0; j < coinProbabilities.length; j++) {
                if (i + j == N && i > j) ans += coinProbabilities[i][j];
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

    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
