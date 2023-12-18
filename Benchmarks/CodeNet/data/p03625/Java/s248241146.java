import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Long> queue = new PriorityQueue<Long>(Collections.reverseOrder());
		HashSet<Long> has = new HashSet<Long>();
		
		queue.add((long) 0); queue.add((long) 0);
		for(int i = 1; i<=N; i++) {
			long n = sc.nextInt();
			if(has.contains(n)) {
				queue.add((n));
				has.remove(n);
			}
			else {
				has.add(n);
			}
		}
		
		System.out.println(queue.poll()*queue.poll());
		
	}

}
