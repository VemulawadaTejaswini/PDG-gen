// package agc.agc017;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }
        int[] deg = new int[n+1];
        for (int i = 0  ; i < n ; i++) {
            deg[a[i]]++;
        }

        int INF = n+100;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(0, 0);
        map.put(INF, -1);

        int cost = 0;
        for (int i = 1 ; i <= n ; i++) {
            if (deg[i] >= 1 || i == n) {
                int diff = i - map.lowerKey(i);
                cost += Math.abs(diff - deg[i]);
                map.put(i, deg[i]);
            }
        }
        // debug(cost);

        for (int i = 0; i < m ; i++) {
            int x = in.nextInt();
            int from = a[x-1];
            int fromNext = map.higherKey(from);
            int to = in.nextInt();
            int toNext = map.higherKey(to);

            Set<Integer> set = new HashSet<>();
            int[] rec = new int[]{from, fromNext, to, toNext};
            for (int it : rec) {
                set.add(it);
            }

            for (int it : set) {
                cost -= computeCost(map, deg, it);
            }

            // debug("dcost", cost, rec);

            deg[from]--;
            if (deg[from] == 0 && from < n) {
                map.remove(from);
            } else {
                map.put(from, deg[from]);
            }

            deg[to]++;
            map.put(to, deg[to]);
            a[x-1] = to;

            // debug(map);

            for (int it : set) {
                cost += computeCost(map, deg, it);
            }

            // debug("acost", cost);
            out.println(cost / 2);
        }
        out.flush();
    }

    static int computeCost(TreeMap<Integer,Integer> map, int[] deg, int i) {
        if (i >= deg.length+10) {
            return 0;
        }

        if (deg[i] >= 1 || i == deg.length-1) {
            int diff = i - map.lowerKey(i);
            return Math.abs(diff - deg[i]);
        }
        return 0;
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}