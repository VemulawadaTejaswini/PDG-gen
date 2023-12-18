import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] A = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, (x,y) -> x[0]-y[0]);
		long ans = 0;
		int p = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 1; i <= M; i++) {
			for(int j = p; j < N; j++) {
				if(A[j][0] <= i)
					pq.offer(A[j][1]);
				else {
					p = j;
					break;
				}
			}
			if(pq.size() > 0)
				ans += pq.poll();
		}
		System.out.println(ans);
	}

}