import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++){
            int u = Integer.parseInt(sc.next());
            graph.put(u, new ArrayList<>());
            int k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                graph.get(u).add(Integer.parseInt(sc.next()));
            }
        }
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] d = new int[n+1];
        Arrays.fill(d, -1);
        queue.add(1);
        d[1] = 0;
        while(!queue.isEmpty()){
            int u = queue.poll();
            graph.get(u).forEach((v) -> {
                if(d[v] == -1){
                    queue.add(v);
                    d[v] = d[u] +1;
                }
            });
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(i).append(" ").append(d[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
