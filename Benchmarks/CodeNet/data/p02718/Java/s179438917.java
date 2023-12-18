import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();


		int[] A = new int[N];
		int sum = 0;

		for(int i=0; i<N;i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}

		Arrays.sort(A);


		Double ts = (double)1 / (double)(4*M) * (double)sum ;

		for(int i=N-1; i>=N-M; i--) {
			if(ts > A[i]) {
				System.out.println("No");
				sc.close();
				return;
			}
		}


		System.out.println("Yes");
		sc.close();

	}
}