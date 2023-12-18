import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FLISOnTree solver = new FLISOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLISOnTree {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int[] arr = s.nextIntArray(n);
            HashMap<Integer, ArrayList<Integer>> map = FLISOnTree.Tree.takeInput(n, s);
            int[] ans = new int[n];
            TreeMap<Integer, Integer> lowerAns = new TreeMap<>();
            HashSet<Integer> visited = new HashSet<>();
            func(map, 1, ans, 1, lowerAns, visited, arr);
            out.println(FLISOnTree.arrays.printArr(ans));
        }

        private void func(HashMap<Integer, ArrayList<Integer>> map, int src, int[] ans, int max, TreeMap<Integer, Integer> lowerAns, HashSet<Integer> visited, int[] arr) {
            Integer lower = lowerAns.lowerKey(arr[src - 1]);
            if (lower == null) {
                ans[src - 1] = 1;
            } else {
                ans[src - 1] = lowerAns.get(lower) + 1;
            }
            max = Math.max(max, ans[src - 1]);
            visited.add(src);
            ArrayList<Integer> children = map.get(src);
            int maxTillNow = max;
            int lower1 = lowerAns.getOrDefault(arr[src - 1], -1);
            lowerAns.put(arr[src - 1], Math.max(lowerAns.getOrDefault(arr[src - 1], 1), ans[src - 1]));
            for (Integer child : children) {
                if (!visited.contains(child)) {
                    func(map, child, ans, max, lowerAns, visited, arr);
                }
            }

            lowerAns.remove(arr[src - 1]);
            if (lower1 != -1) {
                lowerAns.put(arr[src - 1], lower1);
            }

            ans[src - 1] = Math.max(ans[src - 1], maxTillNow);
        }

        private static class Tree {
            public static HashMap<Integer, ArrayList<Integer>> takeInput(int size, FastReader s) {
                HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
                for (int i = 0; i < size - 1; i++) {
                    int src = s.nextInt();
                    int dest = s.nextInt();

                    ArrayList<Integer> list = map.getOrDefault(src, new ArrayList<>());
                    list.add(dest);
                    map.put(src, list);

                    list = map.getOrDefault(dest, new ArrayList<>());
                    list.add(src);
                    map.put(dest, list);
                }

                return map;
            }

        }

        private static class arrays {
            static String formatString(String str) {
                str = str.replace(",", "").replace("[", "").replace("]", "");
                return str;
            }

            static StringBuilder printArr(Object arr) {
                String str = null;
                if (arr instanceof int[]) {
                    str = Arrays.toString((int[]) arr);
                }

                if (arr instanceof long[]) {
                    str = Arrays.toString((long[]) arr);
                }

                if (arr instanceof char[]) {
                    str = Arrays.toString((char[]) arr);
                }

                if (arr instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) arr);
                }

                if (arr instanceof byte[]) {
                    str = Arrays.toString((byte[]) arr);
                }

                if (arr instanceof double[]) {
                    str = Arrays.toString((double[]) arr);
                }

                if (arr instanceof float[]) {
                    str = Arrays.toString((float[]) arr);
                }

                if (arr instanceof short[]) {
                    str = Arrays.toString((short[]) arr);
                }

                if (str != null) {
                    return new StringBuilder(formatString(str));
                }

                return null;

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

