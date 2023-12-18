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
        int[] v = new int[N];
        Arrays.fill(v, 0);
        for (int i = 0; i < Q; i++) {
            Stack<Integer> vstk = new Stack<Integer>();
            Stack<Integer> dstk = new Stack<Integer>();
            vstk.push(sc.nextInt() - 1);
            dstk.push(0);
            int dist = sc.nextInt();
            int color = sc.nextInt();
            boolean[] visited = new boolean[N];
            while (!vstk.isEmpty()) {
                int cv = vstk.pop();
                int d = dstk.pop();
                if (visited[cv] || d > dist) continue;
                visited[cv] = true;
                v[cv] = color;
                for (int nv : g[cv]) {
                    vstk.push(nv);
                    dstk.push(d + 1);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(v[i]);
        }
    }
}