import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 1; i <= n-1; i++){
            graph.get(i).add(i+1);
            graph.get(i+1).add(i);
        }
        graph.get(x).add(y);
        graph.get(y).add(x);
        
        int[] ans = new int[n];
        for(int i = 1; i <= n; i++){
            int[] dist = new int[n+1];
            Arrays.fill(dist, -1);
            dist[i] = 0;
            
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            
            while(!queue.isEmpty()){
                int u = queue.poll();
                graph.get(u).forEach((v) -> {
                    if(dist[v] == -1){
                        dist[v] = dist[u] +1;
                        ans[dist[v]]++;
                        queue.add(v);
                    }
                });
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n; i++){
            sb.append(ans[i]/2).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}