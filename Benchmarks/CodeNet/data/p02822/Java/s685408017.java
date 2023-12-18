import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new int[N-1];
        B = new int[N-1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }

        System.out.println(solve());
    }

    static int MOD = 1_000_000_007;

    static int solve() {
        int[] POW2 = new int[N+1];
        POW2[0] = 1;
        for (int i = 0; i < N; i++) {
            POW2[i+1] = mul(POW2[i], 2);
        }

        int[][] G = adjB(N, A, B);
        int[] mikaku = new int[N];  // 挟まれそうな数
        int[] kaku = new int[N];    // 挟まれた数
        int[] nodeCnt = new int[N]; // 以下に何個nodeがあるか
        int ROOT = 0;
        for (Node node : orderFromLeaf(N, G, ROOT)) {
            // ROOTでないleaf, 黒も白もない
            if( G[node.a].length == 1 && node.a != ROOT) {
                nodeCnt[node.a] = 1;
                continue;
            }

            int childNodeCnt = 0;
            for (int b : G[node.a]) {
                if( b == node.parent ) continue;
                childNodeCnt += nodeCnt[b];
            }
            nodeCnt[node.a] = childNodeCnt + 1;

            int sumOnlyBlackCase = 0;
            for (int b : G[node.a]) {
                if( b == node.parent ) continue;

                // bのみが黒のケース
                int onlyBlackCase = sub(POW2[nodeCnt[b]], 1);
                sumOnlyBlackCase = add(sumOnlyBlackCase, onlyBlackCase);

                // bのみが黒の場合にaを黒く塗る
                kaku[node.a] += mikaku[b];
                kaku[node.a] += kaku[b];
                // bのみが黒の場合にaを白く塗る
                mikaku[node.a] += mikaku[b];
                kaku[node.a] += kaku[b];

                // bが黒で他にも黒がある場合
                int otherCnt = childNodeCnt - nodeCnt[b];
                int otherBlackCase = sub(POW2[otherCnt], 1); // 全部白以外
                // debug(node.a, b, otherBlackCase);
                // aが黒のばあい
                kaku[node.a] += mul(kaku[b], otherBlackCase);
                kaku[node.a] += mul(mikaku[b], otherBlackCase);
                // aが白のばあい
                kaku[node.a] += mul(kaku[b], otherBlackCase);
                kaku[node.a] += mul(mikaku[b], otherBlackCase);
            }

            // 手下に黒が一つだけのケースでaが白の場合未確定
            mikaku[node.a] += sumOnlyBlackCase;
            // 手下が二つ以上黒のケースでaが白の場合確定
            kaku[node.a] += sub(sub(POW2[childNodeCnt], 1), sumOnlyBlackCase); // 全ケース - 全部白 - 一つだけ黒
        }

//        for (int i = 0; i < N; i++) {
//            debug(i, kaku[i], mikaku[i], nodeCnt[i]);
//        }

        return div(kaku[ROOT], POW2[N]);
    }

    static Node[] orderFromLeaf(int N, int[][] G, int root) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        Node[] ret = new Node[N];
        int idx = N-1;
        q.add(new Node(-1, root));
        while(!q.isEmpty()) {
            Node n = q.poll();
            ret[idx--] = n;
            for (int next : G[n.a]) {
                if( next == n.parent ) continue;

                q.add(new Node(n.a, next));
            }
        }
        return ret;
    }

    static int pow(int base, long exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c < 0 ) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD-2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) c %= MOD;
        return (int)c;
    }

    static class Node {
        int parent, a;

        public Node(int parent, int a) {
            this.parent = parent;
            this.a = a;
        }
    }

    static int[][] adjB(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int t : to) {
            cnt[t]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
            adj[to[i]][--cnt[to[i]]] = from[i];
        }
        return adj;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
