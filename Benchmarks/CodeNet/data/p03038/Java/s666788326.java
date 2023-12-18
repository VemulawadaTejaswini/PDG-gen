import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        long total = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            queue.add(A);
            total += A;
        }
        
        for(int i = 0; i < M; i++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            for(int j = 0; j < B; j++){
                if( C <= queue.peek() ) break;
                int x = queue.poll();
                total -= x;
                queue.add(C);
                total += C;
            }
        }
        
        System.out.println(total);

    }
}
