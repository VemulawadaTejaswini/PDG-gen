import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
		    public int compare(Integer i1, Integer i2) {
		        return i2.intValue() - i1.intValue();
		    }
		});
		for (int i = 0; i < n; i++) {
		    queue.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
		    queue.add(queue.poll() / 2);
		}
		long total = 0;
		while (queue.size() > 0) {
		    total += queue.poll();
		}
		System.out.println(total);
   }
}


