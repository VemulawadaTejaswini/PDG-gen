import java.util.*;
import java.io.*;

// Template for atcoder
public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        long[] a = nextLongArr(n);
        long[] b = nextLongArr(m);
        long[] prefA = new long[1 + n];
        for (int i = 1; i <= n; i++) {
            prefA[i] = prefA[i - 1] + a[i  -1];
        }
        long[] prefB = new long[1 + m];
        for (int i = 1; i <= m; i++) {
            prefB[i] = prefB[i - 1] + b[i  -1];
        }

        int res = 0;
        for (int i = 0; i <= n; i++) {
            long left = k - prefA[i];
            if (left <= 0) {
                continue;
            }
            int low = 0;
            int high = n + 2;
            while (low < high) {
                int mid = (low + high) / 2;
                if (prefB[mid] <= left) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            low--;
            res = Math.max(res, i + low);
        }
        outln(res);
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
