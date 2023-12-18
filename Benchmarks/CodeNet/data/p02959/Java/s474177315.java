import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] A = new long[N+1];
		for (int i = 0; i < N+1; i++) {
			A[i] = sc.nextLong();
		}
		
		long[] B = new long[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		
		long ans = 0;
		for (int i = 0; i < B.length; i++) {
			long t = B[i];
			
			long i1 = A[i];
			long i2 = A[i+1];
			
			if (t >= i1) {
				t -= i1;
				ans += i1;
			} else {
				ans += t;
				continue;
			}
			
			if (t >= i2) {
				t -= i2;
				ans += i2;
				A[i+1] = 0;
			} else {
				ans += t;
				A[i+1] -= t;
			}
			
		}
		
		System.out.println(ans);
		
	}
	
}

