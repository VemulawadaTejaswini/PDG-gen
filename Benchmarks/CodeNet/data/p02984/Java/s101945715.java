import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i <= A[0]; i++) {
			B[0] = i;
			B[N-1] = A[N-1]-B[0];
			for(int j = 1; j < (N+1)/2; j++) {
				B[j] = A[j-1]-B[j-1];
				if(j >= 2) {
					B[N-j] = A[N-j]-B[N-j+1];
				}
			}
			if(B[(N-1)/2]+B[(N+1)/2] == A[(N-1)/2]) {
				break;
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(2*B[i]);
		}

	}

}