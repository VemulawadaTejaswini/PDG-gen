import java.util.*;

public class Main{
    
    static int[] v,d,c,result,used;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        Map<Integer,Integer> map = new TreeMap<>();
        Map<Integer,List<Integer>> idx = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            map.merge(a[i], 1, Integer::sum);
            if(idx.get(a[i]) == null){
                idx.put(a[i], new ArrayList<>());
                
            }
            idx.get(a[i]).add(i);
        }
        
        ArrayList<Integer> nibeki = new ArrayList<>();
        for(long i=2; i<2_000_000_000; i*=2){
            nibeki.add((int)i);
        }
        
        BipartiteMatching bm = new BipartiteMatching(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<nibeki.size(); j++){
                //System.out.println(map.get(nibeki.get(j)-a[i]) != null);
                if(map.get(nibeki.get(j)-a[i]) != null){
                    //System.out.println(idx.get(a[i]).size());
                    for(int k : idx.get(nibeki.get(j)-a[i])){
                        if(i>=k){
                            continue;
                        }
                        bm.addEdge(i, k);
                        //System.out.println("addEdge : " +i+" , "+k);
                    }
                }
            }
        }
        
        int ans =  bm.bipartiteMatching();
        System.out.println(ans);
    }
}

class BipartiteMatching{
    
    public static final int INF = (int)1e9;
    
    public static int n;
    private static List<Integer>[] edge;
    private static int[] match;
    private static boolean[] used;
    
    public BipartiteMatching(int n){
        this.n = n;
        edge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
        match = new int[n];
        used = new boolean[n];
    }
    
    public int bipartiteMatching(){
        int res = 0;
        Arrays.fill(match, -1);
        for(int v=0; v<n; v++){
            if(match[v] < 0){
                Arrays.fill(used, false);
                if(dfs(v)){
                    res++;
                }
            }
        }
        return res;
    }
    
    public boolean dfs(int v){
        used[v] = true;
        for(int i=0; i<edge[v].size(); i++){
            int u = edge[v].get(i);
            int w = match[u];
            if( w < 0 || (!used[w] && dfs(w)) ){
                match[v] = u;
                match[u] = v;
                return true;
            }
        }
        return false;
    }
    
    public void addEdge(int u, int v){
        edge[u].add(v);
        edge[v].add(u);
    }
    
}
