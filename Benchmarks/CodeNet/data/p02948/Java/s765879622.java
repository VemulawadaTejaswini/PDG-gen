import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		LinkedList<Work> works = new LinkedList<>();
		for(int i=0; i<N; i++) {
			works.add(new Work(in.nextInt(), in.nextInt()));
		}
		Collections.sort(works);
		
		PriorityQueue<Work> candidate = new PriorityQueue<Work>(
				(a,b)->-Integer.compare(a.value, b.value)
		);
		
		long ans = 0;
		for(int rem=1; rem<=M; rem++) {
			while(!works.isEmpty() && works.peek().delay<=rem) 
				candidate.add(works.poll());
			if(!candidate.isEmpty())
				ans += candidate.poll().value;
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	class Work implements Comparable<Work>{
		public int delay;
		public int value;
		public Work(int A, int B) {
			delay = A;
			value = B;			
		}
		@Override
		public int compareTo(Work targ) {
			if(delay == targ.delay) {
				return -Integer.compare(value, targ.value);
			}
			return Integer.compare(delay, targ.delay);
		}
	}
}