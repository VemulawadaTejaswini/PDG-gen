import java.util.*;

public class Main{
    
    static int n,k;
    static List<Integer>[] edge;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        k = Integer.parseInt(sc.next());
        
        edge = new List[n];
        for(int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            edge[a-1].add(b-1);
            edge[b-1].add(a-1);
        }
        
        int[] distx = bfs(0);
        
        int max = -1;
        int idx1 = -1;
        for(int i=0; i<n; i++){
            if(max < distx[i]){
                max = distx[i];
                idx1 = i;
            }
        }
        
        int[] disty = bfs(idx1);
        
        int idx2 = -1;
        for(int i=0; i<n; i++){
            if(max < disty[i]){
                max = disty[i];
                idx2 = i;
            }
        }
        
        distx = bfs(idx2);
        
        //System.out.println("["+ idx1 + " " + idx2 + "]" + "max:" + max);
        
        PriorityQueue<Vertex> ky = new PriorityQueue<>();
        
        boolean[] mk = new boolean[n];
        Arrays.fill(mk, true);
        for(int i=0; i<n; i++){
            //System.out.println(distx[i] + " " + disty[i] + " = " + (distx[i]+disty[i]));
            if(distx[i]+disty[i] == max){
                mk[i] = false;
                ky.add(new Vertex(i, disty[i]));
            }
        }
        
        int[] ha = new int[ky.size()];
        int i = 0;
        while(ky.size()!=0){
            Vertex v = ky.poll();
            int s = v.ver;
            ha[i++] = dfs(s, s, mk);
        }
        
        int l = 0;
        int r = ha.length-1;
        int ans = 0;
        while((r-l-1) > k){
            if(ha[l] > ha[r]){
                r--;
                ans += ha[r];
            }else{
                l++;
                ans += ha[l];
            }
        }
        
        System.out.println(ans);
        
    }
    
    public static int dfs(int from, int to, boolean[] mk){
        int cnt = 1;
        for(int i=0; i<edge[to].size(); i++){
            int next = edge[to].get(i);
            if(next != from && mk[next]){
                cnt += dfs(to, next, mk);
            }
        }
        return cnt;
    }
    
    public static int[] bfs(int from){
        int[] dist = new int[n];
        Arrays.fill(dist, (int)1e9);
        dist[from] = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(from);
        int x = -1;//last
        while(q.size()!=0){
            int now = q.poll();
            for(int i=0; i<edge[now].size(); i++){
                int v = edge[now].get(i);
                if(dist[v] > dist[now]+1){
                    dist[v] = dist[now]+1;
                    q.add(v);
                    x = v;
                }
            }
        }
        return dist;
    }
}


class Vertex implements Comparable<Vertex>{
    public int ver = 0;
    public int cost = 0;
    
    public Vertex(int ver, int cost) {
        this.ver = ver;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Vertex o) {
        return this.cost - o.cost;
    }
}