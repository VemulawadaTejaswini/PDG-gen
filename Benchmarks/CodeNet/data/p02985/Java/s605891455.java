import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9 + 7;
    static int n;
    static int k;
    static ArrayList<Integer>[] g;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        k = Integer.parseInt(sc.next());
        
        g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            g[a].add(b);
            g[b].add(a);
        }
        
        int idx = 0;
        for(int i=0; i<n; i++){
            if(g[i].size()==1){
                idx = i;
                break;
            }
        }
        
        System.out.println(dfs(idx, -1, k));
    }
    
    public static long dfs(int now, int pre, long c){
        long ret = c;
        
        int color = k-1;
        if(pre!=-1){
            color--;
        }
        
        for(int next : g[now]){
            if(next == pre){
                continue;
            }
            ret *= dfs(next, now, color);
            ret %= MOD;
            color--;
        }
        
        return ret;
    }
}
