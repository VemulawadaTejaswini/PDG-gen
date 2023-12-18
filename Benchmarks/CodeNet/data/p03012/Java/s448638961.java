import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt();

        int[] weights = new int[N];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = nextInt();
            if (i > 0) weights[i] += weights[i - 1];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < weights.length - 1; i++) min = Math.min(min, Math.abs(weights[weights.length - 1] - 2*weights[i]));

        System.out.println(min);
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