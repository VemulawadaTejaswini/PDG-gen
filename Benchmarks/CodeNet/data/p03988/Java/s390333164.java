import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int[] a = readArray(n, in);
        if (solve(n, a)) {
            out.println("Possible");
        } else {
            out.println("Impossible");
        }

        out.close();
    }

    private static boolean solve(int n, int[] a) {
        sortArray(a);

        if (n == 2) {
            return true;
        } else if (n == 3) {
            return a[0] == 2 && a[1] == 1 && a[2] == 1;
        }

        int diameter = a[n - 1];
        if (diameter % 2 == 0) {
            if (a[0] != diameter / 2 || a[0] == a[1]) {
                return false;
            }
        } else {
            if (a[0] != diameter / 2 + 1 || a[1] != diameter / 2 + 1 || a[2] == a[1]) {
                return false;
            }
        }
        int last = diameter;
        for (int i = n - 1; i >= (diameter % 2 == 0 ? 1 : 2); i--) {
            if (a[i] == last) {
                continue;
            }
            if (a[i] != last - 1 || a[i - 1] != a[i]) {
                return false;
            }
            last = a[i];
        }
        return true;
    }

    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}