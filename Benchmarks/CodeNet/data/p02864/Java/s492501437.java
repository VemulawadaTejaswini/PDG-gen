import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, K;
    static int[] H;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        H = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long INF = Long.MAX_VALUE/2;

    static long solve() {
        // 高さ0を追加してzipする
        int[] H0 = new int[N+1];
        System.arraycopy(H, 0, H0, 0, N);
        IntZip hzip = new IntZip(H0);

        // k回操作して高さがh(のindex)のときのコスト
        long[][] curr = new long[K+2][hzip.size()];
        long[][] next = new long[K+2][hzip.size()];
        for (int k = 0; k <= K; k++) {
            Arrays.fill(curr[k], INF);
        }
        curr[0][0] = 0; // k=0, 高さ=0から開始
        for (int i = 0; i < N; i++) {
            for (int k = 0; k <= K; k++) {
                Arrays.fill(next[k], INF);
            }

            int nh = H[i];
            int nhi = hzip.to_i(nh);
            for (int k = 0; k <= K; k++) {
                for (int chi = 0; chi < hzip.size(); chi++) {
                    int ch = hzip.to_v(chi);
                    long v = curr[k][chi];
                    if( v >= INF ) continue;

                    // 次をそのまま採用
                    // 高くなった場合にコストがかかる
                    next[k][nhi] = Math.min(next[k][nhi], v + Math.max(0, nh-ch));

                    // 全部の高さに遷移すると辛いがそんなに変更しても意味はないので現在と0に絞る

                    // Kを消費して高さを現在に合わせる
                    if( chi != nhi ) {
                        next[k+1][chi] = Math.min(next[k+1][chi], v);
                    }

                    // kを消費して高さを0にする
                    // 0にしても今はコストがかからない(谷ができるので次高いけど)
                    if( chi != 0 ) {
                        next[k+1][0] = Math.min(next[k+1][0], v);
                    }
                }
            }

            long[][] temp = curr;
            curr = next;
            next = temp;
        }

        long ans = INF;
        for (int k = 0; k <= K; k++) {
            for (int hi = 0; hi < hzip.size(); hi++) {
                ans = Math.min(ans, curr[k][hi]);
            }
        }
        return ans;
    }

    static Map<Integer, Integer> hzip() {
        int[] G = Arrays.copyOf(H, N);
        Arrays.sort(G);
        Map<Integer, Integer> zip = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < N; i++) {
            int g = G[i];
            if( zip.containsKey(g) ) {
                continue;
            } else {
                zip.put(g, idx++);
            }
        }
        return zip;
    }

    static class IntZip {
        Map<Integer, Integer> toIndex;
        int[] toValue;

        static Set<Integer> toSet(int[] A) {
            Set<Integer> set = new HashSet<>();
            for (int a : A) {
                set.add(a);
            }
            return set;
        }

        IntZip(int[] A) {
            this(toSet(A));
        }

        IntZip(Set<Integer> set) {
            toValue = new int[set.size()];
            int idx = 0;
            for (Integer each : set) {
                toValue[idx++] = each;
            }
            Arrays.sort(toValue);
            toIndex = new HashMap<>();
            for (int i = 0; i < set.size(); i++) {
                toIndex.put(toValue[i], i);
            }
        }

        int size() {
            return toIndex.size();
        }

        int to_i(int value) {
            return toIndex.get(value);
        }

        int to_v(int index) {
            return toValue[index];
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
