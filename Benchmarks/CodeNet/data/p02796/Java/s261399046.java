import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static FastScanner scanner = new FastScanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        List<Interval> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int l = scanner.nextInt();
            list.add(new Interval(x-l, x+l));
        }
        list.sort((interval1, interval2) -> {
           return interval1.to - interval2.to;
        });

        int count = 0;
        int max = -1000000001;
        for (int i = 0; i < n; i++) {
            Interval inter = list.get(i);
            if (inter.from >= max) {
                count++;
                max = inter.to;
            }
        }

        System.out.println(count);
    }

    private static class Interval {
        int from;
        int to;
        public Interval(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    private static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            this.reader = new BufferedReader(new InputStreamReader(in));
        }

        public int[] nextLineToIntArray() {
            String[] stringArray = nextLineToStringArray();
            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            return intArray;
        }

        public String[] nextLineToStringArray() {
            return nextLine().split("");
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public String next() {
            if (this.tokenizer == null || !this.tokenizer.hasMoreElements()) {
                try {
                    this.tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            return this.tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String[] nextStringArray(int n) {
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = next();
            }
            return stringArray;
        }

        public int[] nextIntArray(int n) {
            int[] intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = nextInt();
            }
            return intArray;
        }

        public long[] nextLongArray(int n) {
            long[] longArray = new long[n];
            for (int i = 0; i < n; i++) {
                longArray[i] = nextLong();
            }
            return longArray;
        }

        public double[] nextDoubleArray(int n) {
            double[] doubleArray = new double[n];
            for (int i = 0; i < n; i++) {
                doubleArray[i] = nextDouble();
            }
            return doubleArray;
        }
    }
}
