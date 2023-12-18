import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] A = new long[N];
		long[] B = new long[N];
		long[] C = new long[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = A[i];
		}
		
		Arrays.sort(C);
		
		long sumPlice = 0;
		long sumNum = 0;
		
		loop:
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(C[i] == A[j]) {
					sumPlice += C[i] * B[j];
					sumNum += B[j];
					if(sumNum >= M) {
						sumPlice = sumPlice - (sumNum - M) * C[i];
						break loop;
					}
					A[j] = -1;
					break;
				}
			}

		}	
		System.out.println(sumPlice);
	}
}
