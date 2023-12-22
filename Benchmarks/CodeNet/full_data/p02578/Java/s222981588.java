import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A[] = new int[N];
		int step = 0;
		int max = 0;
		for(int i=0; i<N; i++) {
			A[i] = scan.nextInt();
		}

		max = A[0];
		for(int i=0; i<N; i++) {
			if(A[i-1] > A[i]) {
				if(A[i-1] - A[i] < max) {
					step += max;
				}else {
					step += A[i-1] - A[i];
					max = A[i];
				}
			}
		}
		System.out.println(step);
	}
}
