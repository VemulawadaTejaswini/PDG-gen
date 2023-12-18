import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] edges;
    static boolean[] inCycle;
    static int[] val;
    public static boolean dfs(int u, int[] state) {
        state[u] = 1;
        for (int v: edges[u]) {
            if (state[v] == 1) {
                state[u] = 2;
                inCycle[v] = true;
                return true;
            } else if (state[v] == 0) {
                if (dfs(v, state)) {
                    inCycle[v] = true;
                    return !inCycle[u];
                }
            }
        }
        state[u] = 2;
        return false;
    }

    public static void dfs2(int u, int p) {
        Set<Integer> fb = new HashSet<>();
        for (int v: edges[u]) {
            if (v == p || inCycle[v]) continue;
            dfs2(v, p);
            fb.add(val[v]);

        }
        for (int i = 0;; i++) {
            if (!fb.contains(i)) {
                val[u] = i;
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inCycle = new boolean[n];
        val = new int[n];
        edges = new List[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt() - 1;
            edges[p[i]].add(i);
        }
        int[] state = new int[n];
        for (int i = 0; i < n; i++) {
            if (state[i] != 2) dfs(i, state);
        }
        int cntCycleSize = 0;

        for (int i = 0; i < n; i++) {
            if (inCycle[i]) cntCycleSize++;
        }

        for (int i = 0; i < n; i++) {
            if (inCycle[i]) dfs2(i, -1);
        }
        Set<Integer> ss = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (inCycle[i]) {
                ss.add(val[i]);
            }
        }
        if (ss.size() != 1 || cntCycleSize % 2 == 0) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}