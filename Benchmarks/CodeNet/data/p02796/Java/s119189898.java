import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();
        int n = nextInt();
        ArrayList<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = nextInt(), l = nextInt();
            pairs.add(new Pair(x - l, x + l));
        }

        pairs.sort(Pair::compareTo);

        int currMin = Integer.MIN_VALUE;
        int keep = 0;

        for (Pair pair: pairs) {
            if (pair.first >= currMin) {
                keep++;
                currMin = pair.second;
            }
        }

        System.out.println(keep);
    }

    private static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair pair) {
            return second - pair.second;
        }
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
