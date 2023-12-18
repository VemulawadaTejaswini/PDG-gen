import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        init(System.in);
        int n = nextInt();
        long[] prefixSum = new long[n];
        HashMap<Long, Integer> occur = new HashMap<>();
        prefixSum[0] = (long) nextInt();
        occur.put(prefixSum[0], 1);
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = (long) nextInt();
            prefixSum[i] += prefixSum[i - 1];
            if (occur.containsKey(prefixSum[i])) occur.put(prefixSum[i], occur.get(prefixSum[i]) + 1);
            else occur.put(prefixSum[i], 1);
        }
        long ans = 0;
        if (occur.containsKey(0L)) ans += occur.get(0L);
        for (long val : prefixSum) {
            if (occur.get(val) > 0) occur.put(val, occur.get(val) - 1);
            ans += occur.get(val);
        }
        System.out.println(ans);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
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

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}

