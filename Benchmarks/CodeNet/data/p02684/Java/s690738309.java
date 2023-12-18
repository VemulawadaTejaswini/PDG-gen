
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
		long[] visitCount = new long[N];
		visitCount[now - 1] += 1;


		long frontPart = 0;
		while(visitCount[A[now-1]-1] == 0) {
			now = A[now-1];
			visitCount[A[now-1]-1] += 1;
			frontPart ++;
		}


		long cyclePart = 0;

		while(visitCount[A[now-1]-1] == 1) {
			now = A[now-1];
			visitCount[A[now-1]-1] += 1;
			cyclePart ++;
		}
		
		now = 1;

		if(K <= frontPart ) {
			for(long i = 0; i < K; i++) {
				now = A[now-1];
			}
		}else {
			for(long i = 0; i < frontPart; i++) {
				now = A[now-1];
			}
			K = (K - frontPart)%cyclePart;
			for(long i = 0; i < K; i++) {
				now = A[now-1];
			}
		}


		System.out.println(now);


	}
}