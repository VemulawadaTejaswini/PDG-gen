import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		Arrays.sort(A);
		
		int gcd = A[0];
		for(int i=1; i<N; i++)
			gcd = gcd(gcd, A[i]);
		
		System.out.println(A[0]<=K && K<=A[N-1] && K%gcd==0 ? "POSSIBLE" : "IMPOSSIBLE");

		sc.close();
	}
	
	static int gcd(int a, int b) {
		return a==0 ? b : gcd(b%a, a);
	}
}
