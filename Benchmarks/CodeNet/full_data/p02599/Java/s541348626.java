import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        FenwickTree ft1;
        FenwickTree ft2;

        public void range_add(int l, int r, int x) {
            ft1.point_update(l, x);
            ft1.point_update(r + 1, -x);
            ft2.point_update(l, x * (l - 1));
            ft2.point_update(r + 1, -x * r);
        }

        public int prefix_sum(int idx) {
            return ft1.rsq(idx) * idx - ft2.rsq(idx);
        }

        public int range_sum(int l, int r) {
            return prefix_sum(r) - prefix_sum(l - 1);
        }

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt() - 1;
            ft1 = new FenwickTree(2 * n + 3);
            ft2 = new FenwickTree(2 * n + 3);
            query[] queries = new query[q];
            for (int i = 0; i < queries.length; i++)
                queries[i] = new query(sc.nextInt(), sc.nextInt(), i);
            Arrays.sort(queries, (a, b) -> a.r == b.r ? a.l - b.l : a.r - b.r);
            int[] last = new int[n];
            int idx = 1;
            int[] ans = new int[n];
            for (int i = 0; i < q; i++) {
                query temp = queries[i];
                while (idx <= temp.r) {
                    int l = last[arr[idx - 1]];
                    last[arr[idx - 1]] = idx;
                    range_add(l + 1, idx, 1);
                    idx++;
                }
                ans[temp.idx] = range_sum(temp.l, temp.l);
            }
            for (int i = 0; i < q; i++)
                pw.println(ans[i]);
        }

        public class FenwickTree {
            int n;
            int[] ft;

            FenwickTree(int size) {
                n = size;
                ft = new int[n + 1];
            }

            int rsq(int b) {
                int sum = 0;
                while (b > 0) {
                    sum += ft[b];
                    b -= b & -b;
                }        //min?
                return sum;
            }

            void point_update(int k, int val) {
                while (k <= n) {
                    ft[k] += val;
                    k += k & -k;
                }        //min?
            }

        }

        public class query {
            int l;
            int r;
            int idx;

            public query(int l, int r, int idx) {
                this.l = l;
                this.r = r;
                this.idx = idx;
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

