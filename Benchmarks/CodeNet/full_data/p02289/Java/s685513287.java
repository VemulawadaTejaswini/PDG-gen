import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        while (true) {
            String order = sc.next();
            if (order.startsWith("i")) {
                pq.add(sc.nextInt());

            } else if (order.startsWith("ex")) {
                System.out.println(pq.poll());

            } else {
                break;
            }
        }
    }
}

