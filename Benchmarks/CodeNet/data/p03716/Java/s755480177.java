import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    class Q implements Comparable<Q> {
        int value, id;

        public Q(int value, int id) {
            this.value = value;
            this.id = id;
        }

        @Override
        public int compareTo(Q o) {
            if (value != o.value) {
                return Integer.compare(value, o.value);
            }
            return Integer.compare(id, o.id);
        }
    }

    class TopN {
        TreeSet<Q> top = new TreeSet<>();
        TreeSet<Q> down = new TreeSet<>();
        int n;
        long sum = 0;

        TopN(int n) {
            this.n = n;
        }

        void add(Q q) {
            if (top.size() == 0) {
                down.add(q);
            } else {
                if (top.first().value <= q.value) {
                    top.add(q);
                    sum += q.value;
                } else {
                    down.add(q);
                }
            }
        }

        long getScore() {
            while (top.size() > n) {
                Q q = top.pollFirst();
                sum -= q.value;
                down.add(q);
            }
            while (top.size() < n && down.size() > 0) {
                Q q = down.pollLast();
                sum += q.value;
                top.add(q);
            }
            if (top.size() == n) {
                return sum;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    private void solve() {
        int n = in.nextInt();
        int[] a = new int[3 * n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        long[] max = new long[3 * n];
        long[] min = new long[3 * n];
        TopN first = new TopN(n);
        for (int i = 0; i < a.length; i++) {
            first.add(new Q(a[i], i));
            max[i] = first.getScore();
        }
        TopN last = new TopN(n);
        for (int i = a.length - 1; i >= 0; i--) {
            last.add(new Q(-a[i], i));
            min[i] = last.getScore();
        }
        long res = Long.MIN_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            res = Math.max(res, max[i] + min[i + 1]);
        }
        out.println(res);

    }

    private void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}