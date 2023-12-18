import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayList<Integer>[] graph = new ArrayList[n];
        ArrayList<Integer>[] dist = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
            dist[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++){
            int u = Integer.parseInt(sc.next())-1;
            int v = Integer.parseInt(sc.next())-1;
            int w = Integer.parseInt(sc.next());
            graph[u].add(v);
            graph[v].add(u);
            dist[u].add(w);
            dist[v].add(w);
        }
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(0);
        boolean[] used = new boolean[n];
        int[] color = new int[n];
        while(q.size() != 0){
            int now = q.removeFirst();
            used[now] = true;
            for(int i=0; i<graph[now].size(); i++){
                int next = graph[now].get(i);
                int nextdist = dist[now].get(i);
                if(!used[next]){
                    q.addLast(next);
                    color[next] ^= nextdist%2;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.println(color[i]);
        }
    }
}
