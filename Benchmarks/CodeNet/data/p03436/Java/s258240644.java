import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int H;
    static int W;
    static char[][] S;
    static int B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        S = new char[H][W];
        B = 0;
        for (int h = 0; h < H; h++) {
            String line = sc.nextLine();
            for (int w = 0; w < W; w++) {
                char c = line.charAt(w);
                S[h][w] = c;
                if( c == '#' ) B++;
            }
        }

        System.out.println( solve() );
    }

    private static int solve() {
        int step = wfs();
        if( step == -1 ) return -1;

        else return H * W - B - step - 1;
    }

    private static int wfs() {
        Set<Cord> done = new HashSet<>();
        PriorityQueue<Cord> q = new PriorityQueue<>();
        q.add( new Cord(0, 0, 0) );

        while(!q.isEmpty()) {
            Cord c = q.poll();
            if( done.contains(c) ) continue;
            if( c.h < 0 || c.h >= H || c.w < 0 || c.w >= W ) continue;
            if( S[c.h][c.w] == '#' ) continue;

            if( c.h == H-1 && c.w == W-1 ) return c.step;

            done.add(c);
            q.add( new Cord(c.h, c.w-1, c.step+1) );
            q.add( new Cord(c.h, c.w+1, c.step+1) );
            q.add( new Cord(c.h+1, c.w, c.step+1) );
            q.add( new Cord(c.h-1, c.w, c.step+1) );
        }
        return -1;
    }

    static class Cord implements Comparable<Cord> {
        private final int h;
        private final int w;
        private final int step;

        public Cord(int h, int w, int step) {
            this.h = h;
            this.w = w;
            this.step = step;
        }

        @Override
        public int compareTo(Cord o) {
            return Integer.compare(step, o.step);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cord cord = (Cord) o;
            return h == cord.h &&
                    w == cord.w;
        }

        @Override
        public int hashCode() {

            return Objects.hash(h, w);
        }
    }

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

        double nextDouble() {
            return Double.parseDouble(next());
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
