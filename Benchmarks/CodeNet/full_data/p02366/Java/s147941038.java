import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < E; i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            graph.get(s).add(t);
            graph.get(t).add(s);
        }
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] prenum = new int[V];
        int[] parent = new int[V];
        int[] lowest = new int[V];
        int timer = 1;
        int root = 0;
        prenum[root] = timer;
        parent[root] = -1;
        lowest[root] = timer;
        timer++;
        stack.push(root);
        
        while(!stack.isEmpty()){
            int u = stack.peek();
            int v = -1;
            for (Integer i : graph.get(u)) {
                if(prenum[i] == 0){
                    v = i;
                    break;
                }
            }
            if(v != -1){
                prenum[v] = timer;
                parent[v] = u;
                lowest[v] = timer;
                timer++;
                stack.push(v);
            }else{
                u = stack.pop();
                for (Integer i : graph.get(u)) {
                    if(i != parent[u]){
                        lowest[u] = Math.min(lowest[u], prenum[i]);
                    }
                }
                if(parent[u] != -1){
                    int p = parent[u];
                    lowest[p] = Math.min(lowest[p], lowest[u]);
                }
            }
        }
        
        Set<Integer> ap = new TreeSet<>();
        int np = 0;
        for(int i = 1; i < V; i++){
            int p = parent[i];
            if(p == root){
                np++;
            }else if(prenum[p] <= lowest[i]){
                ap.add(p);
            }
        }
        if(np > 1) ap.add(root);
        
        StringBuilder sb = new StringBuilder();
        ap.forEach((i) -> {
            sb.append(i).append(System.lineSeparator());
        });
        System.out.print(sb);
    }
}
