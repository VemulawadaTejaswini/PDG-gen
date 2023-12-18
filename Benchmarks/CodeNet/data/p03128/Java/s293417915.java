import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    static int N, M;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(M);

        System.out.println(solve());
    }

    static int[] C = {-1, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    static int[] CMAX;

    static String solve() {
        CMAX = new int[10];
        Arrays.sort(A);
        for (int a : A) {
            CMAX[C[a]] = a;
        }

        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(C[a]);
        }
        List<Integer> costs = new ArrayList<>(set);
        costs.sort(Comparator.naturalOrder());


        int best = costs.get(0);
        int q = N / best;
        int r = N % best;

        if( r == 0 ) {
            List<int[]> ans = new ArrayList<>();
            ans.add( new int[]{best, q} );
            return asString(ans);
        }

        List<Integer> subcosts = costs.subList(1, costs.size());
        subcosts.sort(Comparator.<Integer>comparingInt(cost -> {
            // costから数字にする
            return CMAX[cost];
        }).reversed());

        q -= 1;
        r += best;
        while(q >= 0) {
            List<Integer> result = dfs(r, subcosts);
            if( result != null ) {
                List<int[]> ans = new ArrayList<>();
                ans.add( new int[]{best, q} );
                ans.addAll(zip(result));
                return asString(ans);
            }

            q -= 1;
            r += best;
        }

        throw new IllegalArgumentException("wtf");
    }

    static List<int[]> zip(List<Integer> result) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (Integer r : result) {
            if( cnt.containsKey(r) ) {
                cnt.put(r, cnt.get(r)+1);
            } else {
                cnt.put(r, 1);
            }
        }
        List<int[]> ret = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
            ret.add(new int[]{e.getKey(), e.getValue()} );
        }
        return ret;
    }

    static List<Integer> dfs(int r, List<Integer> costs) {
        if( r == 0 ) return new ArrayList<>();
        if( r < 0 ) return null;

        for (int i = 0; i < costs.size(); i++) {
            int c = costs.get(i);
            List<Integer> result = dfs(r-c, costs);
            if( result != null ) {
                result.add(c);
                return result;
            }
        }
        return null;
    }

    static String asString(List<int[]> ans) {
        // 個数は決まったのでいい感じに並べる
        ans.sort(Comparator.<int[]>comparingInt(cc -> {
            // costから数字にする
            int cost = cc[0];
            return CMAX[cost];
        }).reversed());

        StringBuilder b = new StringBuilder();
        for (int[] each : ans) {
            int cost = each[0];
            int size = each[1];
            b.append( mkString(CMAX[cost], size));
        }
        return b.toString();
    }

    static String mkString(int c, int n) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < n; i++) {
            b.append(c);
        }
        return b.toString();
    }

    static boolean contains(int... ns) {
        for (int a : A) {
            for (int n : ns) {
                if( a == n ) return true;
            }
        }
        return false;
    }

    static class Num {
        int n, c;

        public Num(int n, int c) {
            this.n = n;
            this.c = c;
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

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
