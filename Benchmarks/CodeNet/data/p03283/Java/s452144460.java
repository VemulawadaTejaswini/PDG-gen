
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int q = scanner.nextInt();

        final MySet[] mySets = new MySet[n];
		for (int i = 0; i < n; i++) {
			mySets[i] = new MySet();
		}

        for (int i = 0; i < m; i++) {
            final int begin = scanner.nextInt() - 1;
            final int end = scanner.nextInt();

            for (int j = begin; j < end; j++) {
                mySets[j].set.add(i);
            }
        }

        for (int i = 0; i < q; i++) {
            final int begin = scanner.nextInt() - 1;
            final int end = scanner.nextInt();

            final Set<Integer> beginSet = new HashSet<>();
            final Set<Integer> endSet = new HashSet<>();
            final Set<Integer> middleSet = new HashSet<>();

            if (begin > 0) {
                beginSet.addAll(mySets[begin - 1].set);
            }

            if (end < n) {
                endSet.addAll(mySets[end].set);
            }

            for (int j = begin; j < end; j++) {
                middleSet.addAll(mySets[j].set);
            }

            middleSet.removeAll(beginSet);
            middleSet.removeAll(endSet);
            System.out.println(middleSet.size());
        }
    }

    static class MySet {
        final HashSet<Integer> set = new HashSet<>();
    }

    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
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
    }
}
