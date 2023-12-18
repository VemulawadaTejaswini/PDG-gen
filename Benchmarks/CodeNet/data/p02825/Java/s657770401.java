import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().runIO();
    }


    void solve() {
        int n = in.nextInt();
        int[] last = new int[n + 1];
        last[0] = 3;
        for (int x = 3; x <= n; x++) {
            if (last[x - 3] != 0) {
                last[x] = 3;
            } else if (last[x - 4] != 0) {
                last[x] = 4;
            }
        }
        if (last[n] == 0) {
            out.println(-1);
            return;
        }
        char[][] res = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(res[i], '.');
        }
        String[] three = new String[]{"aa.", "..b", "..b"};
        String[] four = new String[]{
                "aabc",
                "ddbc",
                "efgg",
                "efhh",
        };
        while (n > 0) {
            int sz = last[n];
            String[] pattern = sz == 3 ? three : four;
            for (int i = 0; i < pattern.length; i++) {
                for (int j = 0; j < pattern.length; j++) {
                    res[n - i - 1][n - j - 1] = pattern[i].charAt(j);
                }
            }
            n -= sz;
        }
        for (char[] t : res) {
            out.println(new String(t));
        }
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
}
