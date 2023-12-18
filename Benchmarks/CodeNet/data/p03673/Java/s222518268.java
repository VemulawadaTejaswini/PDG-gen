import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> deque  = new LinkedList<>();
        for (int i=0;i<n;i++) {
            if (i%2==0) {
                deque.addFirst(sc.nextInt());
            } else {
                deque.addLast(sc.nextInt());
            }
        }
        
        if (n % 2 == 0) {
            while (!deque.isEmpty()) {
                System.out.print(deque.pollLast() + " ");
            }
        } else {
            while (!deque.isEmpty()) {
                System.out.print(deque.pollLast() + " ");
            }
        }
    }
}
