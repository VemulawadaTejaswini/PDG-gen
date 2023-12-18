/*
    Author: Anthony Ngene
    Created: 22/07/2020 - 13:50
*/

import java.io.*;
import java.util.*;

public class Main {
    // The secret of business is to know something that nobody else knows. – Aristotle Onassis
    private static final FastWriter out = new FastWriter();
    static int rowLen;
    static int colLen;
    static String[] grid;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        CF_Reader in = new CF_Reader();

        rowLen = in.intNext();
        colLen = in.intNext();

        grid = new String[rowLen];
        for (int i = 0; i < rowLen; i++) grid[i] = in.line();

        int ans = 0;
        for (int r = 0; r < rowLen; r++) {
            for (int c = 0; c < colLen; c++) {
                if (grid[r].charAt(c) == '.') ans = Math.max(ans, explore(r, c));
            }
        }
        out.println(ans);

        out.close();
    }

    static int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int explore(int row, int col) {
        visited = new boolean[rowLen][colLen];
        int best = 0;
        Deque<int[]> deque = new LinkedList<>();
        deque.add(new int[]{row, col, 0});
        visited[row][col] = true;
        while (deque.size() > 0) {
            int[] node = deque.pollFirst();
            best = Math.max(best, node[2]);
            for (int[] rc : directions) {
                int r = node[0] + rc[0];
                int c = node[1] + rc[1];
                if (r < 0 || r >= rowLen || c < 0 || c >= colLen || grid[r].charAt(c) == '#' || visited[r][c]) continue;
                visited[r][c] = true;
                deque.add(new int[]{r, c, node[2] + 1});
            }
        }
        return best;
    }

    static class FastWriter {
        private static final int IO_BUFFERS = 128 * 1024;
        private final StringBuilder out;

        public FastWriter() {
            out = new StringBuilder(IO_BUFFERS);
        }

        public FastWriter p(Object object) {
            out.append(object);
            return this;
        }

        public FastWriter p(String format, Object... args) {
            out.append(String.format(format, args));
            return this;
        }

        public FastWriter println(Object object) {
            out.append(object).append("\n");
            return this;
        }

        public void close() throws IOException {
            System.out.print(out);
        }
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }

    static class util {
        public static int upperBound(long[] array, long obj) {
            int l = 0, r = array.length - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj < array[c]) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static int upperBound(ArrayList<Long> array, long obj) {
            int l = 0, r = array.size() - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj < array.get(c)) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static int lowerBound(long[] array, long obj) {
            int l = 0, r = array.length - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj <= array[c]) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static int lowerBound(ArrayList<Long> array, long obj) {
            int l = 0, r = array.size() - 1;
            while (r - l >= 0) {
                int c = (l + r) / 2;
                if (obj <= array.get(c)) {
                    r = c - 1;
                } else {
                    l = c + 1;
                }
            }
            return l;
        }

        public static void print(long[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        public static void print(int[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        public static void print(char[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        static <T> T[][] deepCopy(T[][] matrix) {
            return Arrays.stream(matrix).map(el -> el.clone()).toArray($ -> matrix.clone());
        }

        static int[][] deepCopy(int[][] matrix) {
            return Arrays.stream(matrix).map(int[]::clone).toArray($ -> matrix.clone());
        }
    }

    static class Tuple implements Comparable<Tuple> {
        int a;
        int b;

        public Tuple(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int compareTo(Tuple other) {
            if (this.a == other.a) return Integer.compare(this.b, other.b);
            return Integer.compare(this.a, other.a);
        }

        @Override
        public int hashCode() {
            return Arrays.deepHashCode(new Integer[]{a, b});
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Tuple)) return false;
            Tuple pairo = (Tuple) o;
            return (this.a == pairo.a && this.b == pairo.b);
        }

        @Override
        public String toString() {
            return String.format("%d,%d  ", this.a, this.b);
        }
    }
}
