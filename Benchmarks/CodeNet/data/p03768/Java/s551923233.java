import java.io.*;
import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer>[] g = new ArrayList[N];
        for (int i = 0; i < N; i++) g[i] = new ArrayList();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        int Q = sc.nextInt();
        if (N > 2000 || M > 2000 || Q > 2000) System.exit(-1);
        int[] qv = new int[Q]; int[] qd = new int[Q]; int[] qc = new int[Q];
        for (int i = 0; i < Q; i++) {
            qv[i] = sc.nextInt() - 1;
            qd[i] = sc.nextInt();
            qc[i] = sc.nextInt();
        }
        int[] v = new int[N];
        Arrays.fill(v, 0);
        for (int i = 0; i < Q; i++) {
            Stack<Integer> vstk = new Stack<Integer>();
            Stack<Integer> dstk = new Stack<Integer>();
            vstk.push(qv[i]);
            dstk.push(0);
            int dist = qd[i];
            int color = qc[i];
            boolean[] visited = new boolean[N];
            while (!vstk.isEmpty()) {
                int cv = vstk.pop();
                int d = dstk.pop();
                visited[cv] = true;
                    v[cv] = color;
                if (d + 1 <= dist) {
                    for (int nv : g[cv]) if (!visited[nv]) {
                        vstk.push(nv);
                        dstk.push(d + 1);
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (v[i] == -1)
                System.out.println(0);
            else
                System.out.println(v[i]);
        }
    }
}