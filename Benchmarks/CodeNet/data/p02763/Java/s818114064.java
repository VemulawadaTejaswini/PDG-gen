import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            StringBuilder x = new StringBuilder(in.next());
            SegmentTree st[] = new SegmentTree[26];
            for (int i = 0; i < 26; i++) {
                Node a[] = new Node[n];
                for (int j = 0; j < n; j++) {
                    if (x.charAt(j) == ('a' + i)) {
                        a[j] = new Node(1);
                    } else {
                        a[j] = new Node(0);
                    }
                }
                st[i] = new SegmentTree(a, new Node(0));
            }
            int q = in.nextInt();
            while (q-- > 0) {
                int t = in.nextInt();
                if (t == 1) {
                    int indi = in.nextInt() - 1;
                    Character c = in.next().charAt(0);
                    if (x.charAt(indi) != c) {
                        st[c - 'a'].updateValue(indi, new Node(1));
                        st[x.charAt(indi) - 'a'].updateValue(indi, new Node(-1));
                    }
                    x.setCharAt(indi, c);
                } else {
                    int l = in.nextInt() - 1;
                    int r = in.nextInt() - 1;
                    int ans = 0;
                    for (int i = 0; i < 26; i++) {
                        if (st[i].get(l, r).x > 0) {
                            ans++;
                        }
                    }
                    out.println(ans);
                }
            }
        }

    }

    static class SegmentTree {
        Node[] st;
        Node nu;
        int n;

        SegmentTree(Node arr[], Node nu) {
            n = arr.length;
            this.nu = nu;
            int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
            int max_size = 2 * (int) Math.pow(2, x) - 1;
            st = new Node[max_size]; // Memory allocation
            constructSTUtil(arr, 0, n - 1, 0);
        }

        Node value(Node x, Node y) {

            //Range Minimum
//        if(x.x < y.x){
//            return x;
//        }
//        else {
//            return y;
//        }

            //Summation
            return new Node(x.x + y.x);
        }

        int getMid(int s, int e) {
            return s + (e - s) / 2;
        }

        Node get(int qs, int qe) {
            int a = Math.min(qs, qe);
            int b = Math.max(qs, qe);
            qs = a;
            qe = b;
            if (qs < 0 || qe > n - 1 || qs > qe) {
                System.out.println("Invalid Input");
                return nu;
            }
            return getUtil(0, n - 1, qs, qe, 0);
        }

        Node getUtil(int ss, int se, int qs, int qe, int si) {
            // If segment of this node is a part of given range, then return
            // the sum of the segment
            if (qs <= ss && qe >= se) {
                return st[si];

            }

            // If segment of this node is outside the given range
            if (se < qs || ss > qe)
                return nu;
            // If a part of this segment overlaps with the given range
            int mid = getMid(ss, se);
            return value(getUtil(ss, mid, qs, qe, 2 * si + 1), getUtil(mid + 1, se, qs, qe, 2 * si + 2));

        }

        void updateValueUtil(int ss, int se, int i, Node diff, int si) {
            // Base Case: If the input index lies outside the range of
            // this segment
            if (i < ss || i > se)
                return;

            // If the input index is in range of this node, then update the
            // value of the node and its children
            st[si] = value(diff, st[si]);
            if (se != ss) {
                int mid = getMid(ss, se);
                updateValueUtil(ss, mid, i, diff, 2 * si + 1);
                updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
            }
        }

        void updateValue(int i, Node new_val) {
            // Check for erroneous input index
            if (i < 0 || i > n - 1) {
                System.out.println("Invalid Input");
                return;
            }

            // Update the values of nodes in segment tree
            updateValueUtil(0, n - 1, i, new_val, 0);
        }

        Node constructSTUtil(Node arr[], int ss, int se, int si) {
            // If there is one element in array, store it in current node of
            // segment tree and return
            if (ss == se) {
                st[si] = arr[ss];
                return arr[ss];
            }
            int mid = getMid(ss, se);
            st[si] = value(constructSTUtil(arr, mid + 1, se, si * 2 + 2), constructSTUtil(arr, ss, mid, si * 2 + 1));
            return st[si];
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

    static class Node {
        int x;

        Node(int x) {
            this.x = x;
        }

    }
}

