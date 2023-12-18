import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println( solve() );
    }

    private static long solve() {
        List<Integer> as = new ArrayList<>();
        for (int a : A) {
            as.add(a);
        }

        List<List<Integer>> values = rebuild(as);
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (List<Integer> value : values) {
                ans += ((long)value.get(0) * value.size());
            }

            List<Integer> first = values.get(0);
            first.remove(0);
            values.remove(first);

            List<List<Integer>> rebuild = rebuild(first);
            rebuild.addAll(values);
            values = rebuild;
        }
        return ans;
    }

    static List<List<Integer>> rebuild(List<Integer> values) {
        if( values.isEmpty() ) return new ArrayList<>();

        List<List<Integer>> results = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int min = values.get(0);
        current.add(values.get(0));
        results.add(current);
        for (int i = 1; i < values.size(); i++) {

            if( values.get(i) < min ) {
                min = values.get(i);
                current = new ArrayList<>();
                results.add(current);
                current.add(values.get(i));

            } else {
                current.add(values.get(i));
            }
        }
        return results;
    }

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
