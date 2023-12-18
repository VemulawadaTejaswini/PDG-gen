import java.io.*;
import java.util.*;

public class Main {

    static int K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        K = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        for (long l : solve()) {
            pw.println(l);
        }
        pw.flush();
    }

    static long[] solve() {
        Set<Long> nums = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            nums.add((long)i);
        }
        for (int i = 1; i <= 9999; i++) {
            int len = String.valueOf(i).length();
            int times = 15 - len;
            for (int j = 1; j <= times; j++) {
                nums.add( Long.parseLong(i + nines(j)) );
            }
        }
        List<Snuke> candidates = new ArrayList<>();
        for (Long num : nums) {
            candidates.add(new Snuke(num));
        }
        candidates.sort(Comparator.comparingLong(s -> s.i));

        List<Snuke> matches = new ArrayList<>();
        loop: for (int i = 0; i < candidates.size(); i++) {
            Snuke s = candidates.get(i);
            int test = Math.max(100, candidates.size()-i);
            for (int j = i+1; j < test; j++) {
                Snuke after = candidates.get(j);
                if( s.compareTo(after) > 0 ) continue loop;
            }
            matches.add(s);
        }

        long[] ans = new long[K];
        for (int i = 0; i < K; i++) {
            ans[i] = matches.get(i).i;
        }
        return ans;
    }

    static String nines(int times) {
        char[] cs = new char[times];
        Arrays.fill(cs, '9');
        return new String(cs);
    }

    static class Snuke implements Comparable<Snuke> {
        long i;
        int p;

        public Snuke(long i) {
            this.i = i;
            this.p = toPoint(i);
        }

        @Override
        public int compareTo(Snuke o) {
            // i/p <= o.i/o.p
            // -> i*o.p <= o.i*p
            long a = i * o.p;
            long b = o.i * p;
            return Long.compare(a, b);
        }
    }

    static int toPoint(long value) {
        String s = String.valueOf(value);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    @SuppressWarnings("unused")
    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

