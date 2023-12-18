import java.util.*;

public class Main {
    static int[] par, rank;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt() - 1;
        }
        int[][] x = new int[m][2];
        for(int i=0; i<m; i++){
            x[i][0] = sc.nextInt() - 1;
            x[i][1] = sc.nextInt() - 1;
        }
        par = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
            rank[i] = 0;
        }

        for(int i=0; i<m; i++){
            unite(x[i][0], x[i][1]);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            if(same(i, p[i])) ans++;
        }
        System.out.println(ans);
    }

    public static int find(int x){
        if(par[x] == x){
            return x;
        }else{
            return par[x] = find(par[x]);
        }
    }

    public static void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y) return;

        if(rank[x] < rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x] == rank[y]) rank[x]++;
        }
    }

    public static boolean same(int x, int y){
        return find(x) == find(y);
    }
}