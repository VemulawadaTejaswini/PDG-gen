
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
		int[] visitCount = new int[N];
		visitCount[now - 1] += 1;
		
		
		int frontPart = 0;
		while(visitCount[A[now-1]-1] == 0) {
			now = A[now-1];
			visitCount[A[now-1]-1] += 1;
			frontPart ++;
		}


		int cyclePart = 0;

		while(visitCount[A[now-1]-1] == 1) {
			now = A[now-1];
			visitCount[A[now-1]-1] += 1;
			cyclePart ++;
		}
		
		if(K <= frontPart ) {
		for(int i = 0; i < K; i++) {
			now = A[now-1];
		}
		}else {
			K = (K - frontPart)%cyclePart;
			for(int i = 0; i < K; i++) {
				now = A[now-1];
			}
		}


		System.out.println(now);


	}
}