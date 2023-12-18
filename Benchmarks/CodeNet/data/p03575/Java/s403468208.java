import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static final void main(String[] args) {
        Main m = new Main();
        m.init();
        m.solve();
    }

    // ========================================================================= //
    int n, m;
    ArrayList<Integer>[] g;
    int[] edges;
    public void init() {
        n = sc.nextInt();
        m = sc.nextInt();
        g = new ArrayList[n];
        edges = new int[m];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
            edges[i] = (a << 16) + b;
        }
    }

    public void solve() {
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int a = edges[i] >> 16;
            int b = edges[i] & 0xffff;
            HashSet<Integer> A = new HashSet<>();
            HashSet<Integer> B = new HashSet<>();

            Stack<Integer> stk = new Stack<>();
            stk.add(a);
            A.add(a);
            while (!stk.isEmpty()) {
                int c = stk.pop();
                for (int nxt : g[c]) {
                    if (nxt != b && !A.contains(nxt)) {
                        stk.add(nxt);
                        A.add(nxt);
                    }
                }
            }

            stk.clear();
            stk.add(b);
            B.add(b);
            while(!stk.isEmpty()) {
                int c = stk.pop();
                for (int nxt : g[c]) {
                    if (nxt != a && !B.contains(nxt)) {
                        stk.add(nxt);
                        B.add(nxt);
                    }
                }
            }

            boolean check = true;
            for (int sa : A) {
                if (B.contains(sa)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
