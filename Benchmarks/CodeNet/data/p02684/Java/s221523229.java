
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int [] A = new int[N];

		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int now = 1;
		boolean[] visit = new boolean[N];
		visit[now-1] = true;
		
		
		int frontPart = 0;
		while(!visit[A[now-1]-1]) {
			now = A[now-1];
			visit[A[now-1]-1] = true;
			frontPart ++;
		}


		boolean[] visit2 = new boolean[N];
		int cyclePart = 0;


		while(!visit2[A[now-1]-1]) {
			now = A[now-1];
			visit2[A[now-1]-1] = true;
			cyclePart ++;
		}

		K = K - frontPart;
		K = K % cyclePart;

		for(int i = 0; i < K; i++) {
			now = A[now-1];
		}


		System.out.println(now);


	}
}