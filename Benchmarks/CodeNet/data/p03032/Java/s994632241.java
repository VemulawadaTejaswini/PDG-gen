import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] V = new long[N];
		
		for(int i = 0; i < N; i++) {
			V[i] = sc.nextLong();
		}
		
		int r = Math.min(N, K);
		long max = 0;
		
		for(int i = 0; i <= r; i++) {
			int count = 0;
			PriorityQueue<Long> hand = new PriorityQueue<>();
			for(int j = 0; j < i; j++) {
				hand.add(V[j]);
				count++;
			}
			
			for(int j = 0; j <= r - i; j++) {
				for(int k = 0; k < j; k++) {
					hand.add(V[N - 1 - k]);
					count++;
				}
				
				while(K - count > 0 && hand.size() > 0) {
					if(hand.peek() >= 0) {
						break;
					}
					hand.remove();
					count++;
				}
				
				long juel = 0;
				
				while(!hand.isEmpty()) {
					juel += hand.poll();
				}
				max = Math.max(juel, max);
			}
		}
		System.out.println(max);	
	}
}
