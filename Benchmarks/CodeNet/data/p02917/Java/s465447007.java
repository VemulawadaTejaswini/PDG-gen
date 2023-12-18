import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N-1];
		for(int i = 0; i < N-1; i++) {
			B[i] = sc.nextInt();
		}
		int[] A = new int[N];
		if(N > 2) {
			A[0] = Math.min(B[0],B[1]);
		}
		else{
			A[0] = B[0];
		}
		
		if(N > 2) {
			for(int i = 0; i < N-2; i++) {
				if(B[i] > B[i+1] ) {
					A[i+1] = B[i+1];
				}
				else {
					A[i+1] = B[i];
				}
				A[N-1] = Math.max(B[N-3], B[N-2]);
			}
		}
		else {
			A[1] = A[0];
		}
		int R = 0;
		for(int i = 0; i < N; i++) {
			R += A[i];
		}
		System.out.println(R);
	}
}