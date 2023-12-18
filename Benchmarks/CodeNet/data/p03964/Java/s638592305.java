import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		long[] A = new long[N];

		
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
			A[i] = sc.nextLong();
		}
		
		long t = T[0];
		long a = A[0];
		long max = (long) Math.pow(10, 18);
		
		for(int i = 1; i < N; i++) {
			loop:
			for(long j = 0; j <= max; j++) {
				for(long k = 0; k <= max; k++) {
					if(A[i] * (t + j) == T[i] * (a + k)) {
						t += j;
						a += k;
						break loop;
					} else if(A[i] * (t + j) < T[i] * (a + k)) {
						break;
					}
				}
			}
		}
		System.out.println(t + a);
	}
}
