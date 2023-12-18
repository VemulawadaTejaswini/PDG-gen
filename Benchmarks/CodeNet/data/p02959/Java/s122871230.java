import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N+1];
		int[] B = new int[N];
		long count = 0;
		
		for(int i = 0; i < N+1; i++) {
			A[i] = stdIn.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(A[i] >= B[i]) {
				count += B[i];
			}
			else {
				if(B[i]-A[i] >= A[i+1]) {
					count += (A[i]+A[i+1]);
					A[i+1] = 0;
				}
				else {
					count += B[i];
					A[i+1] -= (B[i]-A[i]);
				}
			}
		}
		
		System.out.println(count);

	}

}