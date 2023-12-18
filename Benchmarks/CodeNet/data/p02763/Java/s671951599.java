import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
            StringBuilder s = new StringBuilder(in.next());
            EasySegmentTree[] segTree = new EasySegmentTree[26];
            for (int i = 0; i < 26; i++) {
                segTree[i] = new EasySegmentTree(n);
            }

            for (int i = 0; i < s.length(); i++) {
                segTree[s.charAt(i) - 'a'].update(i, true);
            }

            int m = in.nextInt();
            for (int i = 0; i < m; i++) {
                // out.println(s);
                int t = in.nextInt();
                if (t == 1) {
                    int num = in.nextInt() - 1;
                    String hoge = in.next();
                    segTree[s.charAt(num) - 'a'].update(num, false);
                    s.setCharAt(num, hoge.charAt(0));
                    segTree[s.charAt(num) - 'a'].update(num, true);
                } else {
                    int cnt = 0;
                    int l = in.nextInt();
                    int r = in.nextInt();
                    for (int j = 0; j < 26; j++) {
                        // out.println(segTree[j].query(l - 1, r));
                        if (segTree[j].query(l - 1, r)) {
                            cnt++;
                        }
                    }
                    out.println(cnt);
                }
            }
        }

    }

    static class EasySegmentTree {
        protected ArrayList<Boolean> dat;
        protected int size;

        public EasySegmentTree(int size) {
            setSize(size);
        }

        public void setSize(int size) {
            int sz = 1;
            while (sz < size) {
                sz <<= 1;
            }
            this.size = sz;
            dat = new ArrayList<>();
            for (int i = 0; i < 2 * this.size - 1; i++) {
                dat.add(false);
            }
        }

        public void update(int i, boolean x) {
            i += size - 1;
            dat.set(i, x);
            while (i > 0) {
                i = (i - 1) / 2;
                dat.set(i, dat.get(i * 2 + 1) || dat.get(i * 2 + 2));
            }
        }

        public boolean query(int l, int r) {
            int ll = l + size - 1;
            int rr = r + size - 1;
            boolean res = false;
            while (ll < rr) {
                if ((rr & 1) == 0) {
                    rr--;
                    res = res || dat.get(rr);
                }
                if ((ll & 1) == 0) {
                    res = res || dat.get(ll);
                    ll++;
                }
                ll = (ll - 1) >> 1;
                rr = (rr - 1) >> 1;
            }
            return res;
        }

    }
}

