import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int n = ni();
        int m = ni();
        int[] x = nia(n);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(x[i])) {
                map.put(x[i], map.get(x[i]) + 1);
            } else {
                map.put(x[i], 1);
            }
        }

        int[][] cnt = new int[2][m];
        for (int t : map.keySet()) {
            cnt[0][t % m] += map.get(t) - map.get(t) % 2;
            cnt[1][t % m] += map.get(t) % 2;
        }

        int ans = (cnt[0][0] + cnt[1][0]) / 2;
        for (int i = 1; i <= m / 2; i++) {
            if (i * 2 == m) {
                ans += cnt[1][i] / 2;
                ans += cnt[0][i] / 2;
            } else {
                int tmp = Math.min(cnt[1][i], cnt[1][m - i]);
                cnt[1][i] -= tmp;
                cnt[1][m - i] -= tmp;
                ans += tmp;

                int tmp2 = Math.min(cnt[1][i], cnt[0][m - i]);
                cnt[1][i] -= tmp2;
                cnt[0][m - i] -= tmp2;
                ans += tmp2;

                int tmp3 = Math.min(cnt[1][m - i], cnt[0][i]);
                cnt[1][m - i] -= tmp3;
                cnt[0][i] -= tmp3;
                ans += tmp3;

                ans += cnt[0][i] / 2;
                ans += cnt[0][m - i] / 2;
            }
        }

        out.println(ans);
    }

    public class Pair implements Comparable<Pair> {
    	int x, y;

    	public Pair(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}

    	public int compareTo(Pair p) {
    		return y - p.y;
    	}
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}