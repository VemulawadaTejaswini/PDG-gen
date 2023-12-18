import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        long votes1 = 1L;
        long votes2 = 1L;
        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            int t = in.nextInt();
            int a = in.nextInt();
            long k1 = (votes1 + t - 1) / t;
            long k2 = (votes2 + a - 1) / a;
            long k = Math.max(k1, k2);
            votes1 = t * k;
            votes2 = a * k;
        }
        out.println(votes1 + votes2);
        out.close();
    }

    static class Pair {
        private long first;
        private int second;

        public Pair(long first, int second) {
            this.first = first;
            this.second = second;
        }

        public long getFirst() {
            return first;
        }

        public void setFirst(long first) {
            this.first = first;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}
