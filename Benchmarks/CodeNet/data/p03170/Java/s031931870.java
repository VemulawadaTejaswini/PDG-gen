import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt(), k = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();

        boolean[] winningPositions = new boolean[k + 1];

        winningPositions[0] = true;
        for (int value : a) winningPositions[value] = true;

        for (int i = 1; i < winningPositions.length; i++) {
            for (int value: a) {
                if (value < i) winningPositions[i] |= !winningPositions[i - value];
            }
        }

        System.out.println(winningPositions[k] ? "First" : "Second");
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