import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final int N = 100005;
    static final int UNVISITED = -1;
    static int n, m, q;
    static ArrayList<Integer>[] G = new ArrayList[N];
    static int[] c = new int[N];

    public static void main(String[] args) {
        read();
        for (int i = 0; i < n; i++) {
            dfs(i, i);
        }
        out();
    }

    static void init(int n) {
        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<Integer>();
            c[i] = UNVISITED;
        }
    }

    static void read() {
        n = sc.nextInt();
        m = sc.nextInt();

        init(n);

        int u, v;
        for (int i = 0; i < m; i++) {
            u = sc.nextInt();
            v = sc.nextInt();

            G[u].add(v);
            G[v].add(u);
        }

        q = sc.nextInt();
    }

    static void dfs(int v, int cls) {
        if (c[v] != UNVISITED) {
            return;
        }

        c[v] = cls;
        for (int i = 0; i < G[v].size(); i++) {
            dfs(G[v].get(i), cls);
        }
    }

    static void out() {
        int u, v;
        for (int i = 0; i < q; i++) {
            u = sc.nextInt();
            v = sc.nextInt();

            if (c[u] == c[v]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}