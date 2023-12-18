import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        BDoNotDuplicate solver = new BDoNotDuplicate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDoNotDuplicate {
        private static final int MAX = 200_001;
        private static final int BASE = 200_009;
        private static final int MODS = 2;
        private static final int[] MOD = {(int) 1e9 + 7, (int) 1e9 + 9};

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            long k = in.longs();
            int[] a = in.ints(n);

            int[] array = new int[MAX];
            int len = 0;
            int[] index = new int[MAX];
            long[][] hash = new long[MODS][MAX + 1];
            HashMap<BDoNotDuplicate.HashEntry, Long> mem = new HashMap<>();


            Arrays.fill(index, -1);
            for (long turn = 0; turn < k * n; turn++) {
                long i = turn / n;
                int j = (int) (turn % n);
                if (index[a[j]] >= 0 && index[a[j]] < len && array[index[a[j]]] == a[j]) {
                    len = index[a[j]];
                } else {
                    array[len] = a[j];
                    for (int l = 0; l < MODS; l++) {
                        hash[l][len + 1] = (hash[l][len] * BASE + a[j]) % MOD[l];
                    }
                    index[a[j]] = len++;
                }
                BDoNotDuplicate.HashEntry entry = new BDoNotDuplicate.HashEntry(j, hash[0][len], hash[1][len]);
                Long prev = mem.get(entry);
                if (prev == null) {
                    mem.put(entry, i);
                } else {
                    long period = i - prev;
                    turn += (k - i - 1L) / period * period * n;
                }
            }
            for (int i = 0; i < len; i++) {
                out.ans(array[i]);
            }
            out.ln();
        }

        private static class HashEntry {
            int j;
            long[] hashes;

            HashEntry(int j, long... hashes) {
                this.j = j;
                this.hashes = hashes;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                BDoNotDuplicate.HashEntry hashEntry = (BDoNotDuplicate.HashEntry) o;

                if (j != hashEntry.j) return false;
                return Arrays.equals(hashes, hashEntry.hashes);
            }

            public int hashCode() {
                int result = j;
                result = 31 * result + Arrays.hashCode(hashes);
                return result;
            }

        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

