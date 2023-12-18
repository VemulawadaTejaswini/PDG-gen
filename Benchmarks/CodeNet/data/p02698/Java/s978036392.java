import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    public static void main(String args[]) {
        int t = 1;//ni();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = (long) 1e9 + 7;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static int maxn = 200005;
    static int a[];
    static int n;
    static List<Integer> l[] = new ArrayList[maxn];
    static int lis[];

    static int bin(int a[], int l, int r, int val) {
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] >= val) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }

    static void dfs(int s, int p, int t[], int len) {
        lis[s] = len;
        for (int v : l[s]) {
            if (v != p) {
                int cur = len;
                int ch = -1, id = -1;
                if (a[v] < t[0]) {
                    ch = t[0];
                    t[0] = a[v];
                } else if (a[v] > t[cur - 1])
                    t[cur++] = a[v];
                else {
                    id = bin(t, 0, cur - 1, a[v]);
                    ch = t[id];
                    t[id] = a[v];
                }
                dfs(v, s, t, cur);
                if (id == -1) {
                    if (ch != -1)
                        t[0] = ch;
                    else
                        t[len] = 0;
                } else
                    t[id] = ch;
            }
        }
    }

    static void solve() {
        n = ni();
        a = new int[n];
        lis = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        for (int i = 0; i < n; i++)
            l[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int u = ni() - 1;
            int v = ni() - 1;
            l[u].add(v);
            l[v].add(u);
        }
        int t[] = new int[n];
        t[0] = a[0];
        dfs(0, -1, t, 1);
        for (int i = 0; i < n; i++)
            out.println(lis[i]);
    }
}