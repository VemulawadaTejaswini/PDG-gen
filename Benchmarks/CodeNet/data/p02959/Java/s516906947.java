import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+1];
		long[] B = new long[N];
		for(int n = 0; n <= N; n++) A[n]=sc.nextLong();
		for(int n = 0; n < N; n++) B[n]=sc.nextLong();
		sc.close();

		long ans = 0;
		for(int i = 0;i < N;i++) {
			ans += Math.min(A[i],B[i]);
			ans += Math.min(A[i+1], B[i] - Math.min(A[i],B[i]));
		}
		System.out.println(ans);
	}
}