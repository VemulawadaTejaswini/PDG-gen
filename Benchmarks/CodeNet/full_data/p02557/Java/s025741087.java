
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        int n = sc.nextInt();
        int[] cnta = new int[n + 1];
        int[] cntb = new int[n + 1];
        int[] a = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnta[a[i]]++;
        }
        for (int i = 0; i < n; i++) {
            cntb[sc.nextInt()]++;
        }

        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (cnta[i] > n / 2 && cntb[i] > n / 2) {
                ok = false;
            }
        }

        if (ok) {
            out.println("Yes");
            ArrayList<Pair> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (cntb[i] == 0) continue;
                arr.add(new Pair(i, cntb[i]));
            }
            Collections.sort(arr);
            int[] ans = new int[n];

            int idx = 0;
            for (Pair p : arr) {
                for (int i = 0; i < p.cnt; i++) {
                    if (ans[idx] > 0 || a[idx] == p.idx) {
                        i--;
                    } else {
                        ans[idx] = p.idx;
                    }
                    idx++;
                    if (idx == n) idx = 0;
                }
            }

            out.print(ans[0]);
            for (int i = 1; i < n; i++) {
                out.print(" " + ans[i]);
            }
            out.println();

        } else {
            out.println("No");
        }

        out.flush();
    }

    class Pair implements Comparable<Pair> {
        int idx, cnt;
        Pair(int idx, int cnt) {
            this.idx = idx;
            this.cnt = cnt;
        }


        @Override
        public int compareTo(Pair o) {
            return o.cnt - cnt;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}