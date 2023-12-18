import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    TreeSet<Integer> g[];
    int n;
    int lvl[];

    boolean isT(int v) {
        for (int u : g[v]) {
            if (lvl[u] == -1) {
                lvl[u] = lvl[v] + 1;
                if (!isT(u)) return false;
            } else if ((lvl[u] - lvl[v]) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    int cnt = 0, cur = 0;

    void dfs(int v) {
        for (int u : g[v]) {
            if (lvl[u] == -1) {
                lvl[u] = lvl[v] + 1;
                cnt++;
                if (lvl[u] % 2 == 0) cur++;
                dfs(u);
            }
        }
    }

    int a[][];

    public void solve() throws IOException {
        n = nextInt();
        int m = nextInt();
        g = new TreeSet[n];
        lvl = new int[n];
        Arrays.fill(lvl, -1);
        for (int i = 0; i < n; i++) {
            g[i] = new TreeSet<>();
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                g[i].add(j);
            }
        }
        for (int i = 0; i < m; i++) {
            int x = nextInt() - 1, y = nextInt() - 1;
            g[x].remove(y);
            g[y].remove(x);
        }
        for (int i = 0; i < n; i++) {
            if (lvl[i] == -1) {
                lvl[i] = 0;
                if (!isT(i)) {
                    out.print(-1);
                    return;
                }
            }
        }
        Arrays.fill(lvl, -1);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (lvl[i] == -1) {
                cnt = 1;
                cur = 1;
                lvl[i] = 0;
                dfs(i);
                arr.add(Math.abs(cnt - 2 * cur));
                sum += Math.abs(cnt - 2 * cur);
            }
        }
        Collections.sort(arr);

        int dp[][] = new int[sum / 2 + 1][arr.size() + 1];
        for (int j = 1; j <= arr.size(); j++) {
            for (int w = 1; w <= sum / 2; w++) {
                if (arr.get(j - 1) <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - arr.get(j - 1)][j - 1] + 1);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }

        long ans = dp[sum / 2][arr.size()];
        long d = Math.abs(sum - 2 * ans);
        long a = (n - d) / 2;
        long b = a + d;
        out.print(a * (a - 1) / 2 + b * (b - 1) / 2);
    }

    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    public void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}
