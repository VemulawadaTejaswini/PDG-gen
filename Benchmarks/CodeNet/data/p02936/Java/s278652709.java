import java.util.*;
import java.util.stream.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int mod = (int) 10e8 + 7;

    static ArrayList<Integer>[] adjList;
    static int[] counter, value;
    static boolean[] vis;

    static void dfs(int u, int c) {
        vis[u] = true;
        c += counter[u];
        value[u] = c;

        for (int v : adjList[u]) {
            if (!vis[v]) dfs(v, c);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();

        adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adjList[u].add(v);
            adjList[v].add(u);
        }
        counter = new int[n];
        for (int i = 0; i < q; i++) {
            counter[sc.nextInt() - 1] += sc.nextInt();
        }
        value = new int[n];
        vis = new boolean[n];
        dfs(0, 0);

        for (int i = 0; i < n; i++) {
            System.out.print(value[i] + (i == n-1 ? "\n" : " "));
        }
    }

}
