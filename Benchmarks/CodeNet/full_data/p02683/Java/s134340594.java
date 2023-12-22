import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        
        Rikai[] sanko = new Rikai[n];
        for(int i=0; i<n; i++){
            int cost = Integer.parseInt(sc.next());
            int[] a = new int[m];
            for(int j=0; j<m; j++){
                a[j] = Integer.parseInt(sc.next());
            }
            sanko[i] = new Rikai(cost,m,x,a);
        }
        
        ArrayList<Rikai>[] dp = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = new ArrayList<>();
        }
        dp[0].add(new Rikai(0,m,x,new int[m]));
        
        int ans = (int)1e9;
        for(int i=0; i<=n; i++){
            for(Rikai tmp : dp[i]){
                if(i<n){
                    dp[i+1].add(tmp.kounyu(sanko[i]));
                    dp[i+1].add(tmp);
                }
                ans = Math.min(ans, tmp.cost());
            }
        }
        
        if(ans < (int)1e9){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
        
    }
    
    
}

class Rikai{
    public int cost,m,x;
    public int[] rikaido;
    
    public Rikai(int cost, int m, int x, int[] rikaido){
        this.cost = cost;
        this.m = m;
        this.x = x;
        this.rikaido = new int[m];
        for(int i=0; i<m; i++){
            this.rikaido[i] = rikaido[i];
        }
    }
    
    public Rikai kounyu(Rikai z){
        int[] newrikaido = new int[m];
        for(int i=0; i<m; i++){
            newrikaido[i] += this.rikaido[i];
            newrikaido[i] += z.rikaido[i];
        }
        int newcost = this.cost + z.cost;
        return new Rikai(newcost,m,x,newrikaido);
    }
    
    public int cost(){
        for(int tmp : rikaido){
            if(tmp<x){
                return (int)1e9;
            }
        }
        return cost;
    }
}
