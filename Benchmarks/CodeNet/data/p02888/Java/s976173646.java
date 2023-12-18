import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        int[] ls = new int[n];
        for (int i = 0; i < n; i++) {
            ls[i] = 2*nextInt();
        }

        Arrays.sort(ls);
        int triples = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = i + 1; j < ls.length; j++) {
                int a = ls[i];
                int b = ls[j];

                int min = Math.abs(a - b) + 1;
                int max = a + b - 1;

                int minIndex = Arrays.binarySearch(ls, min);
                minIndex = -(minIndex + 1);
                minIndex = Math.max(j + 1, minIndex);

                int maxIndex = Arrays.binarySearch(ls, max);
                maxIndex = -(maxIndex + 1);
                maxIndex = Math.min(maxIndex, ls.length);

                if (maxIndex >= minIndex) {
                    triples += (maxIndex - minIndex);
                }
            }
        }

        System.out.println(triples);
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