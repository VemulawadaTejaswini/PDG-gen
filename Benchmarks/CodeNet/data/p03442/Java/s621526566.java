import java.util.*;

public class Main{
    
    static int n;
    static ArrayList<Integer>[][] g;
    static ArrayList<Integer>[][] rg;
    static ArrayList<Integer>[] vs;
    static boolean[] used;
    static int[][] cmp;
    static int[][] cmpcnt;
    static int ov2cnt;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        g = new ArrayList[4][n];
        rg = new ArrayList[4][n];
        vs = new ArrayList[4];
        for(int i=0; i<4; i++){
            for(int j=0; j<n; j++){
                g[i][j] = new ArrayList<Integer>();
                rg[i][j] = new ArrayList<Integer>();
            }
            vs[i] = new ArrayList<Integer>();
        }
        
        used = new boolean[n];
        cmp = new int[4][n];
        cmpcnt = new int[4][n];
        
        for(int i=0; i<n-1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            
            int max = Math.max(x,y);
            int min = Math.min(x,y);
            
            for(int j=0; j<4; j++){
                addEdgeBit(min, max, j);
                if(((a >> j) & 1)==1){
                    addEdgeBit(max, min, j);
                }
            }
        }
        
        int ans = 0;
        for(int i=0; i<4; i++){
            scc(i);
            //System.out.println(ov2cnt);
            ans += ov2cnt;
        }
        
        System.out.println(ans);
    }
    
    public static int scc(int bit){
        usedReset();
        for(int i=0; i<n; i++){
            if(!used[i]){
                dfs(i, bit);
            }
        }
        
        ov2cnt = 0;
        
        int k =0;
        usedReset();
        for(int i=n-1; i>=0; i--){
            if(!used[vs[bit].get(i)]) rdfs(vs[bit].get(i), k++, bit);
        }
        
        return k;
    }
    
    
    public static void usedReset(){
        Arrays.fill(used, false);
    }
    
    public static void addEdgeBit(int from, int to, int bit){
        g[bit][from].add(to);
        rg[bit][to].add(from);
    }
    
    public static void dfs(int v, int bit){
        used[v] = true;
        for(int i=0; i<g[bit][v].size(); i++){
            if(!used[g[bit][v].get(i)]) dfs(g[bit][v].get(i), bit);
        }
        vs[bit].add(v);
    }
    
    public static void rdfs(int v, int k, int bit){
        used[v] = true;
        cmp[bit][v] = k;
        cmpcnt[bit][k]++;
        if(cmpcnt[bit][k]==2){
            ov2cnt++;
        }
        for(int i=0; i<rg[bit][v].size(); i++){
            if(!used[rg[bit][v].get(i)]) rdfs(rg[bit][v].get(i), k, bit);
        }
    }
    
}