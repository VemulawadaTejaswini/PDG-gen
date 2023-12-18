
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int q = scanner.nextInt();

        final MySet[] addSets = new MySet[n];
        final MySet[] delSets = new MySet[n];
        for (int i = 0; i < n; i++) {
            addSets[i] = new MySet();
            delSets[i] = new MySet();
        }

        for (int i = 0; i < m; i++) {
            final int begin = scanner.nextInt() - 1;
            final int end = scanner.nextInt() - 1;

            addSets[begin].set.add(i);
            delSets[end].set.add(i);
        }

        for (int i = 0; i < q; i++) {
            final int begin = scanner.nextInt() - 1;
            final int end = scanner.nextInt() - 1;
            final Set<Integer> contentSet = new HashSet<>();

            int max = 0;

            for (int j = begin; j <= end; j++) {
                max += addSets[j].set.size();
                contentSet.addAll(addSets[j].set);
                contentSet.removeAll(delSets[j].set);
            }

            System.out.println(max - contentSet.size());
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
