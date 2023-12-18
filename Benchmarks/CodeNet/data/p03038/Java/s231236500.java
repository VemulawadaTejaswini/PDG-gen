import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] A = new long[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}

		long[][] BC = new long[M][2];
		for(int i=0; i<M; i++) {
			BC[i][0] = sc.nextLong();
			BC[i][1] = sc.nextLong();
		}
		
		Arrays.sort(A);
		Arrays.sort(BC, (a, b) -> Long.compare(a[0], b[0]));

		for(int i=M-1; i>=0; i--) {
			for(int j=0; j<BC[i][0]; j++) {
				if(A[j] < BC[i][1]) {
					A[j] = BC[i][1];
				} else {
					break;
				}
			}
			Arrays.sort(A);
		}
		
		long sum = 0;
		for(int i=0; i<A.length; i++) {
			sum += A[i];
		}
		
		System.out.println(sum);

	}
}
