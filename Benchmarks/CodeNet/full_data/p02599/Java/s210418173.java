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
        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt() - 1;
            FenwickTree ft = new FenwickTree(2 * n + 1);
            query[] queries = new query[q];
            for (int i = 0; i < queries.length; i++)
                queries[i] = new query(sc.nextInt(), sc.nextInt(), i);
            Arrays.sort(queries, (a, b) -> a.r == b.r ? a.l - b.l : a.r - b.r);
            int[] last = new int[n];
            int idx = 0;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                if (last[arr[i]] != 0)
                    ft.point_update(last[arr[i]], -1);
                last[arr[i]] = i + 1;
                ft.point_update(i + 1, 1);
                while (idx < queries.length && queries[idx].r == i + 1) {
                    ans[queries[idx].idx] = ft.rsq(i + 1) - ft.rsq(queries[idx].l - 1);
                    idx++;
                }
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

