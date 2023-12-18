import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (i%2 == 0) {
                deq.addLast(sc.nextInt());
            } else {
                deq.addFirst(sc.nextInt());
            }            
        }
        StringBuilder sb = new StringBuilder();
        if (N%2 == 0) {
            while (!deq.isEmpty()) {
                sb.append(deq.poll() + " ");
            }
        } else {
            while (!deq.isEmpty()) {
                sb.append(deq.peek() + " ");
            }
        }
        System.out.println(sb);
    }
}
