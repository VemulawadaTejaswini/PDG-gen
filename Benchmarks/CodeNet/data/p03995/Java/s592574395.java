

import java.io.*;
import java.util.*;

/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    static int[] readArray(int size, InputReader in) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        Map<Integer, Map<Integer, Integer>> rows = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> cols = new HashMap<>();
        int[][] cells = new int[k][3];

        for (int i = 0; i < k; i++) {
            int r = in.nextInt();
            int c = in.nextInt();
            int a = in.nextInt();

            cells[i] = new int[]{r, c, a};
            if (!rows.containsKey(r)) {
                rows.put(r, new HashMap<>());
            }
            if (!cols.containsKey(c)) {
                cols.put(c, new HashMap<>());
            }
            rows.get(r).put(c, a);
            cols.get(c).put(r, a);
        }

        Set<Integer> visitedRows = new HashSet<>();
        Set<Integer> visitedCols = new HashSet<>();


        while (visitedRows.size() < rows.size()) {
            Integer row = rows.keySet().iterator().next();
            if (!dfsRow(row, rows, cols, visitedRows, visitedCols, 0, Integer.MAX_VALUE, new HashMap<>(), new HashMap<>(), 0)) {
                out.println("No");
                out.close();
                return;
            }
        }

        out.println("Yes");
        out.close();
    }

    private static boolean dfsRow(Integer row, Map<Integer, Map<Integer, Integer>> rows, Map<Integer, Map<Integer, Integer>> cols,
                               Set<Integer> visitedRows, Set<Integer> visitedCols,
                               int min, int max, Map<Integer, Integer> rowDeltas, Map<Integer, Integer> colDeltas, int delta) {
        rowDeltas.put(row, delta);
        visitedRows.add(row);
        for (Integer col : rows.get(row).keySet()) {

            if (!visitedCols.contains(col)) {
                min = Math.max(min, rows.get(row).get(col) - delta);
                if (min > max) {
                    return false;
                }
                if (!dfsCol(col, rows, cols, visitedRows, visitedCols, min, max, rowDeltas, colDeltas, rows.get(row).get(col) - delta)) {
                    return false;
                }
            } else if (colDeltas.containsKey(col) && colDeltas.get(col) != rows.get(row).get(col) - delta) {
                return false;
            }
        }

        return true;
    }

    private static boolean dfsCol(Integer col, Map<Integer, Map<Integer, Integer>> rows, Map<Integer, Map<Integer, Integer>> cols,
                               Set<Integer> visitedRows, Set<Integer> visitedCols,
                               int min, int max, Map<Integer, Integer> rowDeltas, Map<Integer, Integer> colDeltas, int delta) {
        colDeltas.put(col, delta);
        visitedCols.add(col);
        for (Integer row : cols.get(col).keySet()) {
            if (!visitedRows.contains(row)) {
                max = Math.min(max, cols.get(col).get(row) - delta);
                if (min > max) {
                    return false;
                }
                if (!dfsRow(row, rows, cols, visitedRows, visitedCols, min, max, rowDeltas, colDeltas, cols.get(col).get(row) - delta)) {
                    return false;
                }
            } else if (rowDeltas.containsKey(row) && rowDeltas.get(row) != cols.get(col).get(row) - delta) {
                return false;
            }
        }

        return true;
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(' ');
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextWord() {
            return next();
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}