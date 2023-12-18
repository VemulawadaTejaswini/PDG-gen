import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[0] += A[i];
			if(i % 2 == 1) {
				B[0] -= A[i] * 2;
			}
		}
		
		for(int i = 1; i < N; i++) {
			B[i] = (A[i - 1] - B[i - 1] / 2) * 2;
		}
		for(int i = 0; i < N - 1; i ++) {
			System.out.print(B[i] + " ");
		}
		System.out.println(B[N - 1]);
	}
}
