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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
    int s;
    int t;
    List<Integer>[] adj;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        n = in.nextInt();
        s = in.nextInt() - 1;
        t = in.nextInt() - 1;
        adj = new List[n];
        for (int i = 0; i < n; i++) {
           adj[i] = new ArrayList();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            adj[a].add(b);
            adj[b].add(a);
        }
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        findDist(t, -1, 0, dist1);
        findDist(s, -1, 0, dist2);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (dist2[i] < dist1[i]) {
                ans = Math.max(ans, dist1[i] - 1);
            }
        }
        out.println(ans);
    }

    private void findDist(int u, int p, int d, int[] dist) {
        dist[u] = d;
        for (int v : adj[u]) {
            if (v == p) continue;
            findDist(v, u, d + 1, dist);
        }
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
