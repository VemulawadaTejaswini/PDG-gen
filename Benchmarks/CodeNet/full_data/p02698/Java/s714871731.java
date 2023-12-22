import java.util.*;

public class Main {


    static List<Integer>[] adj;
    static int[] a;
    static int[] lis;
    static int[] res;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        adj = new List[n];
        for(int i=0; i<n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<n-1; i++) {
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            adj[u].add(v);
            adj[v].add(u);
        }
        lis = new int[n+1];
        res = new int[n];
        Arrays.fill(lis, Integer.MAX_VALUE);
        lis[0] = 0;
        res[0] = 1;
        dfs(-1, 0, 0);
        for(int i=0; i<n; i++) {
            System.out.println(res[i]);
        }
    }

    static void dfs(int parent, int pos, int max) {
        int pi = 0;
        int pv = 0;
        if(pos != 0) {
            pi = Arrays.binarySearch(lis, 0, max+2, a[pos]);
            if(pi < 0) {
                pi = -pi - 1;
                pv = lis[pi];
                lis[pi] = a[pos];
                max = Math.max(max, pi);
            }
            res[pos] = max;
        } else {
            max = 1;
            lis[1] = a[0];
        }
        for(int next : adj[pos]) {
            if(next == parent) continue;
            dfs(pos, next, max);
        }
        lis[pi] = pv;
    }

}