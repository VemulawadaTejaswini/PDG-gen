
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by jaga on 9/22/16.
 */
public class Main{
    public static void solve(PrintWriter out, FastScanner in) {
        int n = in.nextInt(), m = in.nextInt();
        Pair[] svn = new Pair[n];

        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();

            svn[i] = new Pair(l, r);
        }
        Arrays.sort(svn);

//        ArrayList<Pair> range = new ArrayList<>();
        PriorityQueue<Pair> range = new PriorityQueue();
        for (int d = 1; d <= m; d++) {
            for (int i = 1; d * i <= m; i++) {
                //L = d * (i - 1) R = d * i
                int l = d * (i - 1);
                int r = d * (i);
                range.add(new Pair(r,     m, d,  1));
                range.add(new Pair(l,     m, d, -1));
                range.add(new Pair(r, r - 1, d, -1));
                range.add(new Pair(l, r - 1, d,  1));
            }
        }

//        Collections.sort(range);

        Bit bit = new Bit(m);
        int svnIdx = 0;
        int rangeIdx = 0;
        int res[] = new int[m + 1];
        for (int x = 1; x <= m; x++) {
            //bitにお土産を追加
            while (svnIdx < svn.length && svn[svnIdx].x <= x) {
                bit.add(svn[svnIdx].y, 1);
                svnIdx++;
            }

            //変えるお土産の数を返す
//            while ( rangeIdx < range.size()&& range.get(rangeIdx).x <= x ) {
//                Pair ran = range.get(rangeIdx ++);
            while ( rangeIdx < range.size()&& range.peek().x <= x ) {
                Pair ran = range.remove();
                if(ran.x == 0)continue;
                res[ran.d] += ran.p * bit.sum(ran.y);
            }
        }
        for(int i = 1;i < res.length;i++) {
            out.println(res[i]);
        }
    }

    static class Bit {
        int[] tree;
        int n;

        Bit(int n) {
            this.n = n;
            tree = new int[n + 1];
        }

        int sum(int i) {
            int res = 0;
            while (i > 0) {
                res += tree[i];
                i -= i & -i;
            }
            return res;
        }

        void add(int i, int x) {
            while (i <= n) {
                tree[i] += x;
                i += i & -i;
            }
        }
    }


    static class Pair implements Comparable {
        int x, y, d , p;

        Pair(int a, int b) {
            x = a;
            y = b;
        }

        Pair(int a, int b, int c , int d) {
            this.x = a;
            this.y = b;
            this.d = c;
            this.p = d;
        }

        public int compareTo(Object other) {
            Pair p1 = (Pair) other;
            return this.x - ((Pair) other).x; // IDの値に従い昇順で並び替えたい場合
//         return -(this.first - ((Pair) other).first); // IDの値に従い降順で並び替えたい場合
        }
    }

    /*以下はテンプレ*/
    public static void main(String args[]) {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastScanner in = new FastScanner();
        solve(out, in);
        out.close();

    }

    public static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufferLength <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextDoubleArray(m);
            }
            return map;
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) array[i] = nextInt();
            return array;
        }

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) array[i] = nextLong();
            return array;
        }

        public String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++) array[i] = next();
            return array;
        }

        public char[][] nextCharMap(int n) {
            char[][] array = new char[n][];
            for (int i = 0; i < n; i++) array[i] = next().toCharArray();
            return array;
        }

        public int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextIntArray(m);
            }
            return map;
        }
    }
}

