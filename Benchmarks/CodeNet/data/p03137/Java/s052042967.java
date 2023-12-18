import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
 
        int[] X = new int[M];
        for(int i = 0; i < M; i++){
            X[i] = sc.nextInt();
        }

        Arrays.sort(X);
        
        int ans = 0;
        Queue<Integer> queue = new PriorityQueue<>( (s1, s2) -> (s2 - s1) );
        for(int i = 1; i < M; i++){
            int diff = X[i] - X[i-1];
            queue.add(diff);
            ans  += diff;
        }
        
        while( !queue.isEmpty() && --N > 0){
            ans -= queue.poll();
        }
        
        System.out.println(ans);
    }
}
