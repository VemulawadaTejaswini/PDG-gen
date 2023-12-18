import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static Box[] B;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();
        B = new Box[N];
        for (int i = 0; i < N; i++) {
            int x = fc.nextInt();
            int y = fc.nextInt();
            B[i] = new Box(i, x, y);
            B[i].reset();
        }
        System.out.println(solve());
    }

    static long solve() {
        if( N == 1 ) {
            return (long)(B[0].y - B[0].x) * (B[0].y - B[0].x);
        };

        // x < yに並べてあるのでそれを前提にしている
        int min = Integer.MAX_VALUE;
        int max = -1;

        for (int i = 0; i < N; i++) {
            if( min > B[i].x ) {
                min = B[i].x;
            }
            if( max < B[i].y ) {
                max = B[i].y;
            }
        }

        return Math.min(caseMinMaxIsOtherSize(min, max), caseMinMaxIsSameSide(min, max));
    }

    static long caseMinMaxIsSameSide(int rmin, int rmax) {
        // min, max どちらも片方に存在する場合
        // もう片側(はいい感じに選択して幅を最小にすることを目指すことができる
        int bmin_x;
        int bmax_x;
        {
            PriorityQueue<Box> q = new PriorityQueue<>(Comparator.comparingInt(box -> box.x));
            Collections.addAll(q, B);

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
            bmin_x = first.x;
            Box last = q.poll();
            while(!q.isEmpty()) {
                last = q.poll();
            }
            bmax_x = last.x;
        }

        for (Box box : B) {
            box.reset();
        }

        int bmin_y;
        int bmax_y;
        {

            PriorityQueue<Box> q = new PriorityQueue<>(Comparator.<Box>comparingInt(box -> box.y).reversed());
            Collections.addAll(q, B);

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
            bmax_y = first.y;
            Box last = q.poll();
            while(!q.isEmpty()) {
                last = q.poll();
            }
            bmin_y = last.y;
        }

        return (long)(Math.min(bmax_x - bmin_x, bmax_y - bmin_y)) * (rmax - rmin);
    }

    static long caseMinMaxIsOtherSize(int min, int max) {
        int rmin = min;
        int rmax = -1;
        int bmin = Integer.MAX_VALUE;
        int bmax = max;

        for (Box b : B) {
            // boxの中身は x < y になってるはずだけどまぁ
            b.reset();

            rmax = Math.max(b.x, rmax);
            bmin = Math.min(b.y, bmin);
        }

        return (long)(rmax - rmin) * (bmax - bmin);
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

        void reset() {
            if( x > y ) flip();
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
