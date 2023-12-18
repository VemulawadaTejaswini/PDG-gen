import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

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
        LazyFaith solver = new LazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class LazyFaith {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int q = in.nextInt();
            ArrayList<Long> s = new ArrayList<>();
            ArrayList<Long> t = new ArrayList<>();
            long[] x = new long[q];
            for (int i = 0; i < a; i++) {
                s.add(Long.parseLong(in.next()));
            }
            for (int i = 0; i < b; i++) {
                t.add(Long.parseLong(in.next()));
            }
            for (int i = 0; i < q; i++) {
                x[i] = Long.parseLong(in.next());
            }
            for (int i = 0; i < q; i++) {
                long pos = x[i];
                int k = Collections.binarySearch(s, pos);
                if (k < 0) {
                    // -k -1
                    k = ~k;
                }
                long nextk = nextPos(s, k, pos);
                long ss = Math.abs(pos - nextk);
                // s採用
                int kk = Collections.binarySearch(t, nextk);
                if (kk < 0) {
                    kk = ~kk;
                }
                long nextkk = nextPos(t, kk, nextk);
                long tt = Math.abs(nextk - nextkk);
                long ans1 = ss + tt;

                // -------------
                int l = Collections.binarySearch(t, pos);
                if (l < 0) {
                    l = ~l;
                }
                long nextl = nextPos(t, l, pos);
                long tt2 = Math.abs(pos - nextl);
                // t採用
                int ll = Collections.binarySearch(s, nextl);
                if (ll < 0) {
                    ll = ~ll;
                }
                long nextll = nextPos(s, ll, pos);
                long ss2 = Math.abs(nextl - nextll);
                long ans2 = tt2 + ss2;
                out.println(Math.min(ans1, ans2));
            }
        }

        public long nextPos(List<Long> list, int idx, long start) {
            long tmp = (idx == list.size()) ? Long.MAX_VALUE : list.get(idx);
            long tmp2 = Long.MAX_VALUE;
            if (0 <= idx - 1) {
                tmp2 = list.get(idx - 1);
            }
            if ((Math.abs(start - tmp) > Math.abs(start - tmp2))) {
                return tmp2;
            }
            return tmp;
        }

    }
}

