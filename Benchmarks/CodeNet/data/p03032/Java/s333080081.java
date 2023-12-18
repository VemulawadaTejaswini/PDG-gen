import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int V[] = new int[N];
		for(int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int l = 0; l < K; l++) {
			for(int r = 0; r < K - l; r++) {
				if(l + r >= N - 1) break;
				int d = K - l - r;
				int temp = 0;
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
				for(int i = 0; i < l; i++) {
					temp += V[i];
					pq.add(V[i]);
				}
				for(int i = 0; i < r; i++) {
					temp += V[N - 1 - i];
					pq.add(V[N - 1 - i]);
				}
				for(int i = 0; i < d; i++) {
					if(!pq.isEmpty() && pq.peek() < 0) {
						temp -= pq.poll();
					}
				}
				ans = Math.max(ans, temp);
			}
		}
		System.out.println(ans);
	}
}
