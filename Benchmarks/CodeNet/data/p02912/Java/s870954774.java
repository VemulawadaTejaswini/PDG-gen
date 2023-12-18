import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int check = 1;
		do{
			Arrays.sort(A);
			if(M == 1) {
				A[N-1] /= 2;
				M--;
				break;
			}
			int min = A[0];
			int max = A[N-1];
			int mid = (min + max) / 2;
			if(A[N - N/check] >= mid && (N - N/check) <= M) {
				for(int j = N - N/check; j < N; j++) {
					A[j] /= 2;
					M--; 
				}
			}else {
				check *= 2;
				if(check >= N) {
					check = N;
				}
			}
		}while(M > 0);
		int out = 0;
		for(int i = 0; i < N; i++) {
			out += A[i];
		}
		System.out.println(out);
		sc.close();
	}

}