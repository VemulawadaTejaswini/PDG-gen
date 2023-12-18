import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLazyFaith solver = new DLazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLazyFaith {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int q = in.nextInt();
            long[] s = in.nextLongArray(a);
            long[] t = in.nextLongArray(b);
            while (q-- > 0) {
                long x = in.nextLong();
                int idxS = Arrays.binarySearch(s, x);
                int idxT = Arrays.binarySearch(t, x);
                long sLeft = idxS < -1 ? x - s[-idxS - 2] : idxS == -1 ? Long.MAX_VALUE / 2 : 0;
                long sRight = idxS == -a - 1 ? Long.MAX_VALUE / 2 : idxS <= -1 ? s[-idxS - 1] - x : 0;
                long tLeft = idxT < -1 ? x - t[-idxT - 2] : idxT == -1 ? Long.MAX_VALUE / 2 : 0;
                long tRight = idxT == -b - 1 ? Long.MAX_VALUE / 2 : idxT <= -1 ? t[-idxT - 1] - x : 0;
                List<Long> al = new ArrayList<Long>() {{
                    add(Math.max(sLeft, tLeft));
                    add(Math.max(sRight, tRight));
                    if (sLeft < tLeft && tRight < sRight) {
                        add(sLeft + tRight + Math.min(sLeft, tRight));
                    }
                    if (tLeft < sLeft && sRight < tRight) {
                        add(tLeft + sRight + Math.min(tLeft, sRight));
                    }
                }};
                long min = Long.MAX_VALUE;
                for (long l : al) {
                    min = Math.min(min, l);
                }
                out.println(min);
            }
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

    }
}

