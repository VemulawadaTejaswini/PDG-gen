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

    static int binSearch(int[] list, int key) {
        int l = -1;
        int r = list.length;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (list[m] > key) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }


    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        final int n = in.nextInt();
        final int m = in.nextInt();
        final int q = in.nextInt();
        final int[] a = readArray(q, in);
        List<Integer> order = new ArrayList<>();
        int[] used = new int[m + 1];
        Arrays.fill(used, Integer.MAX_VALUE);

        int[] sizes = new int[n];
        for (int i = q - 1; i >= 0; i--) {
            if (used[a[i]] == Integer.MAX_VALUE) {
                sizes[0]++;
                used[a[i]] = order.size();
                order.add(a[i]);
            } else {
                int ind = used[a[i]];
                int found = binSearch(sizes, ind);
                if (found >= 0 && found < sizes.length && sizes[found] == ind) {
                    sizes[found]++;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < used.length; i++) {
            if (used[i] == Integer.MAX_VALUE) {
                min = i;
                break;
            }
        }
        int possibleDiff = 0;
        for (int i = order.size() - 1; i >= 0; i--) {
            int ai = order.get(i);
            if (ai > min) {
                break;
            }
            min = ai;
            possibleDiff = order.size() - i;
        }
        if (sizes[0] - sizes[sizes.length - 1] > possibleDiff) {
            out.println("No");
        } else {
            out.println("Yes");
        }

//      out.println("Time:" + (System.currentTimeMillis() - startTime));
        out.close();
    }


    private static String outputArray(Iterable<Integer> ans, Map<String, Integer> out) {
        StringBuilder str = new StringBuilder();
        for (int an : ans) {
            str.append(an).append(' ');
        }
        String s = str.toString();
        out.put(s, out.getOrDefault(s, 0) + 1);
        return s;
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
