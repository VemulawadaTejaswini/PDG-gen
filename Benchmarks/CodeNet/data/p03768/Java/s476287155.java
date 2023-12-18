import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Meepo on 4/1/2017.
 */
public class Main {
    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public void solveA() throws IOException {
        int n = nextInt();
        int[] a = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            a[i] = nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[3 * n - 2 * i - 2];
        }
        out.println(ans);
    }

    public void solveB() throws IOException {
        int n = nextInt();
        int m = nextInt();
        ArrayList<Integer>[] e = new ArrayList[n];
        for (int i = 0; i < e.length; i++) {
            e[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = nextInt() - 1;
            int b = nextInt() - 1;
            e[a].add(b);
            e[b].add(a);
        }

        int[][] color = new int[n][11];

        for (int i = 0; i < n; i++) {
            Arrays.fill(color[i], -1);
        }

        int q = nextInt();
        int[] c = new int[q];
        for (int i = 0; i < q; i++) {
            int v = nextInt() - 1;
            int d = nextInt();
            c[i] = nextInt();
            color[v][d] = i;
        }

        boolean change = true;
        while (change) {
            change = false;
            for (int v = 0; v < e.length; v++) {
                for (int d = 1; d < color[v].length; d++) {
                    if (color[v][d] == -1) {
                        continue;
                    }
                    for (int u : e[v]) {
                        if (color[u][d - 1] < color[v][d]) {
                            color[u][d - 1] = color[v][d];
                            change = true;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int ans = -1;
            for (int j = 0; j < color[i].length; j++) {
                ans = Math.max(ans, color[i][j]);
            }
            out.println(ans == -1 ? 0 : c[ans]);
        }
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solveB();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
