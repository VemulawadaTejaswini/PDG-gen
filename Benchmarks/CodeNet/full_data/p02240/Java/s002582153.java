import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < n; i++){
            graph.put(i, new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            graph.get(s).add(t);
            graph.get(t).add(s);
        }
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] color = new int[n];
        int c = 0;
        for(int i = 0; i < n; i++){
            if(color[i] == 0){
                color[i] = ++c;
                stack.push(i);
            }
            while(!stack.isEmpty()){
                int s = stack.pop();
                for(Integer t : graph.get(s)){
                    if(color[t] == 0){
                        color[t] = c;
                        stack.push(t);
                    }
                }
            }
        }
        
        int q = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            if(color[s] == color[t]){
                sb.append("yes").append(System.lineSeparator());
            }else{
                sb.append("no").append(System.lineSeparator());
            }
        }
        
        System.out.print(sb);
    }
}
