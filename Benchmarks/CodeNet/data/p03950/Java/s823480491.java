// package atcoder.arc.arc063;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int w = in.nextInt();
        int h = in.nextInt();
        int n = in.nextInt();
        int[][] pt = null;
        {
            int[][] tmp = in.nextIntTable(n, 2);
            List<int[]> ok = new ArrayList<>();
            for (int i = 0; i < n ; i++) {
                if (tmp[i][0] == 0 || tmp[i][0] == w) {
                    continue;
                }
                if (tmp[i][1] == 0 || tmp[i][1] == h) {
                    continue;
                }
                ok.add(tmp[i]);
            }
            pt = new int[ok.size()][];
            for (int i = 0; i < ok.size(); i++) {
                pt[i] = ok.get(i);
            }
        }
        n = pt.length;

        Arrays.sort(pt, (a, b) -> a[0] - b[0]);

        int max = 0;
        {
            // special cases
            int minX = w;
            int maxX = 0;
            int minY = h;
            int maxY = 0;
            for (int i = 0; i < n; i++) {
                minX = Math.min(minX, pt[i][0]);
                maxX = Math.max(maxX, pt[i][0]);
                minY = Math.min(minY, pt[i][1]);
                maxY = Math.max(maxY, pt[i][1]);
            }

            max = Math.max(max, h+minX);
            max = Math.max(max, h+w-maxX);
            max = Math.max(max, w+minY);
            max = Math.max(max, w+h-maxY);
        }



        debug(pt);

        SegmentGap gap = new SegmentGap(h);

        int L = 0;
        int R = 1;
        while (L+1 < n) {
            while (R < n) {
                int nowY = gap.maxGap();
                int tlen = pt[R][0]-pt[L][0]+nowY;
                if (max < tlen) {
                    // debug(L,R,gap.pts,pt[R][0]-pt[L][0],L,R,gap.maxGap(),tlen);
                    max = tlen;
                }
                if (R+1 >= n) {
                    break;
                }

                int dx = pt[R+1][0] - pt[R][0];
                gap.add(pt[R][1]);
                int toY = gap.maxGap();
                if (dx < nowY-toY) {
                    gap.remove(pt[R][1]);
                    break;
                }
                R++;
            }
            if (L+1 < n) {
                L++;
                if (L == R) {
                    gap = new SegmentGap(h);
                } else {
                    gap.remove(pt[L][1]);
                }
            }
        }


        out.println(max * 2);
        out.flush();
    }

    static class SegmentGap {
        public TreeSet<Integer> pts = new TreeSet<>();

        public TreeSet<int[]> gaps = new TreeSet<>((a, b) -> {
            int ga = a[1] - a[0];
            int gb = b[1] - b[0];
            if (ga == gb) {
                return a[0] - b[0];
            }
            return gb - ga;
        });

        public SegmentGap(int h) {
            pts.add(0);
            pts.add(h);
            gaps.add(new int[]{0, h});
        }

        public void add(int f) {
            int low = pts.lower(f);
            int high = pts.higher(f);
            gaps.remove(new int[]{low, high});
            gaps.add(new int[]{low, f});
            gaps.add(new int[]{f, high});
            pts.add(f);
        }

        public void remove(int f) {
            int low = pts.lower(f);
            int high = pts.higher(f);
            gaps.remove(new int[]{low, f});
            gaps.remove(new int[]{f, high});
            gaps.add(new int[]{low, high});
            pts.remove(f);
        }

        public int maxGap() {
            int[] f = gaps.first();
            return f[1] - f[0];
        }




    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int[] nextInts(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }


        private int[][] nextIntTable(int n, int m) {
            int[][] ret = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextInt();
                }
            }
            return ret;
        }

        private long[] nextLongs(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        private long[][] nextLongTable(int n, int m) {
            long[][] ret = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextLong();
                }
            }
            return ret;
        }

        private double[] nextDoubles(int n) {
            double[] ret = new double[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextDouble();
            }
            return ret;
        }

        private int next() {
            if (numChars == -1)
                throw new InputMismatchException();
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
            int c = next();
            while (isSpaceChar(c))
                c = next();
            if ('a' <= c && c <= 'z') {
                return (char) c;
            }
            if ('A' <= c && c <= 'Z') {
                return (char) c;
            }
            throw new InputMismatchException();
        }

        public String nextToken() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public long nextLong() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
