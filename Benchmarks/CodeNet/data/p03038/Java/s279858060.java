import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[N];
		long B = 0;
		long C = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		
		for(int i = 0; i < M; i++) {
			Arrays.sort(A);
			B = sc.nextLong();
			C = sc.nextLong();
			int count = 0;
			for(int j = 0; j < N; j++) {
				if(C > A[j] && count < B) {
					A[j] = C;
					count++;
				} else {
					break;
				}
			}
		}
		
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += A[i];
		}
		System.out.println(sum);
	}
}
