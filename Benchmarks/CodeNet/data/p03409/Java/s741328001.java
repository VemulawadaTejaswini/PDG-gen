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
        Set<Integer>[] B2R = new Set[N];
        Set<Integer>[] R2B = new Set[N];
        for (int i = 0; i < N; i++) {
            B2R[i] = new HashSet<>();
            R2B[i] = new HashSet<>();
        }

        for (int b = 0; b < N; b++) {
            for (int r = 0; r < N; r++) {
                if( isFriendable(B[b], R[r]) ) {
                    B2R[b].add(r);
                    R2B[r].add(b);
                }
            }
        }

        // 二部グラフの最大マッチングらしいがアルゴリズムを知らないのでなんかそれっぽく頑張っている
        int pair = 0;
        while(true) {
            Pair p = findPair(B2R, R2B);
            if( p != null ) {
                B2R[p.b].clear();
                R2B[p.r].clear();

                for (Set<Integer> rs : B2R) rs.remove(p.r);
                for (Set<Integer> bs : R2B) bs.remove(p.b);
                pair++;
            } else {
                break;
            }
        }
        return pair;
    }

    static Pair findPair(Set<Integer>[] B2R, Set<Integer>[] R2B) {
        for (int b = 0; b < N; b++) {
            Set<Integer> set = B2R[b];
            if( set.size() == 1 ) {
                int r = set.iterator().next();
                return new Pair(b, r);
            }
        }

        for (int r = 0; r < N; r++) {
            Set<Integer> set = R2B[r];
            if( set.size() == 1 ) {
                int b = set.iterator().next();
                return new Pair(b, r);
            }
        }

        // なんか適当なsizeのやつから適当に取り除く
        for (int b = 0; b < N; b++) {
            Set<Integer> set = B2R[b];
            if( !set.isEmpty() ) {
                int r = set.iterator().next();
                return new Pair(b, r);
            }
        }

        for (int r = 0; r < N; r++) {
            Set<Integer> set = R2B[r];
            if( !set.isEmpty() ) {
                int b = set.iterator().next();
                return new Pair(b, r);
            }
        }

        return null;
    }

    static class Pair {
        int b;
        int r;

        public Pair(int b, int r) {
            this.b = b;
            this.r = r;
        }
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

