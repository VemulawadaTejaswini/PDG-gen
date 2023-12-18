import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			B[i] = sc.nextInt();

		long ans = 0;
		boolean update = true;
		while(update) {
			update = false;
			for(int i=0; i<N; i++) {
				if(B[i]<A[i]) {
					update = false;
					break;
				}
				int i0 = (i-1+N)%N;
				int i2 = (i+1)%N;
				if(B[i0] < B[i] && B[i] > B[i2]) {
					int move = (B[i]-A[i])/(B[i0]+B[i2]);
					ans += move;
					B[i] -= move*(B[i0]+B[i2]);
					if(move>0)
						update = true;
				}
			}
		}
		boolean ok = true;
		for(int i=0; i<N; i++) {
			if(A[i]!=B[i]) {
				ok = false;
				break;
			}
		}
		
		System.out.println(ok ? ans : -1);
		sc.close();
	}
}
