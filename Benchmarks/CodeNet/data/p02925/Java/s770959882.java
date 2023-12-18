
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final MyList[] combination = new MyList[n];
        final List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            indexList.add(i);
            combination[i] = new MyList();
            for (int j = 0; j < n - 1; j++) {
                combination[i].list.add(scanner.nextInt() - 1);
            }
        }

        int counter = 0;
        while (true) {
            counter++;

            final Set<Integer> skip = new HashSet<>();
            boolean doneOnceFlag = false;
            for (int index = 0; index < indexList.size(); index++) {
                final int i = indexList.get(index);
                if (combination[i].list.isEmpty()) {
                    indexList.remove(index);
                    index--;
                    continue;
                }
                if (skip.contains(i)) {
                    continue;
                }

                final Integer opponent = combination[i].list.get(0);

                if (skip.contains(opponent)) {
                    continue;
                }

                if (combination[opponent].list.get(0) == i) {
                    combination[i].list.remove(0);
                    if (combination[i].list.isEmpty()) {
                        indexList.remove(index);
                        index--;
                    }

                    combination[opponent].list.remove(0);
                    if (combination[opponent].list.isEmpty()) {
                        indexList.remove(indexList.indexOf(opponent));
                        index--;
                    }
                    skip.add(i);
                    skip.add(opponent);
                    doneOnceFlag = true;
                }
            }

            if (indexList.isEmpty()) {
                System.out.println(counter - 1);
                return;
            }

            if (!doneOnceFlag) {
                System.out.println(-1);
                return;
            }
        }
    }

    static class MyList {
        final List<Integer> list = new ArrayList<>();
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
