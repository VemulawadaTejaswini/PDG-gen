import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[20];
		int[] B = new int[20];
		int[] C = new int[20];
		int i = 0;
		int cs = 0;
		int csSum = 0;
		
		for( i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		for( i = 0; i<N; i++) {
			B[i] = sc.nextInt();
		}

		for( i = 0; i<N-1; i++) {
			C[i] = sc.nextInt();
		}
		for(i = 1; i<=N; i++) {
			if(A[i] == A[i-1]+1) {
				cs = B[A[i-1]-1] + C[A[i-1]-1];
			}else {
				cs = B[A[i-1]-1];
			}
			csSum += cs;
		}
		System.out.println(csSum);

		sc.close();
		
	}
}