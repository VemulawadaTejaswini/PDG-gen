import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        List<List<Pair>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            graph.get(s).add(new Pair(t, w));
            graph.get(t).add(new Pair(s, w));
        }
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[0] = 0;
        queue.add(0);
        int x = 0;
        
        while(!queue.isEmpty()){
            int u = queue.poll();
            for (Pair v : graph.get(u)) {
                if(dist[v.id] == -1){
                    dist[v.id] = dist[u] + v.w;
                    if(dist[v.id] > dist[x]) x = v.id;
                    queue.add(v.id);
                }
            }
        }
        
        Arrays.fill(dist, -1);
        dist[x] = 0;
        queue.add(x);
        int y = 0;
        
        while(!queue.isEmpty()){
            int u = queue.poll();
            for (Pair v : graph.get(u)) {
                if(dist[v.id] == -1){
                    dist[v.id] = dist[u] + v.w;
                    if(dist[v.id] > dist[y]) y = v.id;
                    queue.add(v.id);
                }
            }
        }
        
        System.out.println(dist[y]);
    }
    
    static class Pair {
        int id;
        int w;

        public Pair(int id, int w) {
            this.id = id;
            this.w = w;
        }
    }
}
