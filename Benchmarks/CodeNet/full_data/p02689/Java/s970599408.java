import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int[] h = new int[n];
        for(int i=0; i<n; i++){
            h[i] = Integer.parseInt(sc.next());
        }
        
        ArrayList<Integer>[] g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        for(int i=0; i<m; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            g[a].add(b);
            g[b].add(a);
        }
        
        int ans = 0;
        for(int i=0; i<n; i++){
            boolean yoi = true;
            for(int next : g[i]){
                if(h[i] <= h[next]){
                    yoi = false;
                }
            }
            if(yoi){
                ans++;
            }
        }
        
        System.out.println(ans);
        
    }
}
