import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    static final int NIL = -1;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] parent = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(parent, NIL);
        Arrays.fill(left, NIL);
        Arrays.fill(right, NIL);
        for(int i = 0; i < n; i++){
            int id = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            int u = id;
            for(int j = 0; j < k; j++){
                int c = Integer.parseInt(sc.next());
                if(j == 0){
                    left[id] = c;
                }else{
                    right[u] = c;
                }
                u = c;
                parent[c] = id;
            }
        }
        
        int[] depth = new int[n];
        int u = 0;
        while(parent[u] != NIL){
            u = parent[u];
        }
        ArrayDeque<Integer> que = new ArrayDeque<>();
        depth[u] = 0;
        if(left[u] != NIL){
            que.add(left[u]);
        }
        while(!que.isEmpty()){
            u = que.remove();
            int d = depth[parent[u]]+1;
            while(u != NIL){
                depth[u] = d;
                if(left[u] != NIL){
                    que.add(left[u]);
                }
                u = right[u];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append("node ").append(i);
            sb.append(": parent = ").append(parent[i]);
            sb.append(", depth = ").append(depth[i]);
            if(parent[i] == NIL){
                sb.append(", root, [");
            }else if(left[i] == NIL){
                sb.append(", leaf, [");
            }else{
                sb.append(", internal node, [");
            }
            if(left[i] != NIL){
                sb.append(left[i]);
                int c = left[i];
                while(right[c] != NIL){
                    sb.append(", ").append(right[c]);
                    c = right[c];
                }
            }
            sb.append("]").append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
