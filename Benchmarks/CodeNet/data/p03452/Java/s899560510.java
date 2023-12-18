import java.util.Scanner;

public class Main {
    private static final int maxn = (int) 1e5 + 10;
    private static int[] par = new int[maxn];
    private static long[] dist = new long[maxn];

    static int anc(int p) {
        if (par[p] == p) return p;
        int r = anc(par[p]);
        dist[p] += dist[r];
        return par[p] = r;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 1; i <= n; ++i) par[i] = i;
        while (m-- > 0) {
            int u = in.nextInt(), v = in.nextInt(), w = in.nextInt();
            int pu = anc(u), pv = anc(v);
            if (pu != pv) {
                par[pv] = pu;
                dist[v] = dist[u] + w - dist[v];
            } else if (dist[v] - dist[u] != w) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}