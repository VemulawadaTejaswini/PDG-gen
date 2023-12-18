import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            SegmentTree[] segTree = new SegmentTree[26];
            int size = 1;
            while (size < n) {
                size *= 2;
            }
            for (int i = 0; i < 26; i++) {
                segTree[i] = new SegmentTree(size);
            }
            String s = in.next();
            for (int i = 0; i < s.length(); i++) {
                segTree[s.charAt(i) - 'a'].update(i, true);
            }

            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                int t = in.nextInt();
                if (t == 1) {
                    int num = in.nextInt() - 1;
                    String hoge = in.next();
                    segTree[hoge.charAt(0) - 'a'].update(num, true);
                } else {
                    int cnt = 0;
                    int l = in.nextInt();
                    int r = in.nextInt();
                    for (int j = 0; j < 26; j++) {
                        if (segTree[j].query(l - 1, r)) {
                            cnt++;
                        }
                    }
                    out.println(cnt);
                }

            }

        }

    }

    static class SegmentTree {
        int n;
        boolean[] dat;

        public SegmentTree(int size) {
            n = size;
            dat = new boolean[2 * n];
            for (int i = 0; i < dat.length; i++) {
                dat[i] = false;
            }
        }

        public void update(int i, boolean f) {
            i += n - 1;
            dat[i] = f;
            while (i > 0) {
                i = (i - 1) / 2;
                dat[i] = dat[i * 2 + 1] || dat[i * 2 + 2];
            }
        }

        public boolean query(int a, int b) {
            int l = a + n - 1;
            int r = b + n - 1;
            boolean s = false;
            while (l < r) {
                if ((r & 1) == 1) {
                    r--;
                    s = s || dat[r - 1];
                }
                if ((l & 1) == 1) {
                    s = s || dat[l - 1];
                    l++;
                }
                l >>= 1;
                r >>= 1;
            }

            return s;
        }

    }
}

