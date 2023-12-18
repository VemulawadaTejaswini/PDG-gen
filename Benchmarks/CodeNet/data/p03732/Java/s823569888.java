import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int W;
    static Obj[] O;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        O = new Obj[N];
        for (int i = 0; i < N; i++) {
            O[i] = new Obj(sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    private static long solve() {
        int w1 = O[0].weight;
        for (Obj obj : O) {
            obj.weight -= w1;
        }

        List<Obj> g0 = new ArrayList<>();
        List<Obj> g1 = new ArrayList<>();
        List<Obj> g2 = new ArrayList<>();
        List<Obj> g3 = new ArrayList<>();
        for (Obj obj : O) {
            if( obj.weight == 0 ) {
                g0.add(obj);
            } else if( obj.weight == 1 ) {
                g1.add(obj);
            } else if( obj.weight == 2 ) {
                g2.add(obj);
            } else if( obj.weight == 3 ) {
                g3.add(obj);
            } else {
                throw new RuntimeException("wtf");
            }
        }

        Comparator<Obj> c = Comparator.comparingInt(o -> o.value);
        c = c.reversed();
        g0.sort(c);
        g1.sort(c);
        g2.sort(c);
        g3.sort(c);

        int[] s0 = sigma(g0);
        int[] s1 = sigma(g1);
        int[] s2 = sigma(g2);
        int[] s3 = sigma(g3);

        int max = 0;
        for (int i0 = 0; i0 < s0.length; i0++) {
            for (int i1 = 0; i1 < s1.length; i1++) {
                for (int i2 = 0; i2 < s2.length; i2++) {
                    for (int i3 = 0; i3 < s3.length; i3++) {
                        long w = i0*w1 + i1*(w1+1) + i2*(w1+2) + i3*(w1+3);
                        if( w > W ) continue;

                        max = Math.max(s0[i0] + s1[i1] + s2[i2] + s3[i3], max);
                    }
                }
            }
        }
        return max;
    }

    private static int[] sigma(List<Obj> objs) {
        Comparator<Obj> c = Comparator.comparingInt(o -> o.value);
        c = c.reversed();
        objs.sort(c);

        int[] s = new int[objs.size() + 1];
        for (int i = 0; i < objs.size(); i++) {
            s[i+1] = s[i] + objs.get(i).value;
        }
        return s;
    }

    private static void show(long[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (long i : array) {
            j.add("" + i);
        }
        System.err.println( j.toString() );
    }

    private static class Obj {
        private int weight; // 0 to 3
        private final int value;

        public Obj(int weight, int value) {
            this.weight = weight;
            this.value = value;
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
