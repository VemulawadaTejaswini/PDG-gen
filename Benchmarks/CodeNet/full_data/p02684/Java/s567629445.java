
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
		
		int Takahashi = 1;
		boolean[] visit = new boolean[N];
		visit[Takahashi-1] = true;
		
		int count1 = 0;
		for(int i = 0; i < N; i++) {
			if(!visit[A[Takahashi-1]-1]) {
				Takahashi = A[Takahashi-1];
				visit[A[Takahashi-1]-1] = true;
				count1 ++;
				
			}else {
				break;
			}
		}
		
		boolean[] visit2 = new boolean[N];
		visit2[Takahashi-1] = true;
		int count2 = 0;
		
		for(int i = 0; i < N; i++) {
			if(!visit2[A[Takahashi-1]-1]) {
				Takahashi = A[Takahashi-1];
				visit2[A[Takahashi-1]-1] = true;
				count2 ++;
				
			}else {
				break;
			}
		}
		
		K = K - count1;
		K = K % count2;
		
		for(int i = 0; i < K; i++) {
				Takahashi = A[Takahashi-1];
		}
		
		System.out.println(Takahashi);
		
		
		
	}
}


