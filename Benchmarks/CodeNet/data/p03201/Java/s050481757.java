import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        while (!count.isEmpty()) {
            Map.Entry<Integer, Integer> entry = count.pollLastEntry();
            if (entry.getValue() != 1) {
                count.put(entry.getKey(), entry.getValue() - 1);
            }
            int pw2 = 1;
            while (pw2 <= entry.getKey()) {
                pw2 *= 2;
            }
            int need = pw2 - entry.getKey();
            Integer got = count.get(need);
            if (got != null) {
                res++;
                if (got.equals(1)) {
                    count.remove(need);
                } else {
                    count.put(need, got - 1);
                }
            }
        }
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