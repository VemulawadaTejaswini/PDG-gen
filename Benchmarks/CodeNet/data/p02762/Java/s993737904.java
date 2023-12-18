import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> a[] = new ArrayList[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<>();
//        HashMap<Integer,HashSet<Integer>> friend = new HashMap<>();
            HashMap<Integer, HashSet<Integer>> block = new HashMap<>();
            DSet d = new DSet(n);
            int b[] = new int[n];
            for (int i = 0; i < m; i++) {
                int p = in.nextInt() - 1;
                int q = in.nextInt() - 1;
                a[p].add(q);
                a[q].add(p);
                d.union(p, q);
            }
            for (int i = 0; i < k; i++) {
                int p = in.nextInt() - 1;
                int q = in.nextInt() - 1;
                if (d.find(p) == d.find(q)) {
                    b[p]++;
                    b[q]++;
                }
            }
            for (int i = 0; i < n; i++) {
                int ans = d.csize[d.find(i)] - a[i].size() - b[i] - 1;
//            out.println(d.csize[d.find(i)] + " " + a[i].size() + " " + b[i] );
                out.print(ans + " ");
            }
        }

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

    }

    static class DSet {
        int[] parent;
        int[] rank;
        int[] csize;
        int size;

        DSet(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];
            csize = new int[n + 1];
            size = n;
            for (int i = 0; i <= n; i++) {
                this.parent[i] = i;
                this.csize[i] = 1;
            }
        }

        public int find(int i) {
            if (parent[i] == i) return i;
            else {
                int result = find(parent[i]);
                parent[i] = result;
                return result;
            }
        }

        public void union(int i, int j) {
            int ipar = this.find(i);
            int jpar = this.find(j);
            if (ipar == jpar) {
                return;
            }
            int irank = this.rank[ipar];
            int jrank = this.rank[jpar];
            if (irank < jrank) {
                this.parent[ipar] = jpar;
                this.csize[jpar] += this.csize[ipar];
            } else if (jrank < irank) {
                this.parent[jpar] = ipar;
                this.csize[ipar] += this.csize[jpar];
            } else {
                this.parent[ipar] = jpar;
                this.csize[jpar] += this.csize[ipar];
                this.rank[jpar]++;
            }
            size--;
        }

    }
}

