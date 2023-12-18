import java.util.*;

public class Main {
    int n, m;
    ArrayList<ArrayList<Integer>> es;
    int[] cs;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        es = new ArrayList<>(n);
        cs = new int[n];
        for (int i = 0; i < n; i++) {
            es.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            es.get(a).add(b);
            es.get(b).add(a);
        }
    }

    private void solve() {
        // judge
        long ans;
        if (check(0, 1)) {
            int b = 0;
            for (int c: cs)
                if (c == 1) b++;
            ans = (long) (b * (n - b)) - m;
        }
        else {
            ans = (long) n * (n - 1) / 2L;
            ans -= m;
        }
        System.out.println(ans);
    }

    private boolean check(int v, int c) {
        if (cs[v] != 0)
            return c == cs[v];
        cs[v] = c;
        boolean ans = true;
        for (int nxt: es.get(v)) {
            ans &= check(nxt, -c);
        }
        return ans;
    }

}
