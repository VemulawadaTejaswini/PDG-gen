import java.util.*;

public class Main{
    
    static int n;
    static List<Integer>[] g;
    static int[] color;
    static int[] cnt;
    
    public static void dfs(int v){
        for(int u : g[v]){
            if(color[u] == -1){
                color[u] = color[v]^1;
                cnt[color[u]]++;
                dfs(u);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        g = new List[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            g[a].add(b);
            g[b].add(a);
        }
        
        cnt = new int[2];
        color = new int[n];
        Arrays.fill(color, -1);
        color[0] = 0;
        cnt[0]++;
        dfs(0);
        
        if(cnt[0] > cnt[1]){
            for(int i=0; i<n; i++){
                color[i] ^= 1;
            }
            cnt[0] = cnt[1];
        }
        
        StringJoiner sj = new StringJoiner(" ");
        int[] p = {1, 2, 3};
        if(cnt[0]<=n/3){
            for(int i=0; i<n; i++){
                if(color[i]==0){
                    sj.add(p[0] + "");
                    p[0] += 3;
                }else{
                    for(int j=0; j<3; j++){
                        if(p[j]<=n){
                            sj.add(p[j] + "");
                            p[j] += 3;
                            break;
                        }
                    }
                }
            }
        }else{
            for(int i=0; i<n; i++){
                if(p[color[i]]<=n){
                    sj.add(p[color[i]] + "");
                    p[color[i]] += 3;
                }else{
                    sj.add(p[2] + "");
                    p[2] += 3;
                }
            }
        }
        
        System.out.println(sj.toString());
    }
}
