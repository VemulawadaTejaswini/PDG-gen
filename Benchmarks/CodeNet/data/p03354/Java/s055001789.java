import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int M = sc.nextInt();
        int[] P = new int[N+1];
        for(int i = 1;i <= N;i++){
            int pi = sc.nextInt();
            P[pi] = i;
        }
        int[] par = new int[N+1];
        int[] rank = new int[N+1];
        init(N, par, rank);
        for(int i = 0;i < M;i++){
            int xi = sc.nextInt();
            int yi = sc.nextInt();
            unite(xi, yi, par, rank);
        }
        int ans = 0;
        for(int i = 1;i <= N;i++){
            if(same(i, P[i], par, rank))    ans++;
        }
        System.out.println(ans);
    }
    /**
     *  initialization
     */
    public static void init(int n, int[] par, int[] rank){
        for(int i = 1;i <= n;i++){
            par[i] = i;
            rank[i] = 0;
        }
    }
    /**
     *  find the root
     */
    public static int find(int x, int[] par, int[] rank){
        if(par[x] == x) return x;
        else    return par[x] = find(par[x], par, rank);
    }
    /**
     *  unite x and y
     */
    public static void unite(int x, int y, int[] par, int[] rank){
        x = find(x, par, rank);
        y = find(y, par, rank);
        if(x == y)  return;
        if(rank[x] < rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x] == rank[y])  rank[x]++;
        }
    }
    public static boolean same(int x, int y, int[] par, int[] rank){
        return find(x, par, rank) == find(y, par, rank);
    }
}