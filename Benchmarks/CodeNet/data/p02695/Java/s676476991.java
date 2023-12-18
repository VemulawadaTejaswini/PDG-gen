import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            int c = scan.nextInt();
            long d = scan.nextInt();
            Pair p = new Pair(a, b, c, d);
            list.add(p);
        }
        long[] a = new long[N];
        long ans = dfs(N, M, list, a, 1, 0);
        System.out.println(ans);
    }
    private long dfs(int N, int M, List<Pair> query, long[] a, int min, int current) {
        if (N == current) {
            long t = 0;
            for (Pair p : query) {
                if (a[p.b] - a[p.a] == p.c) {
                    t += p.d;
                }
            }
            return t;
        }
        long ans = Long.MIN_VALUE;
        for (int i = min; i <= M; i++) {
            a[current] = i;
            ans = Math.max(ans, dfs(N, M, query, a, i, current + 1));
        }
        return ans;
    }
    class Pair {
        int a;
        int b;
        int c;
        long d;
        Pair(int a, int b, int c, long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
