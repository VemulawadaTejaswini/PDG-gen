import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int N = nextInt();

        int[] a = new int[N], b = new int[N], c = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = nextInt();
            b[i] = nextInt();
            c[i] = nextInt();
        }

        int[] chooseA = new int[N];
        int[] chooseB = new int[N];
        int[] chooseC = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            if (i == N - 1) {
                chooseA[i] = a[i];
                chooseB[i] = b[i];
                chooseC[i] = c[i];
            } else {
                chooseA[i] = a[i] + Math.max(chooseB[i + 1], chooseC[i + 1]);
                chooseB[i] = b[i] + Math.max(chooseA[i + 1], chooseC[i + 1]);
                chooseC[i] = c[i] + Math.max(chooseA[i + 1], chooseB[i + 1]);
            }
        }

        System.out.println(Math.max(chooseA[0], Math.max(chooseB[0], chooseC[0])));
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