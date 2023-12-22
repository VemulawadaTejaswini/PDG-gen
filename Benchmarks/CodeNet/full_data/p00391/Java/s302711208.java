import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < w; i++) {
		    queue.add(-sc.nextInt());
		}
		PriorityQueue<Integer> next = new PriorityQueue<>();
		for (int i = 0; i < h; i++) {
		    int count = sc.nextInt();
		    for (int j = 0; j < w; j++) {
		        if (j < count) {
		            if (queue.peek() == 0) {
		                System.out.println(0);
		                return;
		            }
		            next.add(queue.poll() + 1);
		        } else {
		            next.add(queue.poll());
		        }
		    }
		    PriorityQueue<Integer> tmp = next;
		    next = queue;
		    queue = tmp;
		}
		if (queue.peek() != 0) {
		    System.out.println(0);
		} else {
		    System.out.println(1);
		}
	}
}

