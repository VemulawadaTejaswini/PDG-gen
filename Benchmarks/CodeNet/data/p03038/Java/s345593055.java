import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		PriorityQueue<Long> A = new PriorityQueue<>();
		
		for(int i = 0; i < N; i++) {
			A.add(sc.nextLong());
		}
		
		for(int i = 0; i < M; i++) {
			long B = sc.nextLong();
			long C = sc.nextLong();
			int count = 0;
			while(C > A.peek() && count < B) {
				count++;
				A.poll();
				A.add(C);
			}
		}
		
		long sum = 0;
		
		while(!A.isEmpty()) {
			sum += A.poll();
		}
		System.out.println(sum);
	}
}
