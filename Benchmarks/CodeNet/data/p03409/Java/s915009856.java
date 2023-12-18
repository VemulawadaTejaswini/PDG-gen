import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static Cord[] R;
    static Cord[] B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();

        R = new Cord[N];
        for (int i = 0; i < N; i++) {
            R[i] = new Cord(i, sc.nextInt(), sc.nextInt());
        }
        B = new Cord[N];
        for (int i = 0; i < N; i++) {
            B[i] = new Cord(i, sc.nextInt(), sc.nextInt());
        }

        System.out.println( solve() );
    }

    private static int solve() {
        List<Cord> rs = new ArrayList<>(Arrays.asList(R));
        List<Cord> bs = new ArrayList<>(Arrays.asList(B));

        Comparator<Cord> by_x = Comparator.comparingInt(c -> c.x);
        rs.sort(by_x);
        bs.sort(by_x);

        int pair = 0;

        for (Cord b : bs) {
            Cord r_max_y = null;

            for (Cord r : rs) {
                if( isFriendable(b, r) ) {
                    if( r_max_y == null ) {
                        r_max_y = r;
                    } else {
                        if( r.y > r_max_y.y ) {
                            r_max_y = r;
                        }
                    }
                }
            }
            if( r_max_y != null ) {
                rs.remove( r_max_y );
                pair++;
            }
        }
        return pair;
    }

    private static boolean isFriendable(Cord b, Cord r) {
        return b.x > r.x && b.y > r.y;
    }

    static class Cord {
        int i;
        int x;
        int y;

        public Cord(int i, int x, int y) {
            this.i = i;
            this.x = x;
            this.y = y;
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

