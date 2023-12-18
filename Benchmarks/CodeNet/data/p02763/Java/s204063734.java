import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        SimpleStringQueries solver = new SimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class SimpleStringQueries {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int[] val = new int[n];
            for (int i = 0; i < n; i++) {
                val[i] = 1 << (s[i] - 'a');
            }
            SegmentTreeMin seg = new SegmentTreeMin(val);

            int q = in.nextInt();
            for (int j = 0; j < q; j++) {
                int num = Integer.parseInt(in.next());
                if (num == 1) {
                    int i = Integer.parseInt(in.next()) - 1;
                    char c = in.next().charAt(0);
                    int v = 1 << (c - 'a');
                    seg.update(i, v);
                } else {
                    int l = Integer.parseInt(in.next()) - 1;
                    int r = Integer.parseInt(in.next());
                    out.println(bitNum(seg.get(l, r)));
                }
            }
        }

        public int bitNum(int v) {
            int result = 0;
            while (0 < v) {
                if ((v & 1) == 1) {
                    result++;
                }
                v = v >> 1;
            }
            return result;
        }

        public class SegmentTreeMin {
            private int size;
            private int[] node;

            public SegmentTreeMin(int[] e) {
                int s = e.length;
                size = 1;
                while (size < s) {
                    size *= 2;
                }
                node = new int[2 * size - 1];

                for (int i = 0; i < s; i++) {
                    node[i + size - 1] = e[i];
                }

            /*
              子から親へのアクセス
              左の子：dat[2*i+1]
              右の子：dat[2*i+2]
             */
                for (int i = size - 2; i >= 0; i--) {
                    node[i] = ope(node[2 * i + 1], node[2 * i + 2]);
                }
            }

            public void update(int i, int val) {
                i += size - 1;
                node[i] = val;
                while (i > 0) {
                /*
                子から親へのアクセス
                親：dat[(i-1)/2]
                 */
                    i = (i - 1) / 2;
                    node[i] = ope(node[2 * i + 1], node[2 * i + 2]);
                }
            }

            public int get(int a, int b) {
                return get(a, b, 0, 0, size);
            }

            private int get(int a, int b, int k, int l, int r) {

                if (r <= a || b <= l) {
                    return 0;
                } else if (a <= l && r <= b) {
                    return node[k];
                } else {
                    int lval = get(a, b, 2 * k + 1, l, (l + r) / 2);
                    int rval = get(a, b, 2 * k + 2, (l + r) / 2, r);
                    return ope(lval, rval);
                }
            }

            public int ope(int a, int b) {
                return a | b;
            }

        }

    }
}

