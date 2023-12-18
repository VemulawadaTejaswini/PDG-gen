import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    int n;
    long[] sum;
    long[] tmp;
    long[] two;
    List<Integer>[] adj;
    long mod = 1000000007L;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        n = in.nextInt();
        adj = new List[n];
        int[] du = new int[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            adj[a].add(b);
            adj[b].add(a);
            du[a]++;
            du[b]++;
        }
        sum = new long[n];
        two = new long[n];
        tmp = new long[n];
        //for(int i = 0; i < n; i++) out.println(sum[i]);
        two[0] = 1;
        long invTwo = powmod(2, mod - 2);
        for (int i = 1; i < n; i++) {
            two[i] = two[i - 1] * invTwo % mod;
        }
        dfs(0, -1);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (du[i] > 1) {
                ans = (ans + tmp[i]) % mod;
            }
        }
        out.println(ans * two[1] % mod);
    }

    private long powmod(long a, long b) {
        long ans = 1, d = a;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * d % mod;
            }
            d = d * d % mod;
            b >>= 1;
        }
        return ans;
    }

    private int dfs(int u, int p) {
        int cnt = 1;
        tmp[u] = (mod + 1 - two[n - 1]);
        for (int v : adj[u]) {
            if (v == p) {
                continue;
            }
            int x = dfs(v, u);
            cnt += x;
            tmp[u] = (tmp[u] + mod -  (mod + 1 - two[x]) * two[n - 1 - x] % mod) % mod;
        }
        if (p != -1) {
            tmp[u] = (tmp[u] + mod -  (mod + 1 - two[n - cnt]) * two[cnt - 1] % mod) % mod;
        }
        return cnt;
    }
}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer      tokenizer;

    public InputReader(InputStream stream){
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
