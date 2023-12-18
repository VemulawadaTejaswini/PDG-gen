import java.util.*;

public class Main{
    static int[] par;
    static int[] rank;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        par = new int[n];
        rank = new int[n];
        int[] p = new int[n];
        List<Integer>[] h = new ArrayList[n];
        for(int i=0; i<n; i++){
            p[i] = Integer.parseInt(sc.next());
            par[i] = i;
            h[i] = new ArrayList<>();
        }
        
        for(int i=0; i<m; i++){
            int x = Integer.parseInt(sc.next())-1;
            int y = Integer.parseInt(sc.next())-1;
            unite(x, y);
        }
        
        for(int i=0; i<n; i++){
            int tmp = find(i);
            h[tmp].add(i);
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            if(same(i, p[i]-1)){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
    
    public static int find(int x){
        if(par[x] == x){
            return x;
        }else{
            par[x] = find(par[x]);
            return par[x];
        }
    }
    
    public static void unite(int x, int y){
        x = find(x);
        y = find(y);
        if(x==y) return;
        
        if(rank[x]<rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }
    
    public static boolean same(int x, int y){
        return find(x)==find(y);
    }
}
