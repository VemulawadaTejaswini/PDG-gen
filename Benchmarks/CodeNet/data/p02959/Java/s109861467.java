import java.util.Scanner;

public class A003Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N+1];
		long[] B = new long[N];
		for(int i = 0; i < N+1; i++) A[i]=sc.nextLong();
		for(int i = 0; i < N; i++) B[i]=sc.nextLong();
		sc.close();
      
		long ans = 0;
      	for(int i = 0; i < N; i++){
			long d1 = Math.min(A[i], B[i]);
			ans += d1;
			A[i] -= d1;
			B[i] -= d1;
			long d2 = Math.min(A[i+1], B[i]);
			ans += d2;
			A[i+1] -= d2;
			B[i] -= d2;
		}
		System.out.println(ans);
	}
}