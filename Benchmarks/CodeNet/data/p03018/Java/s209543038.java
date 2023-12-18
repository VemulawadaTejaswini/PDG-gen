import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    char[] s;

    List<Integer> queue = new ArrayList<>();

    void check(int pos) {
        if (pos >= 0 && pos + 3 <= s.length && s[pos] == 'A' && s[pos + 1] == 'B' && s[pos + 2] == 'C') {
            queue.add(pos);
        }
    }

    boolean ok(int p) {
        return p + 3 <= s.length && s[p] == 'A' && s[p + 1] == 'B' && s[p + 2] == 'C';
    }

    void solve() {
        s = in.next().toCharArray();
        long res = 0;
        for (int start = 0; start + 3 <= s.length; ) {
            if (ok(start)) {
                int cnt = 1;
                while (true) {
                    if (ok(start + cnt * 3)) {
                        cnt++;
                    } else {
                        break;
                    }
                }
                res += cnt * 1L * (cnt + 1) / 2;
                for (int i = 0; i < cnt; i++) {
                    s[start + i * 2] = 'B';
                    s[start + i * 2 + 1] = 'C';
                    s[start + cnt * 3 - i - 1] = 'A';
                }
                start += 3 * cnt;
            } else {
                start++;
            }
        }
        for (int i = 0; i + 3 <= s.length; i++) {
            check(i);
        }
        while (queue.size() > 0) {
            int pos = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);
//            System.err.println("??");
            if (s[pos] == 'A' && s[pos + 1] == 'B' && s[pos + 2] == 'C') {
                res++;
                s[pos] = 'B';
                s[pos + 1] = 'C';
                s[pos + 2] = 'A';
                check(pos - 1);
                check(pos + 2);
            }
        }
//        System.err.println(Arrays.toString(s));
        out.println(res);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
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
