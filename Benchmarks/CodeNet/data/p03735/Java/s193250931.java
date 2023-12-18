import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] X, Y;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();
        X = new int[N];
        Y = new int[N];
        for (int i = 0; i < N; i++) {
            int x = fc.nextInt();
            int y = fc.nextInt();
            if( x > y ) {
                int t = x;
                x = y;
                y = t;
            }
            X[i] = x;
            Y[i] = y;
        }
        System.out.println(solve());
    }

    static long solve() {
        if( N == 1 ) return (long)Math.abs(X[0] - Y[0]) * Math.abs(X[0] - Y[0]);

        // x < yに並べてあるのでそれを前提にしている
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        int max = -1;
        int maxIdx = -1;

        for (int i = 0; i < N; i++) {
            if( min > X[i] ) {
                min = X[i];
                minIdx = i;
            }
            if( max < Y[i] ) {
                max = Y[i];
                maxIdx = i;
            }
        }

        if( minIdx == maxIdx ) {
            return caseMinMaxIsOtherSize(minIdx, maxIdx);
        } else {
            return Math.min(caseMinMaxIsSameSide(minIdx, maxIdx), caseMinMaxIsOtherSize(minIdx, maxIdx));
        }
    }

    static long caseMinMaxIsSameSide(int minIdx, int maxIdx) {
        // min, max どちらも片方(red)に存在する場合
        // もう片側(blue)はいい感じに選択して幅を最小にすることを目指すことができる
        int rmax = Y[maxIdx];
        int rmin = X[minIdx];

        Box[] boxes = new Box[N];
        for (int i = 0; i < N; i++) {
            boxes[i] = new Box(i, X[i], Y[i]);
        }
        boxes[minIdx].flip();

        PriorityQueue<Box> q = new PriorityQueue<>(Comparator.comparingInt(box -> box.x));
        Collections.addAll(q, boxes);

        while(true) {
            Box box = q.peek();
            if( box.x < box.y ) {
                box.flip();
                q.poll();
                q.add( box );

            } else {
                break;
            }
        }

        Box first = q.poll();
        int bmin = first.x;
        Box last = q.poll();
        while(!q.isEmpty()) {
            last = q.poll();
        }
        int bmax = last.x;

        return (long)(bmax - bmin) * (rmax - rmin);
    }

    static long caseMinMaxIsOtherSize(int minIdx, int maxIdx) {
        int maxx = -1;
        int miny = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            maxx = Math.max(X[i], maxx);
            miny = Math.min(Y[i], miny);
        }

        // System.out.println("(" + maxx + " - " + X[minIdx] + ") * (" + Y[maxIdx] + " - " + miny + ")");
        return (long)(maxx - X[minIdx]) * (Y[maxIdx] - miny);
    }

    static class Box {
        int i, x, y;

        public Box(int i, int x, int y) {
            this.i = i;
            this.x = x;
            this.y = y;
        }

        void flip() {
            int t = x;
            x = y;
            y = t;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
