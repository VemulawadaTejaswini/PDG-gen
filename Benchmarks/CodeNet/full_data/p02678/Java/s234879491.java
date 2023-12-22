import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int H,W;
    int[] dr = new int[]{1,0,-1,0}, dc = new int[]{0,1,0,-1};
    Set<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
    }
    void solve() throws IOException {
        int n = sc.nextInt(), m = sc.nextInt();
        tree = new Set[n+1];
        for(int i=0;i<=n;i++) tree[i]=new HashSet<>();
        while(m-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            tree[a].add(b); tree[b].add(a);
        }
        // dfs from vertex 1
        int[] prev = new int[n+1];
        boolean[] vis = new boolean[n+1];
        List<Integer> cur = new LinkedList<>(), next = new LinkedList<>();
        vis[1] = true; cur.add(1);
        while(cur.size()>0){
            for(int now:cur){
                for(int to:tree[now]){
                    if(vis[to]) continue;
                    prev[to] = now;
                    vis[to] = true;
                    next.add(to);
                }
            }
            cur = next; next = new LinkedList<>();
        }
        out.println("Yes");
        for(int i=2;i<=n;i++){
            out.println(prev[i]);
        }
    }
}