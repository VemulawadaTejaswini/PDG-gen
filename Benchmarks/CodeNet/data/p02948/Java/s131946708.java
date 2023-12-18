import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[][] = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		Arrays.sort(A, Comparator.comparingInt(o -> o[0]));
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int c = 0;
		int ans = 0;
		for(int i = 1; i <= M; i++) {
			while(c < N && A[c][0] == i) {
				pq.add(A[c][1]);
				c++;
			}
			if(pq.size() > 0) {
				ans += pq.poll();
			}
		}
		System.out.println(ans);
	}
}
