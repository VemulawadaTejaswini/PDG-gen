import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		for(int i=0;i<N;i++) dq.addLast(sc.nextInt());
		
		long max = 0;
		for(int l=0;l<=K;l++) {
			for(int r=0;r<=K-l;r++) {
				ArrayDeque<Integer> q = dq.clone();
				if(r+l>N) continue;
				int d = K - l - r ;
				int now = 0;
				Queue<Integer> pq = new PriorityQueue<Integer>();
				for (int i=0;i<l;i++) {
					int tmp = q.removeFirst(); 
					now += tmp;
					pq.offer(tmp);
				}
				for (int i=0;i<r;i++) {
					int tmp = q.removeLast();
					now += tmp;
					pq.offer(tmp);
				}
				int t = 0;
				while(t<d && !pq.isEmpty() && pq.peek()<0) {
					now -= pq.poll();
					t++;
				}
				max = Math.max(max, now);
			}
		}
		System.out.println(max);
	}
}