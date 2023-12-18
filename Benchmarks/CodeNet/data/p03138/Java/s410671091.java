import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public static int ti;

        public static BitSet convert(long value) {
            BitSet bits = new BitSet(41);
            int index = 0;
            while (value != 0L) {
                if (value % 2L != 0) {
                    bits.set(index);
                    ti[index]++;
                }
                ++index;
                value = value >>> 1;
            }
            return bits;
        }

        public static long convert(BitSet bits) {
            long value = 0L;
            for (int i = 0; i < bits.length(); ++i) {
                value += bits.get(i) ? (1L << i) : 0L;
            }
            return value;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            ArrayList<Long> a = new ArrayList<>();
            BitSet b[] = new BitSet[n];
            BitSet ans = new BitSet(41);
            ti = new int[41];
            BitSet kb = new BitSet(41);
            int index = 0;
            while (k != 0L) {
                if (k % 2L != 0) {
                    kb.set(index);
                }
                ++index;
                k = k >>> 1;
            }
            for (int i = 0; i < n; i++) {
                long temp = in.nextLong();
                b[i] = convert(temp);
                a.add(temp);
            }
            boolean fone = false;
            for (int i = 40; i >= 0; i--) {
                if (!kb.get(i) && !fone) {
                    continue;
                }
                if (kb.get(i)) {
                    if (ti[i] <= n / 2) {
                        ans.set(i);
                    } else {
                        fone = true;
                    }
                } else {
                    if (ti[i] <= n / 2) {
                        ans.set(i);
                    }
                }
            }
            long val = convert(ans);
            long anss = 0;
            for (int i = 0; i < n; i++) {
                anss += a.get(i) ^ val;
            }
            out.println(anss);

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

