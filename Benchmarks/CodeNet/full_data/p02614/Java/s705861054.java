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
        int h = nextInt();
        int w = nextInt();
        int k = nextInt();
        char[][] mat = new char[h][w];
        for (int i = 0; i < h; i++) {
            mat[i] = nextString().toCharArray();
        }
        int res = 0;
        for (int mask = 0; mask < (1 << (h + w)); mask++) {
            char[][] tmp = new char[h][w];
            for (int i = 0; i < h; i++) {
                tmp[i] = Arrays.copyOf(mat[i], w);
            }
            List<Integer> row = new ArrayList<>();
            List<Integer> col = new ArrayList<>();
            for (int i = 0; i < (h + w); i++) {
                if ((mask & (1 << i)) != 0) {
                    if (i < h) {
                        row.add(i);
                    } else {
                        col.add(i - h);
                    }
                }
            }
            for (int r : row) {
                for (int j = 0; j < w; j++) {
                    tmp[r][j] = 'R';
                }
            }
            for  (int c : col) {
                for (int i = 0; i < h; i++) {
                    tmp[i][c] = 'R';
                }
            }
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (tmp[i][j] == '#') {
                        cnt++;
                    }
                }
            }
            if (cnt == k) {
                res++;
            }
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
