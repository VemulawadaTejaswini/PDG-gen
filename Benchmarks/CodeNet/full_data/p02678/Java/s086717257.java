import java.util.*;

public class Main{
    
    public static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        ArrayList<Integer>[] graph = new ArrayList[n];
        
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<m; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, (int)1e7);
        dist[0] = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(0);
        boolean[] used = new boolean[n];
        used[0] = true;
        int[] ans = new int[n];
        while(q.size()!=0){
            int now = q.pollFirst();
            for(int next : graph[now]){
                if(dist[now]+1 < dist[next]){
                    q.add(next);
                    dist[next] = dist[now]+1;
                    used[next] = true;
                    ans[next] = now+1;
                }
            }
        }
        
        System.out.println("Yes");
        for(int i=1; i<n; i++){
            System.out.println(ans[i]);
        }
        
    }
    
}