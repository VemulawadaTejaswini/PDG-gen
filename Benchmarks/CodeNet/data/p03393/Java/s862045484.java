import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        char[] s = in.next().toCharArray();
        boolean[] has = new boolean[26];
        for (char c : s) {
            has[c - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!has[i]) {
                char c = (char) ('a' + i);
                out.println(new String(s) + c);
                return;
            }
        }
        for (int pos = s.length - 2; pos >= 0; pos--) {
            if (s[pos] < s[pos + 1]) {
                ArrayList<Character> all = new ArrayList<>();
                for (int i = pos + 1; i < s.length; i++) {
                    all.add(s[i]);
                }
                Collections.sort(all);
                for (int i = 0; i < all.size(); i++) {
                    if (all.get(i) > s[pos]) {
                        char next = all.get(i);
                        s[pos] = next;
                        out.println(new String(Arrays.copyOf(s, pos + 1)));
                        return;
                    }
                }
            }
        }
        out.println(-1);
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