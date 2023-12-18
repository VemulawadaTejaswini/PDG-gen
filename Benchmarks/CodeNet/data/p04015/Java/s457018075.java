import java.io.*;
import java.util.*;
import java.util.Map.Entry;


/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    public static final Comparator<int[]> COMPARATOR = Comparator.comparingInt(o -> o[0]);

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
        long a = in.nextInt();
        int[] xs = readArray(n, in);
        Map<Integer, Integer> occs = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int x = xs[i];
            max = Math.max(max, x);
            occs.put(x, occs.getOrDefault(x, 0) + 1);
        }

        long[][] c = c(n + 1);

        Map<Integer, Map<Long, Map<Integer, Long>>> dp = new TreeMap<>();
        for (Entry<Integer, Integer> entry : occs.entrySet()) {
            int x = entry.getKey();
            int xOccs = entry.getValue();
            if (!dp.containsKey(x)) {
                dp.put(x, new HashMap<>());
            }
            for (int j = 0; j < xOccs; j++) {
                long key = ((long) x) * (j + 1);
                if (!dp.get(x).containsKey(key)) {
                    dp.get(x).put(key, new HashMap<>());
                }
                dp.get(x).get(key).put(j + 1, dp.get(x).get(key).getOrDefault(j + 1, 0L) + c[xOccs][j + 1]);
            }
        }

        for (Entry<Integer, Integer> entry : occs.entrySet()) {
            int x = entry.getKey();
            int xOccs = entry.getValue();
            Map<Integer, Map<Long, Map<Integer, Long>>> updates = new HashMap<>();

            for (Integer t : dp.keySet()) {
                if (t >= x) {
                    continue;
                }
                Map<Long, Map<Integer, Long>> tSums = dp.get(t);
                for (Long sum : tSums.keySet()) {
                    for (Integer k : tSums.get(sum).keySet()) {
                        for (int j = 0; j < xOccs && j + 1 + k <= n; j++) {
                            long newSum = ((long) x) * (j + 1) + sum;
                            if (!updates.containsKey(x)) {
                                updates.put(x, new HashMap<>());
                            }
                            if (!updates.get(x).containsKey(newSum)) {
                                updates.get(x).put(newSum, new HashMap<>());
                            }

                            updates.get(x).get(newSum).put(j + 1 + k,
                                    updates.get(x).get(newSum).getOrDefault(j + 1 + k, 0L)
                                            + c[xOccs][j + 1] * tSums.get(sum).get(k));
                        }

                    }
                }
            }

            for (Integer t : updates.keySet()) {
                for (Long sum : updates.get(t).keySet()) {
                    if (!dp.get(t).containsKey(sum)) {
                        dp.get(t).put(sum, new HashMap<>());
                    }

                    for (Integer k : updates.get(t).get(sum).keySet()) {
                        dp.get(t).get(sum).put(k, dp.get(t).get(sum).getOrDefault(k, 0L) + updates.get(t).get(sum).get(k));
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (Integer t : dp.keySet()) {
                Map<Long, Map<Integer, Long>> tSums = dp.get(t);
                if (tSums.containsKey(a * i)) {
                    ans += tSums.get(a * i).getOrDefault(i, 0L);
                }
            }

        }
        out.println(ans);
        out.close();
    }

    static long[][] c(int n) {
        long[][] res = new long[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = res[i - 1][j] + res[i - 1][j - 1];
                }
            }
        }

        return res;
    }

    private static long getLessThan(int[] yBits, int ind, int k, long[][] c) {
        if (k == 0) {
            return 1;
        }
        if (ind == -1 || k > ind) {
            return 0;
        }

        if (yBits[ind] == 0) {
            return getLessThan(yBits, ind - 1, k, c);
        } else if (yBits[ind] == 1) {
            return c[ind][k] + getLessThan(yBits, ind - 1, k - 1, c);
        } else {
            return c[ind][k - 1] + c[ind][k];
        }
    }

    private static long getGreaterThan(int[] xBits, int ind, int k, long[][] c) {
        if (k == 0) {
            while (ind >= 0) {
                if (xBits[ind] >= 1) {
                    return 0;
                }
                ind--;
            }
            return 1;
        }
        if (ind == -1 || k > ind + 1) {
            return 0;
        }
        if (xBits[ind] == 0) {
            if (ind == 0) {
                return 1;
            }
            return c[ind][k - 1] + getGreaterThan(xBits, ind - 1, k, c);
        } else if (xBits[ind] == 1) {
            return getGreaterThan(xBits, ind - 1, k - 1, c);
        }
        return 0;
    }

    private static int[] numToBits(long x, int k) {
        int[] res = new int[40];
        int i = 0;
        while (x > 0) {
            res[i] = ((int) (x % k));
            i++;
            x /= k;
        }
        return res;
    }

    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(" ");
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