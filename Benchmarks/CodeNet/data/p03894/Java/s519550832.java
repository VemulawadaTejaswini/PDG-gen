import java.util.Scanner;

public class Main {
    int n, q;
    int[] as, bs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        as = new int[q];
        bs = new int[q];
        for (int i = 0; i < q; i++) {
            as[i] = sc.nextInt() - 1;
            bs[i] = sc.nextInt() - 1;
        }
    }

    private void solve() {
        int[] xs, pos;
        xs = new int[n];
        pos = new int[n];
        boolean[] memo = new boolean[n];
        memo[0] = memo[1] = true;
        for (int i = 0; i < n; i++) {
            xs[i] = i;
            pos[i] = i;
        }
        for (int i = 0; i < q; i++) {
            int posa = as[i], posb = bs[i];
            int cupa = pos[posa], cupb = pos[posb];
            xs[cupa] = posb;
            xs[cupb] = posa;
            pos[posa] = cupb;
            pos[posb] = cupa;
            int x = xs[0] - 1, y = xs[0] + 1;
            if (x >= 0 && x < n) memo[pos[x]] = true;
            if (y >= 0 && y < n) memo[pos[y]] = true;
        }
        int sum = 0;
        for (boolean b: memo)
            sum += b ? 1 : 0;
        System.out.println(sum);
    }
}
