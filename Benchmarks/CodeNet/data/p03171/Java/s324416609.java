import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) values[i] = nextInt();

        long start = System.currentTimeMillis();
        long[][][] optimalScores = new long[n + 1][][];

        for (int l = 1; l <= n; l++) {
            optimalScores[l] = new long[n - l + 1][2];
            for (int i = 0; i + l - 1 < n; i++) {
                int j = i + l - 1;
                boolean inRange = l - 1 > 0 && (i + 1 < optimalScores[l - 1].length);
                if (l % 2 == n % 2) {
                    long takeI = values[i] + (inRange ? optimalScores[l - 1][i + 1][0] : 0);
                    long takeJ = values[j] + (l - 1 > 0 ? optimalScores[l - 1][i][0] : 0);
                    if (takeI > takeJ) {
                        optimalScores[l][i][0] = takeI;
                        optimalScores[l][i][1] = (inRange ? optimalScores[l - 1][i + 1][1] : 0);
                    } else {
                        optimalScores[l][i][0] = takeJ;
                        optimalScores[l][i][1] = (l - 1 > 0 ? optimalScores[l - 1][i][1] : 0);
                    }
                } else {
                    long takeI = values[i] + (inRange ? optimalScores[l - 1][i + 1][1] : 0);
                    long takeJ = values[j] + (l - 1 > 0 ? optimalScores[l - 1][i][1] : 0);
                    if (takeI > takeJ) {
                        optimalScores[l][i][1] = takeI;
                        optimalScores[l][i][0] = (inRange ? optimalScores[l - 1][i + 1][0] : 0);
                    } else {
                        optimalScores[l][i][1] = takeJ;
                        optimalScores[l][i][0] = (l - 1 > 0 ? optimalScores[l - 1][i][0] : 0);
                    }
                }
            }
        }

//        for(long[][] lengths: optimalScores) {
//            if (lengths != null) {
//                for (long[] scores : lengths) {
//                    System.out.print(Arrays.toString(scores) + " ");
//                }
//                System.out.println();
//            } else System.out.println("null");
//        }
        System.out.println(optimalScores[n][0][0] - optimalScores[n][0][1]);
//        System.out.println(optimalScores[n][0][0]);
//        System.out.println((System.currentTimeMillis() - start) + "ms");
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