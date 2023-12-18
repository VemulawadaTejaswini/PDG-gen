import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    int size(int full, int type) {
        switch (type) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return full - 1;
            default:
                return full;
        }
    }

    int solve(ArrayList<Integer> a) {
        int[][] dp = new int[4][a.size() + 1];
        for (int i = a.size() - 2; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                for (int nj = 0; nj < 4; nj++) {
                    int mySize = a.get(i) - size(a.get(i), j);
                    int nextSize = size(a.get(i + 1), nj);
                    int dpPrev = dp[nj][i + 1];
                    dp[j][i] = Math.max(dp[j][i], dpPrev);
                    if (mySize != 0 && nextSize != 0) {
                        dp[j][i] = Math.max(dp[j][i], dpPrev + Math.max(mySize, nextSize));
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 4; i++) {
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }

    HashMap<String, Integer> ans = new HashMap<>();

    int stupid(String s) {
        Integer res = ans.get(s);
        if (res == null) {
            res = 0;
            for (int i = 0; i + 2 < s.length(); i++) {
                if (s.substring(i, i + 3).equals("101")) {
                    res = Math.max(res, 1 + stupid(s.substring(0, i) + "010" + s.substring(i + 3)));
                }
            }
            ans.put(s, res);
        }
        return res;
    }

    void solve() {
        int n = in.nextInt();
        out.println(solve(in.next()));
    }

    private void solve123() {
        Random rnd = new Random(123);
        final int MAX = 20;
        for (int it = 0; it < 123133; it++) {
            System.err.println("it = " + it);
            int n = 1 + rnd.nextInt(MAX);
            char[] a = new char[n];
            for (int i = 0; i < n; i++) {
                a[i] = (char) ('0' + rnd.nextInt(2));
            }
            String s = new String(a);
            int st = stupid(s);
            int my = solve(s);
            if (my != st) {
                System.err.println("s = " + s);
                System.err.println("my = " + my + ", correct = " + st);
                throw new AssertionError();
            }
        }
    }

    private int solve(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        int res = 0;
        for (int i = 0; i < n; ) {
            if (a[i] == '0') {
                i++;
                continue;
            }
            ArrayList<Integer> sizes = new ArrayList<>();
            int j = i;
            while (true) {
                while (j != n && a[j] == '1') {
                    j++;
                }
                sizes.add(j - i);
                i = j + 1;
                if (j == n || j + 1 == n || a[j + 1] == '0') {
                    break;
                }
                j++;
            }
            res += solve(sizes);
        }
        return res;
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