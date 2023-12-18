
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int t:A) pq.offer(t);
		for(int i=0;i<M;i++) {
			int t = pq.poll();
			t /= 2;
			pq.offer(t);
		}
		long ans=0;
		while(pq.peek()!=null) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}