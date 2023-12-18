import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < N; i++){
			queue.add(sc.nextLong());
		}
		sc.close();
		
		for(int i = 0; i < M; i++) {
			long x = queue.poll();
			x /= 2;
			queue.add(x);
		}
		
		long sum = 0;
		for(int i = 0; i < N; i++) {
			sum += queue.poll();
		}
		System.out.println(sum);
	}
}