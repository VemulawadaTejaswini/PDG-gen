import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			pq.add(A[i]);
		}
		int B[][] = new int[M][2];
		for(int i = 0; i < M; i++) {
			B[i][0] = sc.nextInt();
			B[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < B[i][0]; j++) {
				if(pq.peek() < B[i][1]) {
					pq.poll();
					pq.add(B[i][1]);
				} else {
					break;
				}
			}
		}
		long ans = 0;
		for(int i = 0; i < N; i++) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}
