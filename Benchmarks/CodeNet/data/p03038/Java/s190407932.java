import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long B = 0;
		long C = 0;
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			pq.add(sc.nextLong());
		}
		
		for(int i = 0; i < M; i++) {
			B = sc.nextLong();
			C = sc.nextLong();
			int count = 0;
			long x = pq.poll();
			while(C > x && count < B) {
				count++;
				pq.add(C);
				x = pq.poll();
			}
			pq.add(x);
		}
		
		long sum = 0;
		
		while(!pq.isEmpty()) {
			sum += pq.poll();
		}
		System.out.println(sum);
	}
}
