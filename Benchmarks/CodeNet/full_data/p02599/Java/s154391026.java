import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static class Task {

        private static final int MAXN = 500005;
        private int[] a;
        private int[] root;
        private int[] data;
        private int[] ls;
        private int[] rs;
        private int cnt;
        private Map<Integer, Integer> mp;

        private int mid(int l, int r) {
            return (l + r) >>> 1;
        }

        int build(int l, int r) {
            int t = cnt++;
            data[t] = 0;
            if (l == r) return t;
            ls[t] = build(l, mid(l, r));
            rs[t] = build(mid(l, r) + 1, r);
            return t;
        }

        int update(int p, int l, int r, int v, int w) {
            int t = cnt++;
            data[t] = data[p] + w;
            if (l == r) return t;
            if (v <= mid(l, r)) {
                rs[t] = rs[p];
                ls[t] = update(ls[p], l, mid(l, r), v, w);
            } else {
                ls[t] = ls[p];
                rs[t] = update(rs[p], mid(l, r) + 1, r, v, w);
            }
            return t;
        }

        int query(int t, int l, int r, int v) {
            if (l == r) return data[t];
            if (v <= mid(l, r)) return query(ls[t], l, mid(l, r), v) + data[rs[t]];
            else return query(rs[t], mid(l, r) + 1, r, v);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            a = new int[MAXN];
            root = new int[MAXN];
            data = new int[MAXN * 20];
            ls = new int[MAXN * 20];
            rs = new int[MAXN * 20];
            cnt = 1;
            int n = in.nextInt();
            int q = in.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }

            mp = new HashMap<>();

            root[0] = build(1, n);
            for (int i = 1; i <= n; i++) {
                if (!mp.containsKey(a[i]))
                    root[i] = update(root[i - 1], 1, n, i, 1);
                else {
                    int tmp = update(root[i - 1], 1, n, mp.get(a[i]), -1);
                    root[i] = update(tmp, 1, n, i, 1);
                }
                mp.put(a[i], i);
            }

            for (int i = 0; i < q; i++) {
                int l, r;
                l = in.nextInt();
                r = in.nextInt();
                out.println(query(root[r], 1, n, l));
            }

        }

        private static void sort(double[] arr) {
            Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
            Arrays.sort(objArr);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = objArr[i];
            }
        }

        private static void sort(int[] arr) {
            Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(objArr);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = objArr[i];
            }
        }

        private static void sort(long[] arr) {
            Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
            Arrays.sort(objArr);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = objArr[i];
            }
        }

        private static void solve() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            Task task = new Task();
            task.solve(1, in, out);
            out.close();
        }

        public static void main(String[] args) {
            new Thread(null, () -> solve(), "1", 1 << 26).start();
        }

        static class InputReader {

            public BufferedReader reader;
            public StringTokenizer tokenizer;

            public InputReader(InputStream stream) {
                reader = new BufferedReader(new InputStreamReader(stream), 32768);
                tokenizer = null;
            }

            public String next() {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    try {
                        tokenizer = new StringTokenizer(reader.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return tokenizer.nextToken();
            }

            public int nextInt() {
                return Integer.parseInt(next());
            }

            public long nextLong() {
                return Long.parseLong(next());
            }

            public double nextDouble() {
                return Double.parseDouble(next());
            }

        }

    }
}