import static java.lang.Math.min;
import static java.util.Comparator.comparingLong;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        var s = new String[n * 2];
        var c = new long[n * 2];
        var id = new int[n * 2][];
        int idCount = 1; // id = 0 は空文字列を指す
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
            c[i] = in.nextLong();
            s[n + i] = new StringBuilder(s[i]).reverse().toString();
            c[n + i] = c[i];
            id[i] = new int[s[i].length()];
            id[n + i] = new int[s[i].length()];
            for (int j = 0; j < s[i].length(); j++) {
                id[i][j] = idCount;
                idCount++;
                id[n + i][j] = idCount;
                idCount++;
            }
        }
        List<List<Edge>> g = new ArrayList<>(idCount);
        for (int i = 0; i < idCount; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n * 2; i++) {
            for (int p = 0; p < s[i].length(); p++) {
                for (int j = 0; j < n * 2; j++) {
                    // 「反転していない文字列」と「反転した文字列」の対だけを比較
                    if (i / n == j / n)
                        continue;
                    int len = min(s[i].length() - p, s[j].length());
                    String a = s[i].substring(p, p + len);
                    String b = s[j].substring(0, len);
                    if (!a.equals(b))
                        continue;
                    int to;
                    if (s[i].length() - p < s[j].length()) {
                        to = id[j][len];
                    } else if (s[i].length() - p > s[j].length()) {
                        to = id[i][p + len];
                    } else {
                        to = 0;
                    }
                    g.get(id[i][p]).add(new Edge(to, c[j]));
                }
            }
        }
        long INF = Long.MAX_VALUE / 2;
        var dist = new long[idCount];
        Arrays.fill(dist, INF);
        var q = new PriorityQueue<>(comparingLong(Elem::sumCost));
        for (int i = 0; i < n; i++) {
            int idValue = id[i][0];
            dist[idValue] = c[i];
            q.offer(new Elem(idValue, c[i]));
        }
        while (!q.isEmpty()) {
            Elem elem = q.poll();
            if (dist[elem.id] != elem.sumCost)
                continue;
            for (Edge edge : g.get(elem.id)) {
                long newCost = elem.sumCost + edge.cost;
                if (dist[edge.to] <= newCost)
                    continue;
                dist[edge.to] = newCost;
                q.offer(new Elem(edge.to, newCost));
            }
        }
        long ans = dist[0];
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (isPalindrome(s[i], j, s[i].length())) {
                    ans = min(ans, dist[id[i][j]]);
                }
            }
        }
        out.println(ans == INF ? -1 : ans);
    }
    private static boolean isPalindrome(String a, int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException();
        }
        for (int i = from, j = to - 1; i < j; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    private static final class Edge {
        final int to;
        final long cost;
        Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    private static final class Elem {
        final int id;
        final long sumCost;
        Elem(int id, long sumCost) {
            this.id = id;
            this.sumCost = sumCost;
        }
        long sumCost() {
            return sumCost;
        }
    }
    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        new Main().solve(new MyScanner(System.in), w);
        w.flush();
    }
    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;

        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isVisibleChar(int c) {
            return 33 <= c && c <= 126;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        String next() {
            return next(16);
        }
        String next(int n) {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isVisibleChar(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            long limit = -Long.MAX_VALUE;
            if (c == '-') {
                minus = true;
                limit = Long.MIN_VALUE;
                c = readByte();
            }
            long n = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                if (n < limit / 10L) {
                    throw new InputMismatchException();
                }
                n *= 10L;
                int digit = c - '0';
                if (n < limit + digit) {
                    throw new InputMismatchException();
                }
                n -= digit;
                c = readByte();
            } while (c != -1 && isVisibleChar(c));
            return minus ? n : -n;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int h, int w) {
            char[][] result = new char[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        long[][] nextVerticalLongArrays(int arrayCount, int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        char[][] nextVerticalCharArrays(int arrayCount, int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
        List<String> nextStringList(int n) {
            var result = new ArrayList<String>(n);
            for (int i = 0; i < n; i++) {
                result.add(next());
            }
            return result;
        }
        List<Integer> nextIntList(int n) {
            var result = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) {
                result.add(nextInt());
            }
            return result;
        }
        List<Long> nextLongList(int n) {
            var result = new ArrayList<Long>(n);
            for (int i = 0; i < n; i++) {
                result.add(nextLong());
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void println(int[] x) {
            println(x, " ");
        }
        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(long[] x) {
            println(x, " ");
        }
        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }
        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }
        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }
        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }
        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}
