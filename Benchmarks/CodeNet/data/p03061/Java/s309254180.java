import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int L[] = new int[N];
		L[0] = A[0];
		for(int i = 1; i < N; i++) {
			L[i] = gcd(L[i - 1], A[i]);
		}
		
		int R[] = new int[N];
		R[N - 1] = A[N - 1];
		for(int i = N - 2; i >= 0; i--) {
			R[i] = gcd(R[i + 1], A[i]);
		}
		
		int ans = Math.max(L[N - 1], Math.max(R[1], L[N - 2]));
		for(int i = 0; i < N - 2; i++) {
			ans = Math.max(ans, gcd(L[i], R[i + 2]));
		}
		System.out.println(ans);
	}
	
	static int gcd (int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}
}
