import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }

    final double EPS = 1e-10;

    class Pair implements Comparable<Pair>{
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return o.x - this.x;
        }
    }
    void solve() throws IOException {
        int n = nextInt();
        int k = nextInt();
        long ans = 0;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(nextInt(), nextInt());
            if ((pairs[i].x | k) == k) {
                ans += pairs[i].y;
            }
        }
        for (int i = 0; i <= 30; i++) {
            if ((k & (1 << i)) > 0) {
                int t = ((k >> (i + 1))  << (i + 1)) | ((1 << i) - 1);
                long cur = 0;
                for (int j = 0; j < n; j++) {
                    if ((pairs[j].x | t) == t) {
                        cur += pairs[j].y;
                    }
                }
                ans = Math.max(ans, cur);
            }
        }
        out.println(ans);

    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}