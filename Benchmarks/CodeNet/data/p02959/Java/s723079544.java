import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N + 1];
		int B[] = new int[N + 1];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] - B[i] < 0) {
				ans += A[i];
				B[i + 1] = B[i + 1] + B[i] - A[i];
			} else {
				ans += B[i];
			}
		}
		System.out.println(ans + Math.min(A[N], B[N]));
	}
}
