import java.util.*;
import java.util.function.BiConsumer;


//幅優先探査（BFS）による解法
//Breadth-first search
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    
        int X = sc.nextInt();    
        int Y = sc.nextInt();    
        sc.close();
        X--; Y--;
        int INF = 1001001001;
        int[] dist = new int[N];
        int[] count = new int[N];
        for (int sv = 0; sv < N; sv++) {
            Arrays.fill(dist, INF);
            Queue<Integer> queue = new ArrayDeque<>();
            BiConsumer<Integer, Integer> push = (v, d) -> { 
                if (dist[v] != INF) return;
                dist[v] = d;
                queue.add(v);
            };
            push.accept(sv, 0);
            while(queue.peek() != null) {
                int v = queue.poll();
                int d = dist[v];
                if (v - 1 >= 0) push.accept(v - 1, d + 1);
                if (v + 1 < N) push.accept(v + 1, d + 1);
                if (v == X) push.accept(Y, d + 1);
                if (v == Y) push.accept(X, d + 1);
            }
            for (int i = 0; i < N; i++) {
                count[dist[i]]++;
            }
        }
        
        for (int ans : count){
            System.out.println(ans/2);        
        }
    }
}
