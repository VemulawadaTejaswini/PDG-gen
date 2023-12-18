import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESymmetricGrid solver = new ESymmetricGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESymmetricGrid {
        char[][] s;
        char[][] t;
        char[][] tR;
        int h;
        int w;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();

            s = new char[h][];
            for (int i = 0; i < h; i++) {
                s[i] = in.next().toCharArray();
            }
            t = new char[h][w];
            tR = new char[h][w];

            BitSet avail = new BitSet();
            for (int i = 0; i < w; i++) {
                avail.set(i);
            }

            int[] perm = new int[w];
            boolean answer = false;
            if (w % 2 == 1) {
                for (int i = 0; i < w; i++) {
                    perm[w / 2] = i;
                    avail.clear(i);
                    answer |= go(perm, avail, 0);
                    avail.set(i);
                }
            } else {
                answer |= go(perm, avail, 0);
            }

            out.println(answer ? "YES" : "NO");
        }

        boolean go(int[] perm, BitSet avail, int index) {
            if (avail.cardinality() <= 1) {
                if (avail.cardinality() == 1) perm[index] = avail.nextSetBit(0);
                return eval(perm);
            } else {
                int first = avail.nextSetBit(0);
                avail.clear(first);
                for (int second = avail.nextSetBit(first + 1); second != -1; second = avail.nextSetBit(second + 1)) {
                    perm[index] = first;
                    perm[perm.length - 1 - index] = second;
                    avail.clear(second);
                    if (go(perm, avail, index + 1)) return true;
                    avail.set(second);
                }
                avail.set(first);
            }

            return false;
        }

        private boolean eval(int[] perm) {
            HashMap<String, Integer> columns = new HashMap<>();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    t[i][j] = s[i][perm[j]];
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    tR[i][w - 1 - j] = s[i][perm[j]];
                }
            }

            for (int i = 0; i < h; i++) {
                String cur = String.valueOf(t[i]);
                String curReverse = String.valueOf(tR[i]);
                int count = columns.getOrDefault(curReverse, 0);
                if (count > 0) {
                    columns.put(curReverse, count - 1);
                    if (count == 1) {
                        columns.remove(curReverse);
                    }
                } else {
                    columns.put(cur, columns.getOrDefault(cur, 0) + 1);
                }
            }

            if (h % 2 == 0) {
                return columns.isEmpty();
            } else {
                if (columns.size() > 1) return false;
                String cur = columns.keySet().iterator().next();
                if (columns.get(cur) > 1) return false;
                return isPalindrome(cur);
            }
        }

        private static boolean isPalindrome(String cur) {
            for (int i = 0; i < cur.length(); i++) {
                if (cur.charAt(i) != cur.charAt(cur.length() - 1 - i)) return false;
            }
            return true;
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

    }
}

