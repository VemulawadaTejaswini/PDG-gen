import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int h = nextInt(), n = nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
            b[i] = nextInt();
        }

        int[] minPoints = new int[h + 1];
        Arrays.fill(minPoints, Integer.MAX_VALUE);
        minPoints[0] = 0;
        for (int i = 1; i < minPoints.length; i++) {
            for (int j = 0; j < n; j++) {
                minPoints[i] = Math.min(minPoints[i], b[j] + minPoints[Math.max(0, i - a[j])]);
            }
        }

        System.out.println(minPoints[h]);
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