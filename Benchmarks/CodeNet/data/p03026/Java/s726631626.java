import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMaximumSumOfMinimum solver = new DMaximumSumOfMinimum();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMaximumSumOfMinimum {
        static int I = 0;

        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                int first = s.nextInt() - 1;
                int second = s.nextInt() - 1;
                ArrayList<Integer> list = map.getOrDefault(first, new ArrayList<>());
                list.add(second);
                map.put(first, list);

                list = map.getOrDefault(second, new ArrayList<>());
                list.add(first);
                map.put(second, list);

            }
            int[] c = s.nextIntArray(n);
            Arrays.sort(c);
            int[] k = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                k[i] = c[n - i - 1];
            }

            DMaximumSumOfMinimum.Node[] arr = new DMaximumSumOfMinimum.Node[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new DMaximumSumOfMinimum.Node(i);
            }
            boolean[] visited = new boolean[n];
            dfs(0, map, visited, arr, k);
            int sum = 0;
            for (int i = 0; i < k.length; i++) {
                if (i == 0) {
                    continue;
                } else {
                    sum += k[i];
                }
            }
            out.append(sum + "\n");
            for (DMaximumSumOfMinimum.Node k1 : arr) {
                out.append(k1.cVal + " ");
            }
            out.println();
        }

        private void dfs(int curr, HashMap<Integer, ArrayList<Integer>> map, boolean[] visited, DMaximumSumOfMinimum.Node[] arr, int[] c) {
            visited[curr] = true;
            arr[curr].cVal = c[I];
            ArrayList<Integer> list = map.getOrDefault(curr, new ArrayList<>());
            for (int k : list) {
                if (!visited[k]) {
//                arr[curr].add(arr[k]);
                    I++;
                    dfs(k, map, visited, arr, c);
                }
            }
//        return start;
        }

        private static class Node {
            int val;
            int cVal;

            public Node(int val) {
                this.val = val;
                cVal = -1;
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

