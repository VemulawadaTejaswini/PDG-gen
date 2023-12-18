import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        BitSet currentGroup;
        BitSet currentOtherGroup;
        int maxMinSize = -1;
        ArrayList<Integer> options;
        int n;
        BitSet[] edges;

        boolean stateIsValid() {
            BitSet COG = new BitSet(n);
            COG.or(currentOtherGroup);
            int card = COG.cardinality();
            for (int i = 0; i < n; i++) {
                if (COG.get(i)) {
                    COG.and(edges[i]);
                    if (COG.cardinality() != card) return false;
                    COG.or(currentOtherGroup);
                }
            }
            return true;
        }

        boolean findOne() {
            boolean res = false;
            if (stateIsValid()) {
                int card = currentGroup.cardinality();
                maxMinSize = Math.max(maxMinSize, Math.min(card, n - card));
                res = true;
            }
            for (int i1 = 0; i1 < n; i1++) {
                int i = options.get(i1);
                if (currentOtherGroup.get(i)) {
                    for (int j1 = i1 + 1; j1 < n; j1++) {
                        int j = options.get(j1);
                        if (currentOtherGroup.get(j)) {
                            if (!edges[i].get(j)) {
                                BitSet x = (BitSet) edges[i].clone();
                                x.and(currentGroup);
                                if (x.cardinality() == currentGroup.cardinality()) {
                                    currentOtherGroup.flip(i);
                                    currentGroup.flip(i);
                                    boolean res1 = findOne();
                                    currentOtherGroup.flip(i);
                                    currentGroup.flip(i);
                                    if (res1) return true;
                                }
                                x = (BitSet) edges[j].clone();
                                x.and(currentGroup);
                                if (x.cardinality() == currentGroup.cardinality()) {
                                    currentOtherGroup.flip(j);
                                    currentGroup.flip(j);
                                    boolean res1 = findOne();
                                    currentOtherGroup.flip(j);
                                    currentGroup.flip(j);
                                    if (res1) return true;
                                }
                            }
                        }
                    }
                }
            }
            return res;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long start = System.nanoTime();
            n = in.NextInt();
            int m = in.NextInt();
            edges = new BitSet[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new BitSet(n);
                edges[i].set(i, true);
            }
            for (int i = 0; i < m; i++) {
                int u = in.NextInt() - 1;
                int v = in.NextInt() - 1;
                edges[u].set(v, true);
                edges[v].set(u, true);
            }

            currentGroup = new BitSet(n);
            currentOtherGroup = new BitSet(n);
            currentOtherGroup.set(0, n, true);
            options = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                options.add(i);
            }
            while (System.nanoTime() - start < 1_800_000_000L) {
                Collections.shuffle(options);
                findOne();
            }
            if (maxMinSize == -1) {
                out.println(-1);
            } else {
                out.println(maxMinSize * (maxMinSize - 1) / 2 + (n - maxMinSize) * (n - maxMinSize - 1) / 2);
            }
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

    }
}

