import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] p = new int[n];
        for(int i=0; i<n; i++){
            p[i] = Integer.parseInt(sc.next());
            par[i] = i;
        }
        
        for(int i=0; i<m; i++){
            int x = Integer.parseInt(sc.next())-1;
            int y = Integer.parseInt(sc.next())-1;
            unite(par, rank, x, y);
        }
        
        List<Integer>[] h = new ArrayList[n];
        for(int i=0; i<n; i++){
            h[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n; i++){
            int tmp = find(par, i);
            h[tmp].add(i);
            //System.out.println(tmp);
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int t : h[par[i]]){
                if(p[i] == t+1){
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
    
    public static int find(int[] par, int x){
        if(par[x] == x){
            return x;
        }else{
            par[x] = find(par, par[x]);
            return par[x];
        }
    }
    
    public static void unite(int[] par, int[]rank, int x, int y){
        x = find(par, x);
        y = find(par, y);
        if(x==y) return;
        
        if(rank[x]<rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }
}
