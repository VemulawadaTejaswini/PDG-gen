import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        List<Integer>[] adj = new List[n];
        for(int i=0; i<n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<n-1; i++) {
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            adj[u].add(v);
            adj[v].add(u);
        }
        int[] lis = new int[n+1];
        int[] res = new int[n];
        Arrays.fill(lis, Integer.MAX_VALUE);
        lis[0] = 0;
        res[0] = 1;
        dfs(lis, res, a, adj,-1, 0);
        for(int i=0; i<n; i++) {
            System.out.println(res[i]);
        }
    }

    static void dfs(int[] lis, int[] res, int[] a, List<Integer>[] adj, int parent, int pos) {
        int pi = 0;
        int pv = 0;
        if(pos != 0) {
            pi = Arrays.binarySearch(lis, a[pos]);
            if(pi < 0) {
                pi = -pi - 1;
                pv = lis[pi];
                lis[pi] = a[pos];
            }
            int li = Arrays.binarySearch(lis, Integer.MAX_VALUE-1);
            li = -li - 2;
            res[pos] = li;
        } else {
            lis[1] = a[0];
        }
        for(int next : adj[pos]) {
            if(next == parent) continue;
            dfs(lis, res, a, adj, pos, next);
        }
        lis[pi] = pv;
    }

}