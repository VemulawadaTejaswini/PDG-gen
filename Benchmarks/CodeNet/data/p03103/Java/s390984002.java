import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] A = new int [N];
		int [] B = new int [N];


		for ( int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
				B[i] = sc.nextInt();
			}
		int sum = 0;
		int rest = M;
		int min;

		Outer:
		for (int j = 0; j < A.length; j++) {
			min = A[0];
			for ( int i = 0; i < A.length; i++) {
				min = Math.min(A[i], min);
			}
		
			for ( int i = 0; i < A.length; i++) {
				if (min == A[i]) {
					if (rest >= B[i]) {
						rest -= B[i];
						sum += A[i] * B[i];	
						A[i] = 1000000000;
					}
					else {
						sum += A[i] * rest;
						break Outer;
					}
				
				}	
			}
			
		}
		
		System.out.println(sum);
	}
}

