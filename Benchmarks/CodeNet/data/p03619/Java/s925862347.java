// package agc.agc019;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int n = in.nextInt();
        int[][] fountains = new int[n][2];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2 ; j++) {
                fountains[i][j] = in.nextInt();
            }
        }
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);

        List<int[]> availablefountains = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            if (minX <= fountains[i][0] && fountains[i][0] <= maxX) {
                if (minY <= fountains[i][1] && fountains[i][1] <= maxY) {
                    availablefountains.add(new int[]{ Math.abs(x1-fountains[i][0]), Math.abs(y1-fountains[i][1])});
                }
            }
        }


        out.println(String.format("%.15f", solve(maxX-minX, maxY-minY, availablefountains)));
        out.flush();
    }

    static final double HALF = 20 * Math.PI / 2;
    static final double QUARTER = HALF / 2;
    static final double CORNER = 20;
    static final double LATTICE_SIZE = 100;

    private static double solve(int W, int H, List<int[]> fountains) {
        int n = fountains.size();

        double base = (W + H) * LATTICE_SIZE;
        if (W == 0 || H == 0) {
            return fountains.size() >= 1 ? base + (HALF - CORNER) : base;
        }

        Set<Integer> xset = new HashSet<>();
        Set<Integer> yset = new HashSet<>();
        for (int[] f : fountains) {
            if (f[0] >= 1) {
                xset.add(f[0]-1);
            }
            xset.add(f[0]);
            xset.add(f[0]+1);
            if (f[1] >= 1) {
                yset.add(f[1]-1);
            }
            yset.add(f[1]);
            yset.add(f[1]+1);
        }

        xset.add(0);
        yset.add(0);
        xset.add(W);
        yset.add(H);
        xset.add(W+1);
        yset.add(H+1);


        Map<Integer,Integer> xmap = new HashMap<>();
        List<Integer> xarr = new ArrayList<>(xset);
        Collections.sort(xarr);
        for (int i = 0 ; i < xarr.size() ; i++) {
            xmap.put(xarr.get(i), i);
        }

        Map<Integer,Integer> ymap = new HashMap<>();
        List<Integer> yarr = new ArrayList<>(yset);
        Collections.sort(yarr);
        for (int i = 0 ; i < yarr.size() ; i++) {
            ymap.put(yarr.get(i), i);
        }



        List<Event> event = new ArrayList<>();
        for (int i = 0 ; i < fountains.size() ; i++) {
            int[] fo = fountains.get(i);

            if (fo[0] >= 1) {
                event.add(new Event(xmap.get(fo[0] - 1), ymap.get(fo[1]), i, 0, 0));
            }
            event.add(new Event(xmap.get(fo[0] + 1), ymap.get(fo[1]), i, 1, 0));
            if (fo[1] >= 1) {
                event.add(new Event(xmap.get(fo[0]), ymap.get(fo[1]) - 1, i, 0, 1));
            }
            event.add(new Event(xmap.get(fo[0]), ymap.get(fo[1] + 1), i, 1, 1));
        }
        event.add(new Event(xmap.get(W), ymap.get(H), -1, -1, -1));

        Collections.sort(event, (u, v) -> (u.x != v.x) ? u.x - v.x : u.y - v.y);


        int[] ini = new int[1000000];
        Arrays.fill(ini, 10000000);
        SegmentTreePURMQ seg = new SegmentTreePURMQ(ini);
        seg.update(0, 0);

        int[][] way = new int[n][2];

        int bestWithoutFlag = 1000000000;
        int bestWithFlag = 1000000000;

        for (Event e : event) {
            if (e.type == 0) {
                // in
                int best = seg.min(0, e.y + 1);
                if (e.which == 0) {
                    if (yarr.get(e.y + 1) == H + 1) {
                        bestWithFlag = Math.min(bestWithFlag, best);
                    } else {
                        way[e.idx][1-e.which] = Math.min(way[e.idx][1-e.which], best-1);
                    }
                } else {
                    if (xarr.get(e.x + 1) == W + 1) {
                        bestWithFlag = Math.min(bestWithFlag, best);
                    } else {
                        way[e.idx][1-e.which] = Math.min(way[e.idx][1-e.which], best-1);
                    }
                }
            } else if (e.type == 1) {
                // out
                int score = way[e.idx][e.which];
                if (seg.get(e.y) > score) {
                    seg.update(e.y, score);
                }
            } else {
                // final
                bestWithoutFlag = Math.min(bestWithoutFlag, seg.min(0, ymap.get(H) + 1));
            }
        }

        debug(bestWithFlag, bestWithoutFlag);


        return base + Math.min(bestWithoutFlag * (CORNER - QUARTER), bestWithFlag * (CORNER - QUARTER) + HALF - CORNER);
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }


    /**
     * Segment tree (point update, range minimum query)
     */
    public static class SegmentTreePURMQ {
        int N;
        int M;
        int[] seg;

        public SegmentTreePURMQ(int[] data) {
            N = Integer.highestOneBit(data.length-1)<<2;
            M = (N >> 1) - 1;

            seg = new int[N];
            Arrays.fill(seg, Integer.MAX_VALUE);
            for (int i = 0 ; i < data.length ; i++) {
                seg[M+i] = data[i];
            }
            for (int i = M-1 ; i >= 0 ; i--) {
                seg[i] = compute(i);
            }
        }

        /**
         * Uodates value at position minIndexSum.
         *
         * @param idx
         * @param value
         */
        public void update(int idx, int value) {
            seg[M+idx] = value;
            int i = M+idx;
            while (true) {
                i = (i-1) >> 1;
                seg[i] = compute(i);
                if (i == 0) {
                    break;
                }
            }
        }

        public int get(int idx) {
            return seg[M+idx];
        }

        private int compute(int i) {
            return Math.min(seg[i*2+1], seg[i*2+2]);
        }

        /**
         * Finds minimum value from range [l,r).
         *
         * @param l
         * @param r
         * @return minimum value
         */
        public int min(int l, int r) {
            return min(l, r, 0, 0, M+1);
        }

        private int min(int l, int r, int idx, int fr, int to) {
            if (to <= l || r <= fr) {
                return Integer.MAX_VALUE;
            }
            if (l <= fr && to <= r) {
                return seg[idx];
            }

            int med = (fr+to) / 2;
            int ret = Integer.MAX_VALUE;
            ret = Math.min(ret, min(l, r, idx*2+1, fr, med));
            ret = Math.min(ret, min(l, r, idx*2+2, med, to));
            return ret;
        }

        public int findIndexLessThanV(int l, int r, int v) {
            int ret = findIndexLessThanV(l, r, 0, 0, M+1, v);
            if (ret == Integer.MAX_VALUE) {
                return -1;
            }
            return ret;
        }

        private int findIndexLessThanV(int l, int r, int idx, int fr, int to, int v) {
            if (to <= l || r <= fr) {
                return Integer.MAX_VALUE;
            }

            if (seg[idx] > v) {
                return Integer.MAX_VALUE;
            }

            int med = (fr+to) / 2;
            if (l <= fr && to <= r) {
                int len = to-fr;
                if (len == 1) {
                    return idx-M;
                }
            }

            int left = findIndexLessThanV(l, r, idx*2+1, fr, med, v);
            if (left < Integer.MAX_VALUE) {
                return left;
            } else {
                return findIndexLessThanV(l, r, idx*2+2, med, to, v);
            }
        }
    }

    static class Event {
        int x;
        int y;
        int idx;
        int type;
        int which;

        Event(int a, int b, int _id, int _type, int w) {
            x = a;
            y = b;
            idx = _id;
            type = _type;
            which = w;
        }
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